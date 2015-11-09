package com.greatdreams.osgi.demo.consumer;

import com.greatdreams.osgi.demo.producer.RequestResponseApi;

import java.util.Timer;

/**
 * Created by greatdreams on 11/8/15.
 */
public class SimpleResponseConsumer {
    private RequestResponseApi request;

    public void init() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new ConsoleResponder(request), 500l, 5000l);
    }

    public void setRequest(RequestResponseApi request) {
        this.request = request;
    }
}
