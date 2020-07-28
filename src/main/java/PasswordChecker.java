import java.util.logging.FileHandler.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.*;
public class PasswordChecker {
    private static final Logger logger = LogManager.getLogger(PasswordChecker.class.getName());

    public static void main(String[] args) {

        String password = "!12DWEgjdjkbvks";

        try {
            passwordIsValid(password);
        }catch(Exception e){
            logger.error(e);
        }
        try {
            if(passwordIsOk(password)!=false  ){
                logger.debug("User password is ok");
                System.out.println("User password is ok");
            }
        }catch(Exception e){
            System.out.println(e);
            logger.debug("User password is not ok");
            System.out.println("User password is not ok");
        }
        try {
            passwordIsNeverOk(password);
        }catch(Exception e){
            System.out.println(e);
        }


    }
    public static void passwordIsValid(String password) throws Exception {
        int check = 0;
        String msg="hello";

            if (password.isEmpty()) {
                msg = "password should exist";
                throw new Exception(msg);
            } else {
                check += 1;
            }

            if (password.length() < 8) {
                msg = "password should be longer than than 8 characters";
                throw new Exception(msg);
            } else {
                check += 1;
            }

            if (password.matches(".*[a-z].*")) {
                check += 1;
            } else {
                msg = "password should have at least one lowercase letter";
                System.out.println(msg);
            }

            if (password.matches(".*[A-Z].*")) {
                check += 1;
            } else {
                msg = "password should have at least one uppercase letter";
                System.out.println(msg);
            }

            if (password.matches(".*[0-9].*")) {
                check += 1;
            } else
                System.out.println("password should at least have one digit");

            if (password.matches(".*[!@#$%^*.,/:;?].*")) {
                check += 1;
            } else {
                System.out.println("password should have at least one special character");
            }

            if (check > 5) {
                msg = "Password is valid";
                System.out.println(msg);
            }
        logger.debug(msg);
        }

    public static boolean passwordIsOk(String password) throws Exception {
        Boolean msg;

            if(password.isEmpty() || password.length() <8 || password.matches(".*[a-z].*")!= true ){
                throw new Exception(String.valueOf(msg = false));
            }
            else {
                msg = true;
            }

        logger.debug(msg);
        return msg;
    }

    public static String passwordIsNeverOk(String password) throws Exception {
        String msg = "";
        if (password.isEmpty() || password.length() <= 8) {
            msg = "Password is not okay";
            throw new Exception(msg);
        }
        else {msg = "Password is Okay";}
        System.out.println(msg);
        logger.debug(msg);
        return msg;
    }
   }