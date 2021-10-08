package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public  boolean addSong(String title, double duration) {

        if(findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

//    private Song findSong(String title) {
//        for (int i = 0; i < this.songs.size(); i++) {
//            Song song = this.songs.get(i);
//            if (song.getTitle().equals(title)) {
//                return song;
//            }
//        }
//        return null;
//    }

    private Song findSong(String title) {
        for (Song checkedSong: this.songs) {
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {

        findSong(playList.get(trackNumber).getTitle());

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
