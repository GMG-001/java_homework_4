package hashMapFiltering;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMap {
    //ლისტის შექმნა და პარამეტრების გადაცემა
    public static List<Animal> testExample(){
        Animal animal1 =new Animal("ჯოი",50);
        Animal animal2 =new Animal("ჯერი",20);
        Animal animal3 =new Animal("როკი",19);
        Animal animal4 =new Animal("ლედი",21);
        Animal animal5 =new Animal("რექსი",25);
        Animal animal6 =new Animal("დაგი",30);
        Animal animal7 =new Animal("დურუ",15);

        List<Animal> animals = Arrays.asList(animal1, animal2, animal3, animal4, animal5, animal6, animal7);
        return animals;
    }

    //ლისტის მონაცემების გაფილტვრა
    public static void lambdaMethod(){
        List<Animal> animals = testExample();

        List<Animal> largeSizeAnimal = animals
                .stream()
                .filter(Animal :: LargeSizeAnimal)
                .collect(Collectors.toList());

        System.out.println("animals name whose weight > 20kg");
        largeSizeAnimal.forEach(
                (animal) -> System.out.println(animal.getName())
        );
    }

    //HashMap-ის შექმან და მონაცემების შეყვანა გაფილტვრა method reference-ით
    public static void hashMapFilter() {
        Map<String, Integer> animals = new java.util.HashMap<>();
        animals.put("ჯერი", 50);
        animals.put("ჯოი", 20);
        animals.put("როკი", 19);
        animals.put("ლედი", 21);
        animals.put("რექსი", 25);
        animals.put("დაგი", 30);
        animals.put("დურუ", 15);

        Map<String, Integer> largeSizeAnimals = animals.entrySet().stream()
                .filter(HashMap :: largeSizeAnimal)
                .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));

        largeSizeAnimals.forEach(
                (key, value) -> System.out.printf("სახელი: %s, წონა: %dკგ, \n", key, value)
        );


    }

    //method reference-სათვის საჭირო მეთოდი
    public static boolean largeSizeAnimal(Map.Entry<String, Integer> entry) {
        return entry.getValue() > 20;
    }
}
