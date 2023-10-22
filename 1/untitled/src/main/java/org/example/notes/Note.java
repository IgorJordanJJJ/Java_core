package org.example.notes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Note {
    private String content;
    private Date timestamp;

    public Note(String content) {
        this.content = content;
        this.timestamp = new Date();
    }

    public String getFormattedTimestamp() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        return sdf.format(timestamp);
    }

    public String getContent() {
        return content;
    }
}
