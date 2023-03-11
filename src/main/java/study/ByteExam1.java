package study;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam1 {

    public static void main(String[] args) {

        FileInputStream fileIn = null;
        FileOutputStream fileOut = null;

        try {

            fileIn = new FileInputStream("src/java/study/ByteExam1.java");
            fileOut = new FileOutputStream("byte.txt");

            int readData = -1;
            // 음수의 경우 맨 좌측 비트가 1이 됨.
            // 읽어들일 것이 있다면 항상 양수를 리턴

            while((readData = fileIn.read()) != -1) {
                fileOut.write(readData);
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            // I/O Stream instance는 반드시 사용 후 제거 메모리
            try {
                fileOut.close();
                fileIn.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
