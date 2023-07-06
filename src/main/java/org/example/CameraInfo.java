package org.example;

import org.opencv.core.Core;


public class CameraInfo {
    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    /*public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        int cameraCount = VideoCapture.getNumberOfCameras();
        System.out.println("Number of cameras: " + cameraCount);
    }*/

    /*public static void main(String[] args) {
        int numberOfCameras = Camera.getNumberOfCameras();
        System.out.println("Number of cameras: " + numberOfCameras);
        // 获取设备上摄像头的数量
        int cameraCount = VideoCapture.getNumberOfCameras();
        System.out.println("设备上的摄像头数量：" + cameraCount);

        for (int cameraIndex = 0; cameraIndex < cameraCount; cameraIndex++) {
            VideoCapture capture = new VideoCapture();

            if (!capture.open(cameraIndex)) {
                System.out.println("无法打开摄像头 " + cameraIndex);
                continue;
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
                HighGui.imshow("IR Camera " + String.valueOf(cameraIndex), resizedFrame);

                // 按下'q'键退出循环
                if (HighGui.waitKey(30) == 'q') {
                    break;
                }
            }

            capture.release();
            HighGui.destroyAllWindows();
        }
    }*/
}
