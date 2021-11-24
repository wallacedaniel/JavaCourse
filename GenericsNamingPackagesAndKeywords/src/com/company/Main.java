package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a number");
//        X x = new X(scanner.nextInt());
//        x.x();

        X x = new X(new Scanner(System.in));
        x.x();


        MyWindow myWindow = new MyWindow("New Window");
        myWindow.setVisible(true);

	    FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> teamAwesome = new Team<>("Team Awesome");
        teamAwesome.addPlayer(joe);

        Team<BaseballPlayer> teamDreadful = new Team<>("Team Dreadful");
        teamDreadful.addPlayer(pat);

        Team<BaseballPlayer> anotherTeam = new Team<>("Another Team");

        System.out.println(teamAwesome.numPlayers());

        teamDreadful.matchResult(anotherTeam, 10, 20);
        teamDreadful.matchResult(anotherTeam, 5, 2);
        teamDreadful.matchResult(anotherTeam, 4, 12);
        anotherTeam.matchResult(teamDreadful, 5, 15);
        anotherTeam.matchResult(teamDreadful, 15, 22);
        anotherTeam.matchResult(teamDreadful, 12, 20);

        System.out.println("Rankings");
        System.out.println(teamAwesome.getName()  + ": " +  teamAwesome.ranking());
        System.out.println(teamDreadful.getName()  + ": " +  teamDreadful.ranking());
        System.out.println(anotherTeam.getName()  + ": " +  anotherTeam.ranking());

        System.out.println(teamDreadful.compareTo(anotherTeam));
        System.out.println(anotherTeam.compareTo(teamDreadful));




    }
}
