package com.nowcent.T11_21;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

/**
 * @author orangeboy
 * @version 1.0
 * @date 2020/11/11 23:39
 */
public class SomeClass {
    public static void someMethod() throws FileAlreadyExistsException, FileNotFoundException {
        someMethod2();
        throw new FileAlreadyExistsException(null);
    }

    private static void someMethod2() throws FileNotFoundException{
        throw new FileNotFoundException();
    }
}
