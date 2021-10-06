package com.company;

public class Song {

    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String toSting() {
        return "title: duration";
    }
}


//
//                -  toString(), Songs overriding toString method. Returns a String in the following format: "title: duration"
//
//        TIP:  In Album, use the findSong() method in addSong() and addToPlayList(String, LinkedList) to check if a song exists before proceeding.
//
//        TIP:  Be extremely careful with the spelling of the names of the fields, constructors and methods.
//
//        TIP:  Be extremely careful about spaces and spelling in the returned String from the toString() method.
//
//        NOTE:  All fields are private.
//
//        NOTE:  All constructors are public.
//
//        NOTE:  All methods are public (except for findSong() which is private).
//
//        NOTE:  There are no static members.
//
//        NOTE:  Do not add a main method to the solution code.
//
//        NOTE:  If you get an error from the Evaluate class, it's most likely the constructor. Check if you've added a constructor or if the constructor has the right arguments.
//
