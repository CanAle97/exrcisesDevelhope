package it.develhope.defaultMethodsOverride;

/**
 * define a tester class with `main()` method where you:
 *    * create 4 new `SmartphonePrice` objects: 2 for `Producer` and 2 for `Retail`
 *    * create 2 new `Smartphone` objects, using the 4 newly created `SmartphonePrice` objects
 *    * print in console all the details of the 2 newly created `Smartphone` objects
 *    * check if the first smartphone is equal to the second smartphone, informing the user
 *    * use a `try{ ... } catch(Exception exception) { ... }` to:
 *      * get a new `Smartphone` object by cloning the second `Smartphone`
 *      * print in console all the details of the newly cloned object
 *      * check if the second smartphone is equal to the newly cloned object, informing the user
 *      * inside the `catch(Exception exception) { ... } ` scope:
 *        * print the [stack trace](https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html#printStackTrace()) of the exception
 *        * inform the user about the error
 *
 * @author Alessandro Canulli
 */

public class Tester {

    public static void main(String[] args) {

        SmartphonePrice producer = new SmartphonePrice("Producer", 112.532);
        SmartphonePrice producer1 = new SmartphonePrice("Producer1", 361.534);
        SmartphonePrice retail = new SmartphonePrice("Retail", 1386.57);
        SmartphonePrice retail1 = new SmartphonePrice("Retail1", 3684.32);

        Smartphone smartphone = new Smartphone("FutureTech", "T9000", 2350, producer, retail);
        Smartphone smartphone1 = new Smartphone("FutureTech", "T9000Plus", 3800, producer1, retail1);

        System.out.println(smartphone);
        System.out.println(smartphone1);

        boolean out = smartphone.equals(smartphone1);
        System.out.println("\n----------------------------------------------------------------------\n" +
                "\n\tIs smartphone equals to smartphone1? " + out +
                "\n\n----------------------------------------------------------------------\n");

        try {
           Smartphone clonedSmartphone = smartphone1.clone();

           System.out.println(clonedSmartphone.toString());

           boolean out1 = smartphone1.equals(clonedSmartphone);
           System.out.println("\n----------------------------------------------------------------------\n" +
                   "\n\tIs smartphone1 equals to clonedSmartphone? " + out1 +
                   "\n\n----------------------------------------------------------------------\n");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERROR");
        }
    }
}
