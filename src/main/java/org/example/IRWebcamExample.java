package org.example;

import com.github.sarxos.webcam.Webcam;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 使用Webcam库调用红外摄像头
 */
public class IRWebcamExample {

    public static void main(String[] args) throws IOException {
        // 获取默认的红外摄像头
        Webcam webcam = Webcam.getDefault();
        // 设置分辨率为640x480
        webcam.setViewSize(new Dimension(640, 480));
        // 打开摄像头
        webcam.open();
        // 获取图像并保存为PNG文件
        BufferedImage image = webcam.getImage();
        ImageIO.write(image, "PNG", new File("ir_image.png"));
        // 关闭摄像头
        webcam.close();
    }
}
