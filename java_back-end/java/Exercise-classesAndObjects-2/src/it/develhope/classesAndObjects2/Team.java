package it.develhope.classesAndObjects2;

public class Team {

    public String teamName;

    public Programmer p1 = new Programmer();

    public Programmer p2 = new Programmer();

    public void printDetails(){
        System.out.println(teamName + "\n");
        p1.printProgrammerDetails();
        System.out.println("\n");
        p2.printProgrammerDetails();
    }
}