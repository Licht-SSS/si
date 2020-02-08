/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;

/**
 *
 * @author licht
 */
public class Diary {

    Calendar cal = Calendar.getInstance();

    public Diary() {

    }

    public void copy() {
        try {
            String driveletter = "C:\\";
            String in = "in";
            String source = "template";
            String extension = ".txt";

            String out = "out";
            String target = (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.DATE);

            Diary diary = new Diary();
            Path sourcePath = diary.link(driveletter, in, source, extension);
            Path destinationPath = diary.link(driveletter, out, target, extension);

            if (isFileNotExists(destinationPath)) {
                Files.copy(sourcePath, destinationPath);
            }
            System.out.println("finish copy");

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    private Path link(String driveletter, String follder, String temp, String extension) {
        return Paths.get(driveletter, follder, temp + extension);
    }

    private boolean isFileNotExists(Path path) {
        return !path.toFile().exists();
    }

}
