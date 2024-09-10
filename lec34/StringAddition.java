package lec34;

import java.sql.SQLOutput;

public class StringAddition {
    public static void main(String[] args) {
        String s1 = "Chitkara";
        String s2 = "University";

        String s3 = s1 + s2;
        String s4 = s1.concat(s2);

        System.out.println(s3);
        System.out.println(s4);

        String s5 = s3 + "G10";
        String s6 = "G10" + " G9";

        System.out.println("Hello" + 4 + 2 + "G10");
        System.out.println(4 + 10 + "Hello" + "G10");
        System.out.println("Hello" + (4 + 2) + "G10");


    }



}
