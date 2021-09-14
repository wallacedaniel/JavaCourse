package com.company;

public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(-3,2,12));
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2,2,11));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal){

        if(bigCount < 0 || smallCount < 0 || goal < 0 || bigCount * 5 + smallCount < goal) {
            return false;
        }

        int sum = 0;

        for (int i = 0; i < bigCount; i++) {
            sum += 5;
            if (sum == goal) {
                return true;
            } else if (sum > goal) {
                sum -= 5;
                break;
            }
        }

        for (int i = 0; i < smallCount; i++) {
            sum += 1;
            if (sum == goal) {
                return true;
            }
        }
        return false;
    }
}
