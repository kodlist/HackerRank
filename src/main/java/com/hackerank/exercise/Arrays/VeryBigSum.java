package com.hackerank.exercise.Arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


/**
 * Created by mkoduri on 7/12/2018.
 */
public class VeryBigSum {



        public static void main(String[] args) throws IOException {

            Scanner scanner = new Scanner(System.in);
            int arrLen = scanner.nextInt();

            while(arrLen <=0 && arrLen>10)
            {
                System.out.println("print value greater or equal to 1 and less than equal to 10.");
                arrLen = scanner.nextInt();
            }
            long arr[] = new long[arrLen];


            long result = 0;
            for(int i = 0; i<arrLen ; i++)
            {
                arr[i] = scanner.nextLong();
                result = result+arr[i];
            }
            System.out.println(result);
            scanner.close();
        }


}
