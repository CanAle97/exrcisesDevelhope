# Exercise: generics-wildcards-2
* define a `GenericsClass` using the [diamond operator](https://www.baeldung.com/java-diamond-operator) `<T>` that has:
  * a private attribute `t` of type `T`
  * a public method `getT()` method (with no parameters) that returns the current instance's `t`
  * a public method `setT()` method that:
    * takes a `T` parameter called `valueToSet`
    * assign the parameter's value to the current instance's `t`
  * a public static generics method `isEqual()` that:
    * takes two generics parameters in input:
      * a `GenericsClass` gc1
      * a `GenericsClass` gc2
    * uses Java's [Object `equals` operator](https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#equals(java.lang.Object)) and the `getT()` method to understand if the two `Object` are equal:
      * please note that the `equals()` operator has the following syntax: `object1.equals(object2)`
    * returns a `boolean` (`true` if the two objects are equals, `false` if the two objects are not equals)
* define a testing class with a `main()` method where you:
  * create 4 new `GenericsClass` objects where `T` is:
    * `Integer` for `firstElement` and `secondElement`
    * `String` for `thirdElement` and `fourthElement`
  * assign the following object-value using the `setT()` method:
    * `firstElement` will have an int value `12`
    * `secondElement` will have an int value `13`
    * `thirdElement` and `fourthElement` will have the same String value `"This is a string"`
  * call the static method `isEqual()` for answering the following two comparisons (and notify the user):
    * first element is equal to second element?
    * third element is equal to fourth element?
