package it.develhope.javadoc1;

public class WordGames {

    public void addHelloWord(String word){
        System.out.println("---------------------");
        System.out.printf("\tHello %s%n", word);
        System.out.println("---------------------\n");
    }

    public void getFullName(String name, String surname){
        System.out.println("\n--------------------------");
        System.out.printf("\t%s %s%n", name, surname);
        System.out.println("--------------------------\n");
    }
}