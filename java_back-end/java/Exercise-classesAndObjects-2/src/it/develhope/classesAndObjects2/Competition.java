package it.develhope.classesAndObjects2;

public class Competition {
    public static void main(String args[]){
        System.out.println("Start - main");

        CompetitionRules.getInstance();

        Team teamA = new Team();
        teamA.teamName = "alfa";

        teamA.p1.name = "Mario";
        teamA.p1.programmingLanguage = "Java";
        teamA.p1.yearsOfExperience = 3;

        teamA.p2.name = "Sara";
        teamA.p2.programmingLanguage = "Java";
        teamA.p2.yearsOfExperience = 5;

        Team teamB = new Team();
        teamB.teamName = "beta";

        teamB.p1.name = "Alessandro";
        teamB.p1.programmingLanguage = "NodeJs";
        teamB.p1.yearsOfExperience = 4;

        teamB.p2.name = "Erika";
        teamB.p2.programmingLanguage = "NodeJs";
        teamB.p2.yearsOfExperience = 3;

        teamA.printDetails();
        System.out.println("-------------------------------------------------------\n");

        teamB.printDetails();
        System.out.println("-------------------------------------------------------");
    }
}