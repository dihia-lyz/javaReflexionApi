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

            //call methods
            Method getFirstName = classe.getMethod("getFirstName");
            String firstname = (String) getFirstName.invoke(obj);
            System.out.println("user firstname is " + firstname);

            //call methode toString
            String str = obj.toString();
            System.out.println(str);

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
