package com.Package;

   //*
   //**
   //***
   //****
   //*****


public class Pattern {
    void right(){
        int a,b;
        for (a =0; a <=5; a++) // r-line
        {
           for(b = 0; b<=a;b++){ //c
                System.out.print("*");

            }
        System.out.println( );

        }

    }

    public static void main(String[] args) {
        Pattern plus = new Pattern();
        plus.right();


    }
}

