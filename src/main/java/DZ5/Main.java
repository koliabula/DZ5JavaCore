package DZ5;

//Написать функцию, создающую резервную копию всех файлов
//в директории(без поддиректорий) во вновь созданную папку ./backup

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BackupFilesDir.listDir();
        ArrayNine.outStream();
    }

}
