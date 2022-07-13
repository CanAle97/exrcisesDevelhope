package it.develhope.classesAndObjects2;

/**
 public class CompetitionRules {

 private static String competitionRule1 = "Do not copy and paste from StackOverflow!";
 private static String competitionRule2 = "Learn every day!";
 private static String competitionRule3 = "Be the best team!";

 public static void printRules(){
 System.out.println("\n-----------------competitionRule1----------------------\n\n" + competitionRule1 + "\n-----------------competitionRule2----------------------\n\n" + competitionRule2 + "\n-----------------competitionRule3----------------------\n\n" + competitionRule3 + "\n-------------------------------------------------------\n\n");
 }
 }
 */

// singleton class
public class CompetitionRules {

    // static field containing its only instance
    private static CompetitionRules competitionRules = new CompetitionRules();

    private String competitionRule1 = "Do not copy and paste from StackOverflow!";
    private String competitionRule2 = "Learn every day!";
    private String competitionRule3 = "Be the best team!";

    // private constructor
    private CompetitionRules() {
    }

    // static method for returning the instance
    public static CompetitionRules getInstance() {
        return competitionRules;
    }

    // method for printing the private rules
    public void printRules() {
        System.out.println("Rule number 1: " + competitionRule1);
        System.out.println("Rule number 2: " + competitionRule2);
        System.out.println("Rule number 3: " + competitionRule3);
        System.out.println("---");
    }
}