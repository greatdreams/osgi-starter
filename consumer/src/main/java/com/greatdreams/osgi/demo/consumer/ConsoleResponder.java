package com.greatdreams.osgi.demo.consumer;

import com.greatdreams.osgi.demo.producer.RequestResponseApi;

import java.util.TimerTask;

/**
 * Created by greatdreams on 11/8/15.
 */
public class ConsoleResponder extends TimerTask {

    private RequestResponseApi request;

    public  ConsoleResponder(RequestResponseApi request) {
        this.request = request;
    }
    @Override
    public void run() {
        System.out.println(request.getResponse("Time is " + System.currentTimeMillis() ));
    }
}
