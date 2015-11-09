package com.greatdreams.osgi.demo.producer.impl;

import com.greatdreams.osgi.demo.producer.RequestResponseApi;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

/**
 * Created by greatdreams on 11/8/15.
 */
public class ProducerActivator  implements BundleActivator{

    RequestResponseApi requestResponse = new RequestResponseService();
    ServiceRegistration registration;
    @Override
    public void start(BundleContext context) throws Exception {
        registration = context.registerService(RequestResponseApi.class.getName(), requestResponse, null);
        System.out.println(RequestResponseApi.class.getName());
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        registration.unregister();
    }
}
