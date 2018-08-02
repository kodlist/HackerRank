package com.hackerrank.algorthims.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by mkoduri on 8/2/2018.
 */


public class CompareTriplets {

    static int[] alice = new int[3];
    static int[] bob = new int[3];
    static Scanner sc = new Scanner(System.in) ;

    public static int recursiveValue()
    {
        return sc.nextInt();
    }

    public static int[] fillAliceArray()
    {
        for(int i = 0; i < alice.length ; i++)
        {
            int x = recursiveValue();
            while(x < 1 || x > 100)
            {
                x = recursiveValue();
            }
            alice[i] = x;
            //System.out.print( alice[i] + " ");

        }
        return alice;
    }
    public static int[] fillBobsArray()
    {
        for(int j = 0; j < bob.length ; j++)
        {
            int y = recursiveValue();
            while(y < 1 || y > 100)
            {
                y = recursiveValue();
            }
            bob[j] = y;
            //System.out.print( bob[j] + " ");
        }
        return bob;
    }
    public static  int[] compareTriplets(int a[], int b[])
    {
        int aliceCount =0;
        int bobCount = 0;

        for(int i = 0; i < 3 ; i++)
        {
            if( a[i]  == b[i])
            {

            }else if( a[i] <  b[i])
            {
                bobCount++;
            }else{
                aliceCount++;
            }
        }
         int returnOutput[] ={aliceCount, bobCount};
        return returnOutput;

    }

    public static void main(String[] args) {


        int alice[] =  fillAliceArray();
        int bob[] = fillBobsArray();



        int count [] = compareTriplets(alice , bob);
        System.out.println("");
        for ( int i: count             ) {
            System.out.print(  i + " ");

        }

        sc.close();
    }

}
