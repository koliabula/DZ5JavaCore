package DZ5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

//Написать функцию, создающую резервную копию всех файлов
//в директории(без поддиректорий) во вновь созданную папку ./backup

public class BackupFilesDir {

    public static void listDir() throws IOException {
        int count = 0;
        File path = new File(new File(".").getCanonicalPath());
        File[] dir = path.listFiles();

        if(!Files.isDirectory(Path.of("./backup"))) {
            Files.createDirectory(Path.of("./backup"));
        }

        for (int i = 0; i < dir.length; i++) {
            if (dir[i].isDirectory()) continue;

            try {
                Files.copy(dir[i].toPath(), Path.of("./backup/" + dir[i].toPath().getFileName()), REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }

}
