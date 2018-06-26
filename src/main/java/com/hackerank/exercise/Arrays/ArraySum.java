package com.hackerank.exercise.Arrays;

import java.io.*;
import java.util.Scanner;

/**
 * Created by mkoduri on 6/26/2018.
 *
 *
 *Given an array of integers, find the sum of its elements.

 Input Format

 The first line contains an integer, , denoting the size of the array.
 The second line contains  space-separated integers representing the array's elements.

 Output Format

 Print the sum of the array's elements as a single integer.
 *
 */
public class ArraySum {

    private static int sumOfArray;
    static  int simpleArraySum(int[] arr)
    {
        System.out.println("=============");
        for (int i: arr            ) {
            //System.out.print(i + " ");
            sumOfArray = sumOfArray + i ;        }
        return sumOfArray;
    }

    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
       // System.out.println(size);
        int [] arr = new int[size];

        for(int i = 0; i < arr.length; i++)
        {
            arr[i]  = sc.nextInt();
        }

        int sum = simpleArraySum(arr);
        System.out.println(sum);






    }
}
