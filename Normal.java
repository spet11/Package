package com;

public class Normal {
    int stu_id;
    String name ;
    String course;

    public static void main(String[] args) {
        Normal no = new Normal();
        no.stu_id=001;
        no.name="Tester";
        no.course="Software Tester";

        System.out.println("stu_id" + no.stu_id);
        System.out.println("name" + no.name);
        System.out.println("course" + no.course);


    }


}
