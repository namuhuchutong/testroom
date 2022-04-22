package me.peppermill.testroom.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ManageObject {

    public static void main(String[] args) {
        ManageObject manageObject = new ManageObject();

        String fullPath = "serial.obj";
        SerialDTO dto = new SerialDTO("hello", 1, true, 100);
//        manageObject.saveObject(fullPath, dto);
        manageObject.loadObject(fullPath);
    }

    private void saveObject(String fullPath, SerialDTO dto) {
        try (FileOutputStream fos = new FileOutputStream(fullPath);
             ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(dto);
            System.out.println("End");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadObject(String fullPath) {
        try (FileInputStream fileInputStream = new FileInputStream(fullPath);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            Object obj = objectInputStream.readObject();
            SerialDTO dto = (SerialDTO) obj;
            System.out.println(dto);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
