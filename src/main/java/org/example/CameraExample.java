package org.example;

public class CameraExample {
   /* public static void main(String[] args) {
        // 获取摄像头设备
        CaptureDeviceInfo cameraDevice = null;
        CaptureDeviceManager manager = CaptureDeviceManager.getDeviceManager();
        CaptureDeviceInfo[] devices = manager.getDeviceList(null);

        // 查找视频设备
        for (CaptureDeviceInfo device : devices) {
            Format[] formats = device.getFormats();
            for (Format format : formats) {
                if (format instanceof VideoFormat) {
                    cameraDevice = device;
                    break;
                }
            }
            if (cameraDevice != null) {
                break;
            }
        }

        // 打开摄像头
        try {
            MediaLocator locator = cameraDevice.getLocator();
            Player player = Manager.createRealizedPlayer(locator);
            player.start();
            System.out.println("摄像头已打开");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}
