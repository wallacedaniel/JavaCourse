package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Mars");
        addInOrder(placesToVisit, "Earth");
        addInOrder(placesToVisit, "Mercury");
        addInOrder(placesToVisit, "Venus");
        addInOrder(placesToVisit, "Pluto");
        addInOrder(placesToVisit, "Saturn");
        addInOrder(placesToVisit, "Jupiter");
        addInOrder(placesToVisit, "Neptune");
        addInOrder(placesToVisit, "Uranus");

        printList(placesToVisit);

        addInOrder(placesToVisit, "Titan");
        addInOrder(placesToVisit, "Uranus");

        printList(placesToVisit);
        visit(placesToVisit);

//        placesToVisit.add("Mars");
//        placesToVisit.add("Earth");
//        placesToVisit.add("Mercury");
//        placesToVisit.add("Venus");
//        placesToVisit.add("Pluto");
//        placesToVisit.add("Saturn");
//        placesToVisit.add("Jupiter");
//        placesToVisit.add("Neptune");
//        placesToVisit.add("Uranus");
//
//        printList(placesToVisit);
//
//        placesToVisit.add(1, "Titan");
//        printList(placesToVisit);
//
//        placesToVisit.remove(4);
//        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();

        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {

        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0) {
                System.out.println(newCity + " is already listed as a destination");
                return false;
            } else if(comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if(comparison < 0) {

            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()) {
            System.out.println("No cities in the itenerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            System.out.println(action);
            switch(action) {
                case 0:
                    System.out.println("Vacation Over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                   if(listIterator.hasNext()) {
                       System.out.println("Now visiting " + listIterator.next());
                   } else {
                       System.out.println("Reached the end of the list");
                       goingForward = false;
                   }
                   break;
                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("At the beginning of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }
}
