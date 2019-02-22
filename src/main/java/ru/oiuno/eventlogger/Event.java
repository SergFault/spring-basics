package ru.oiuno.eventlogger;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.util.Date;

public class Event {
    private int id;
    private Date date;
    private String message;
    private DateFormat df;

    public Event(Date date, DateFormat df) {
        this.date = date;
        id = (int)(Math.random()*1000);
        this.df=df;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", date=" + df.format(date) +
                ", message='" + message + '\'' +
                '}'+"\n";
    }
}
