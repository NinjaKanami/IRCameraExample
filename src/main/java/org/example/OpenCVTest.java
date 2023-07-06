package org.example;

import org.junit.Test;

/**
 * @BelongsProject: IRWebcamExample
 * @BelongsPackage: org.example
 * @Author: Zhou
 * @CreateTime: 2023-06-27  15:43
 * @Description: TODO
 * @Version: 1.0
 */
public class OpenCVTest {
    @Test
    public void someOpenCVTest() {
        System.out.printf("java.library.path: %s%n",
                System.getProperty("java.library.path"));
        System.loadLibrary("opencv_java451");
    }
}
