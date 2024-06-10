package DZ5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class ArrayNine {
    private static int array[] = {0, 1, 2, 3, 0, 1, 2, 3, 0};
    private static Path path = Paths.get("src/main/resources/3bite.out") ;


    public static void outStream() {

        try (FileOutputStream fos = new FileOutputStream(path.toString())) {
            for (int b = 0; b < 3; b++) {
                byte byt = 0;
                for (int j = 0; j < 3; j++) {
                    byt += (byte) (array[3 * b + j] << (j * 2));
                }
                fos.write(byt);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



