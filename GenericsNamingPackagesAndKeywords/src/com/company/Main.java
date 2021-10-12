package com.company;

public class Main {

    public static void main(String[] args) {
	    FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> myTeam = new Team<>("Awesome Team");
        myTeam.addPlayer(joe);
//        myTeam.addPlayer(pat);
//        myTeam.addPlayer(beckham);
        System.out.println(myTeam.numPlayers());

        Team<BaseballPlayer> myTeam2 = new Team<>("OK Team");
        myTeam2.addPlayer(pat);
        System.out.println(myTeam2.numPlayers());
    }
}
