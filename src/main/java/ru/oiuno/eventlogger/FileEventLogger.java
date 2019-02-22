package ru.oiuno.eventlogger;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileEventLogger implements EventLogger{
    private String file;

    public FileEventLogger(String string) {
        this.file = string;
    }

    private void init() throws IOException {
        if (!new File(file).canWrite()) {throw new IOException("File unavailable");}
    }

    public void logEvent(Event event) {
        try {
            FileUtils.writeStringToFile(new File(file), event.toString(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
