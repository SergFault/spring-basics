package ru.oiuno.eventlogger;

import java.util.ArrayList;
import java.util.List;

public class CachedFileEventLogger extends FileEventLogger {
    List<Event> cache = new ArrayList<Event>();
    int cacheSize;

    public CachedFileEventLogger(String string, int cacheSize) {
        super(string);
        this.cacheSize= cacheSize;
    }

    @Override
    public void logEvent(Event event){
        cache.add(event);
        if (cache.size()>=cacheSize){
            writeCache();
            cache.clear();
        }
    }


    public void writeCache(){
        for (Event e: cache){
            super.logEvent(e);
        }
    }

    private void destroy(){
        if (cache.size()>0){writeCache();}
    }


}
