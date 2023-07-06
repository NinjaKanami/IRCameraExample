package org.example;

import org.bytedeco.javacv.CanvasFrame;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.FrameGrabber;
import org.bytedeco.javacv.OpenCVFrameGrabber;
import org.junit.Test;

import javax.swing.*;
public class Opencv {
    @Test
    public void testCamera() throws InterruptedException, FrameGrabber.Exception {
        OpenCVFrameGrabber grabber = new OpenCVFrameGrabber(1);
        grabber.start();   //开始获取摄像头数据
        CanvasFrame canvas = new CanvasFrame("摄像头窗口");//新建一个窗口
        canvas.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        canvas.setAlwaysOnTop(true);
        while (true) {
            Frame frame = grabber.grab();
            canvas.showImage(frame);    //获取摄像头图像并放到窗口上显示， 这里的Frame frame=grabber.grab(); frame是一帧视频图像
            Thread.sleep(1);    //50毫秒刷新一次图像
        }
    }

    @Test
    public void someOpenCVTest() {
        System.out.printf("java.library.path: %s%n",
                System.getProperty("java.library.path"));
        System.loadLibrary("opencv_java451");
    }
}
