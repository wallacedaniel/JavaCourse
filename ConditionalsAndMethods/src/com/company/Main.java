package com.company;

public class Main {

    public static void main(String[] args) {

//        calculateScore(true, 800, 5, 100);
//        int finalScore = calculateScore(true, 10000, 8, 200);
//        System.out.println("Your final score is " + finalScore);

//        int scorePosition = calculateHighScorePosition(1500);
//        displayHighScorePosition("Larry", scorePosition);
//        scorePosition = calculateHighScorePosition(900);
//        displayHighScorePosition("Curly", scorePosition);
//        scorePosition = calculateHighScorePosition(400);
//        displayHighScorePosition("Moe", scorePosition);
//        scorePosition = calculateHighScorePosition(50);
//        displayHighScorePosition("Jennifer", scorePosition);

    }

    //1 inch = 2.54 cm
    public static int calcFeetAndInchesToCentimeters(int feet, int inches) {

        if (feet <= 0 || inches <= 0 || inches >= 12) return -1;

    }

    public static int calcFeetAndInchesToCentimeters(int inches) {

        if (inches <= 0 || inches >= 12) return -1;

    }




    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static int calculateHighScorePosition(int score){

        int position  = 4;

        if(score >= 1000){
            position = 1;
        } else if (score >= 500){
            position = 2;
        } else if (score >= 100){
            position = 3;
        }
        return position;
    }

    public static void displayHighScorePosition(String playerName, int position){

        System.out.println(playerName + " is in position " + position);
    }
}
