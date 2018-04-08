package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class KangarooProblem {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }


    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (x1==x2) return "yes";
        if ((x1 < x2 && v1 < v2) || (x2< x1 && v2 <1)){
            return "no";
        }
        if (Math.abs(x1-x2) > Math.abs(v1-v2)){
            return "no";
        }
        return "yes";
    }
}