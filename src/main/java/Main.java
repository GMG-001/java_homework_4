import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger= LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        try {
            ArrayList.arrayList();
            logger.debug("code run sucssesfuly");
        } catch (Exception ex) {
            //შეცდომის დალოგვა
            System.out.println(ex.getMessage());
            logger.error("Error during run code", ex);
        }
    }
}
