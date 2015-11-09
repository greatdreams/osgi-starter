package com.greatdreams.osgi.demo.producer.impl;

import com.greatdreams.osgi.demo.producer.RequestResponseApi;

/**
 * Created by greatdreams on 11/8/15.
 */
public class RequestResponseService implements RequestResponseApi {

    @Override
    public String getResponse(String request) {
        return ("You called the service with " + request);
    }
}
