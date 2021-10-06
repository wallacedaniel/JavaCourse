package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public  boolean addSong(String title, double duration) {
        return false;
    }

//    public  Song addSong(String title) {
//
//    }

    public  boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        return false;
    }

    public  boolean addToPlayList(String title, LinkedList<Song> playList) {
        return false;
    }
}


//    -  A constructor that accepts two Strings (name of the album and artist). It initialises the fields and instantiates songs.
//
//    -  And three methods, they are:
//
//        -  addSong()  Returns true if the song was added successfully or false otherwise.
//
//        -  addSong(). Returns the Song if it exists, null if it doesn't exists.
//
//        -  addToPlayList(),returns a boolean. Returns true if it exists and it was added successfully using the track number, or false otherwise.
//
//        -  addToPlayList(), returns a boolean. Returns true if it exists and it was added successfully using the name of the song, or false otherwise.
//
