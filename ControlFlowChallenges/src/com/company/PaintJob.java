package com.company;

public class PaintJob {
    public static void main(String[] args) {

        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));

        // -1 since the width parameter is invalid
        // 3 since the wall area is 7.14, a single bucket can cover an area of 1.5 and Bob has 2 extra buckets home.
        // 3 since the wall area is 8.9375, a single bucket can cover an area of 2.5 and Bob has 1 extra bucket at home.

        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(2.75, 3.25, 2.5));

        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));
        // 3
        // 3
        // 5

    }

    public static int getBucketCount(double area, double areaPerBucket){


        // Math.ceil
        return -1; //getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){

        // Math.ceil
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }

        //Math.ceil
        return 1; // number of buckets
    }


}


//
//
//        This method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work.
//        To calculate the bucket count, refer to the notes below.
//
//        If one of the parameters width, height or areaPerBucket is less or equal to 0,
//        the method needs to return -1 to indicate an invalid value.
//
//        If all parameters are valid, the method needs to calculate the number of buckets and return it.
//
//
//
//
//
//
//        3. In some cases, Bob does not know the width and height of the wall but he knows the area of a wall. He needs you to write another method.
//
//        Write another overloaded method named getBucketCount with 2 parameters namely, area and areaPerBucket (both of type double).
//
//        The method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work. To calculate the bucket count, refer to the notes below.
//
//        If one of the parameters area or areaPerBucket is less or equal to 0, the method needs to return -1to indicate an invalid value.
//
//        If all parameters are valid, the method needs to calculate the number of buckets and return it.
//
//
//
//
//
//        NOTE: Use the method Math.ceil to round the number of calculated buckets (double) then convert it into an int before returning the value from the methods.
