package lecturadearchivo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class LecturaDeArchivos {

    public static void main(String[] args) throws IOException {

        RandomAccessFile archivo01 = new RandomAccessFile("C:\\Users\\andre\\OneDrive\\Escritorio\\archivo.txt", "r");

        FileChannel canal01 = archivo01.getChannel();

        ByteBuffer buffer01 = ByteBuffer.allocate(500);

        while (canal01.read(buffer01) > 0) {
            buffer01.flip();

            while (buffer01.hasRemaining()) {

                System.out.println((char) buffer01.get());

            }

        }

        archivo01.close();

    }

}
