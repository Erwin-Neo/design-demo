package com.kyle.design.flyweight.jdk.string;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description :
 */
public class StringCase {

    public static void main(String[] args) {
        String s1 = "Erwin";
        String s2 = "Erwin";
        System.out.println("s1 == s2 ? : " + (s1 == s2));

        String s3 = "Er" + "win";
        System.out.println("s1 == s3 ? : " + (s1 == s3));

        String s4 = "Er" + new String("win");
        System.out.println("s1 == s4 ? : " + (s1 == s4));

        String s5 = new String("Erwin");
        String s6 = s5.intern();
        String s7 = "E";
        String s8 = "rwin";
        String s9 = s7 + s8;

        System.out.println("s1 == s9 ? : " + (s1 == s9));
        System.out.println("s4 == s5 ? : " + (s4 == s5));
        System.out.println("s1 == s6 ? : " + (s1 == s6));
    }
}
