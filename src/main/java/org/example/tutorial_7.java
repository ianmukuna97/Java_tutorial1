package org.example;

public class tutorial_7 {
    public static void main(String[] args){
        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7

        String Firstname= "John";
        String Lastname= "Doe";
        System.out.println(Firstname + " " + Lastname); // Concatenation (combining two strings)

        int x = 5;
        int y = 6;
        int z = x + y;
        System.out.println(z);

        String a = "10";
        String b = "20";
        String c = a + "" + b;  // c will be 1020 (a String)
        System.out.println(c);

        String text = "We are the so-called \"Vikings\" from the north.";
        System.out.println(text);

        String word = "We are the so-called \nVikings from the north.";
        System.out.println(word);



    }
}
