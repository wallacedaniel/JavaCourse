package com.company;

public class PaintJob {
    public static void main(String[] args) {

//        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
//        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
//        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));

        // -1 since the width parameter is invalid
        // 3 since the wall area is 7.14, a single bucket can cover an area of 1.5 and Bob has 2 extra buckets home.
        // 3 since the wall area is 8.9375, a single bucket can cover an area of 2.5 and Bob has 1 extra bucket at home.

        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));

//        System.out.println(getBucketCount(3.4, 1.5));
//        System.out.println(getBucketCount(6.26, 2.2));
//        System.out.println(getBucketCount(3.26, 0.75));
        // 3
        // 3
        // 5

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }

        double area = width * height;
        int bucketsNeeded = (int) Math.ceil(area / areaPerBucket);
        bucketsNeeded -= extraBuckets;

        return bucketsNeeded;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){

        if (width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }

        double area = width * height;
        return (int) Math.ceil(area / areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket){

        if (area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        return (int) Math.ceil(area / areaPerBucket);
    }
}

