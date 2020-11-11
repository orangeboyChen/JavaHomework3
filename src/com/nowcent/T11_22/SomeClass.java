package com.nowcent.T11_22;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

/**
 * @author orangeboy
 * @version 1.0
 * @date 2020/11/11 23:46
 */
public class SomeClass {
    public static void someMethod() throws FileNotFoundException {
        try {
            someMethod1();
        } catch (FileAlreadyExistsException e) {
            e.printStackTrace();
        }
    }

    private static void someMethod1() throws FileAlreadyExistsException, FileNotFoundException {
        throw new FileAlreadyExistsException(null);
    }

    private static void someMethod2() throws FileNotFoundException{
        throw new FileNotFoundException();
    }}
