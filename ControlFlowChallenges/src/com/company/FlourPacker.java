package com.company;

public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
    }
    // big: 5  small: 1
    public static boolean canPack(int bigCount, int smallCount, int goal){

        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int bigCountKilos = 5 * bigCount;


        return true;
    }
}
