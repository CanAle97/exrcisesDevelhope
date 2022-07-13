# Exercise: generics-wildcards-1
* define a class `Student` that has:
  * 3 attributes:
    * a `String studentName`
    * a `String studentSurname`
    * a `double marksAverage`
  * a constructor method that takes 3 params (`name`, `surname`, `average`) and assign the values to the right attributes
  * a `static` method `getAverageMark()` that:
    * accepts as parameter a `listOfMarks`, where the `List` has an **upper bound wildcard** related to `Number` for relaxing the restriction so that:
      * the `listOfMarks` can be a `List` of integers or double
    * calculates the average using:
      * `listOfMarks.get(0).doubleValue()` to get the first value from the list
      * `listOfMarks.get(1).doubleValue()` to get the second value from the list
      * the arithmetic summation operator and the arithmetic division operator
    * returns the average value as `double`
  * an override of the `toString()` method that returns a `String` with all the `Student` attributes
* considering that:
  * there are two types of marks for the students:
    * a `List` of 2 `Double` elements for **individual marks**
    * a `List` of 2 `Integer` elements for **project marks**
  * `Lisa Stuart` has a `List` called `individualMarksListLisa` of **individual marks**
  * `Jeremy Green` has a `List` called `projectMarksListJeremy` of **project marks**
* define a testing class with a method `main()` where you:
  * create the `individualMarksListLisa` list
  * add two random double values to the list using the `.add()` built-in method of the `List`
  * create the `projectMarksListJeremy` list
  * add two random int values to the list using the `.add()` built-in method of the `List`
  * calculate (using the static method `Student.getAverageMark()`) the marks average double values for `lisaAvg` and `jeremyAvg`
  * create a `listOfStudents`
  * add the two new `Student` objects (Lisa and Jeremy) to the list, using the `add()` method and the `Student`'s constructor
  * print in console the details of the two `Student`s inside the `listOfStudents` using:
    * the override method
    * the `get()` built-in method from `List`
