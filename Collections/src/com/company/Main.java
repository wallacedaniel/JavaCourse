package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Baghdad", 8, 12);
        // shallow copy
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);

        seatCopy.get(1).reserve();
        if(theatre.reserveSeat("A02")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, this seat is taken");
        }

        Collections.reverse(seatCopy);
        System.out.println("printing seatCopy");
        printList(seatCopy);
        System.out.println("printing theatre.seats");
        printList(theatre.seats);
        Collections.shuffle(seatCopy);
        System.out.println("printing shuffled seatCopy");
        printList(seatCopy);

        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min seat is " + minSeat.getSeatNumber());
        System.out.println("Max seat is " + maxSeat.getSeatNumber());
    }

    public static void printList(List<Theatre.Seat> list) {
        for(Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("===============");
    }
}
