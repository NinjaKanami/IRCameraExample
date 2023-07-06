package org.example;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.highgui.HighGui;
import org.opencv.imgproc.Imgproc;
import org.opencv.videoio.VideoCapture;

/**
 * @BelongsProject: IRWebcamExample
 * @BelongsPackage: org.example
 * @Author: Zhou
 * @CreateTime: 2023-06-27  15:25
 * @Description: TODO
 * @Version: 1.0
 */
public class IRCameraApp {
    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public static void main(String[] args) {
        // 使用默认摄像头，如果你有多个摄像头，可以尝试更改摄像头索引
        int cameraIndex = 1;
        VideoCapture capture = new VideoCapture();

        if (!capture.open(cameraIndex)) {
            System.out.println("无法打开摄像头");
            System.exit(0);
        }

        Mat frame = new Mat();
        while (true) {
            capture.read(frame);

            if (frame.empty()) {
                break;
            }

            // 对图像进行处理，例如调整大小
            Mat resizedFrame = new Mat();
            Imgproc.resize(frame, resizedFrame, new Size(640, 480));

            // 显示图像
            HighGui.imshow("IR Camera", resizedFrame);

            // 按下'q'键退出循环
            if (HighGui.waitKey(30) == 'q') {
                break;
            }
        }

        capture.release();
        HighGui.destroyAllWindows();
    }
}
