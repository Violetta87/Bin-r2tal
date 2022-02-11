package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //write code here
        // udskriv programs funktion til skærm.
        System.out.println("omregner til binærtal til decimal tal");
        //opret et objekt af scanner.
        Scanner scan = new Scanner(System.in);//det input vi giver konstrukteren er det stream scanneren læser fra.
        //skriv til skærmen at bruger skal indtaste binært tal'
        System.out.println("Indtast venligt bin tal");
        String num = scan.next();
        double result= 0;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < num.length(); ++i) {

            int newNum= Integer.parseInt(String.valueOf(num.charAt(i)));
                list.add(newNum);

        }

        for(int i=0; i <list.size(); i++){
             result= result + Math.pow(2,i) *list.get(i);

        }

           System.out.print((int)result);
    }
}