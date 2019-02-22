package ru.oiuno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.oiuno.eventlogger.Event;
import ru.oiuno.eventlogger.EventLogger;

public class App {
    private Client client;
    private EventLogger eventLogger;

    public App() {
    }

    public App(Client client, EventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        App app = (App)context.getBean("app");
        app.logEvent((Event)context.getBean("event"));
        app.logEvent((Event)context.getBean("event"));
        app.logEvent((Event)context.getBean("event"));

        context.close();

    }

    private void logEvent(Event event){
        eventLogger.logEvent(event);
    }
}
