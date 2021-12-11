package arrayListFiltering;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class ArrayList {
    //ArrayList შექმნა და გაფილტვრა lambda expression-ით
    public static void arrayListFilter() {
        java.util.ArrayList<String> names = new java.util.ArrayList<>();
        names.add("giorgi");
        names.add("mixeili");
        names.add("natia");
        names.add("mariami");
        names.add("ia");

        List<String> customersNameLengthFilter = names
                .stream()
                .filter(c -> c.length() > 5)
                .collect(Collectors.toList());

        customersNameLengthFilter.forEach(
                (name) -> System.out.printf("სახელი: %s,\n", name)
        );
    }


        //ლისტის შექმნა და პარამეტრების გადაცემა
    public static List<Customer> arrayList(){
        Customer person1 = new Customer("გიორგი");
        Customer person2 = new Customer("მერაბი");
        Customer person3 = new Customer("ნათია");
        Customer person4 = new Customer("ზურა");
        Customer person5 = new Customer("გია");
        Customer person6 = new Customer("ხათუნა");
        Customer person7 = new Customer("მიხეილი");

        List<Customer> customers = Arrays.asList(person1, person2, person3, person4, person5, person6, person7);
        return customers;

    }
    //ლისტის მონაცემების გაფილტვრა
    public static void lambdaMethod(){
        List<Customer> customers = arrayList();

        List<Customer> customersNameLengthFilter = customers
                .stream()
                .filter(c -> c.getName().length() > 5)
                .collect(Collectors.toList());

        System.out.println("Customers name length > 5");
        customersNameLengthFilter.forEach(
                (customer) -> System.out.println(customer.getName())
        );
    }
}
