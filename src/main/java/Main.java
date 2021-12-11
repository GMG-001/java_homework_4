import arrayListFiltering.ArrayList;
import hashMapFiltering.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger= LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        try {

            //HashMap და List ფილტრების გამოძახება
            ArrayList.arrayListFilter();
            ArrayList.lambdaMethod();
            HashMap.hashMapFilter();

            //სატესტო მეთოდის გამოძახება
            HashMap.lambdaMethod();

            //თუ კოდის გაშვებისას არ მოხდა შეცდომა ლოგირების ფაილში ჩაიწერება ტექსი "code run successfully"
            logger.debug("code run successfully");
        } catch (Exception ex) {
            //შეცდომის დალოგვა
            System.out.println(ex.getMessage());
            logger.error("Error during run code", ex);
        }
    }
}
