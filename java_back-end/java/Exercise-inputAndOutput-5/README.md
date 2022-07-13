# Exercise: input-and-output-5
* add the following import at the beginning of your program: `import java.util.Scanner`
* create a class called `PrintYourAgeFromInput`
* inside the `main` method place the following lines of code:
```
Scanner input = new Scanner(System.in);         // create a new Scanner

// task 1: remove this comment and write one line of code here     

int age = input.nextInt();                      // read the integer number input from user

// task 2: remove this comment and write one line of code here

input.close();                                  // close the scanner (do not read anymore the user input)
```
* **task 1**: remove the comment and print in console `Enter your age: `
* **task 2**: remove the comment and print in console `Your age is: ` using the `%f` *converter* for printing the `age` variable's value
* the expected output will be divided in 3 steps:
  * `Enter your age: ` and the Java program waits for the *user input* (that is your input)
  * then, you write down your age directly in the console (e.g. `25`): `Enter your age: 25`
  * the Java program takes your input with the Scanner and prints your age: `Your age is: 25`
* so the final expected output will be something like this:
```
Enter your age: 25
Your age is: 25
```
