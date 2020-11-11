package com.nowcent;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

/**
 * @author orangeboy
 * @version 1.0
 * @date 2020/11/11 23:36
 */
public class Application {
    public static void main(String[] args) {
        //11-20
        try {
            new com.nowcent.T11_20.SomeClass();
        } catch (IOException e) {
            System.out.print("T11-20:" + e + "\n");
        }

        //11-21
        try {
            System.out.print("T11-21:");
            com.nowcent.T11_21.SomeClass.someMethod();
        } catch (FileAlreadyExistsException | FileNotFoundException e) {
            System.out.println(e);
        }

        //11-22
        try {
            System.out.print("T11-22:");
            com.nowcent.T11_22.SomeClass.someMethod();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }


    }
}
