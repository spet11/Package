package com.Package;


    public class Value {
        int  Maths;
        int English;
        int total = Maths ;

        public static void main(String[] args) {
            Value Va = new Value();
            Va.Maths=  67;
            Va.English=80;


            System.out.println("Maths ="+ Va.Maths);
            System.out.println("english="+ Va.English);
            System.out.println("-------------------");
            System.out.println( "Total=" +   (Va.English+Va.Maths));


        }
    }

