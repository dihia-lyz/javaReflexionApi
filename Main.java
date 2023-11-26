import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Reflexion test ...");

            Class classe = Class.forName("User");

            //get the constructor
            Constructor constr = classe.getConstructor(String.class, String.class, String.class);

            //create new objet
            Object obj = constr.newInstance("John", "Doe", "Londres");

            //call method getFirstName
            Method getFirstName = classe.getMethod("getFirstName");
            String firstname = (String) getFirstName.invoke(obj);
            System.out.println("user firstname is " + firstname);

            //call methode toString
            Method toStringMethod = classe.getMethod("toString");
            String userString = (String) toStringMethod.invoke(obj);
            System.out.println("user data are \n" + userString);

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
