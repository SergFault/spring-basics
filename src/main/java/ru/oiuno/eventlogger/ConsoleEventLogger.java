package ru.oiuno.eventlogger;

public class ConsoleEventLogger implements EventLogger {


    public void logEvent(Event event){
        System.out.println(event);
    }

    public ConsoleEventLogger() {
    }
}
