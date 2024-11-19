package it.unibo.mvc;

import java.io.File;
import java.nio.file.Files;
import java.io.IOException;

/**
 * Application controller. Performs the I/O.
 */
public class Controller {

    public static final String SEP = File.separator;
    public static final String FILE_NAME = System.getProperty("user.home") + SEP + "output.txt";

    private File file = new File(FILE_NAME);

    public void setFile(final File file) {
        this.file = file;
    }

    public File getFile() {
        return this.file;
    }

    public String getPath() {
        return file.toPath().toString();

    }

    public void writeonFile(final String string) {
        try {
            Files.writeString(file.toPath(), string);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
