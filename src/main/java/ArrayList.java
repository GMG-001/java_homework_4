import java.lang.invoke.LambdaMetafactory;

public class ArrayList {
    public static void arrayList(){
        java.util.ArrayList<String> names = new java.util.ArrayList<>();
        names.add("giorgi");
        names.add("mixeili");
        names.add("natia");
        names.add("mariami");
        names.add("ia");

        names.forEach(
                (element)->{
                    System.out.println("fd");
                    lambdaMethod(element);
                }
        );
    }
    public static void lambdaMethod(String var){
        System.out.printf("variable: %s", var);
    }
}
