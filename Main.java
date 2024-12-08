import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Writing to a file using BufferedOutputStream
            FileOutputStream fos = new FileOutputStream("example.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            String data = "Hello, Buffered World!";
            bos.write(data.getBytes());
            bos.close();

            // Reading from a file using BufferedInputStream
            FileInputStream fis = new FileInputStream("example.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int content;
            while ((content = bis.read()) != -1) {
                System.out.print((char) content);
            }
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 