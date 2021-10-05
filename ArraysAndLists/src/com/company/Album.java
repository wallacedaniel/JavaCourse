package com.company;

import java.util.ArrayList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public  boolean addSong(String title, double duration) {
        return false;
    }

    public  Song addSong(String title) {
        
    }

    public  boolean addToPlayList() {

    }

    public  boolean addToPlayList() {

    }
}


    -  A constructor that accepts two Strings (name of the album and artist). It initialises the fields and instantiates songs.

    -  And three methods, they are:

        -  addSong()  Returns true if the song was added successfully or false otherwise.

        -  addSong(). Returns the Song if it exists, null if it doesn't exists.

        -  addToPlayList(), has two parameters of type int (track number of song in album) and LinkedList (the playlist) that holds objects of type Song, and returns a boolean. Returns true if it exists and it was added successfully using the track number, or false otherwise.

        -  addToPlayList(), has two parameters of type String (title of song) and LinkedList (the playlist) that holds objects of type Song, and returns a boolean. Returns true if it exists and it was added successfully using the name of the song, or false otherwise.

