package com.kyle.design.decorator.iodecorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @date : 2021-05-08 18:23
 * @description :
 */
public class InputStreamTest {

    public static void main(String[] args) {
        int c;

        try {
            InputStream in = new LowerCaseInputStream(
                                    new BufferedInputStream(
                                            new FileInputStream("F:\\newpoint\\designpattern\\src\\com\\kyle\\design\\decorator\\iodecorator\\test.txt")));
            while ((c = in.read()) > 0) {
                System.out.print((char)c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
