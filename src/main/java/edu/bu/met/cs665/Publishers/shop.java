/*
 * Name: Jie Dai
 * Course: cs665 Software Designs & Patterns
 * Date: 02/23/2023
 * File name: shop.java
 * Description: This is the shop class.
 */

package edu.bu.met.cs665.Publishers;

import edu.bu.met.cs665.Subscribers.*;
import java.util.ArrayList;

/**
 * This is the shop class implementing the publisher interface.
 * It has the latest delivery request, a list of drivers
 * and the 3 methods from publisher interface to subscribe, unsubscribe and notify drivers.
 */
public class shop implements publisher{

    private deliveryRequest latestRequest;
    public String getLatestRequest() {
        return latestRequest.getOrderInfo();
    }
    public void setLatestRequest(deliveryRequest latestRequest) {
        this.latestRequest = latestRequest;
    }


    private ArrayList<subscriber> driverList = new ArrayList<subscriber>();

    @Override
    public void subscribe(subscriber o) {
        driverList.add(o);
    }

    @Override
    public void unsubscribe(subscriber o) {
        driverList.remove(o);
    }

    @Override
    public void notifyDriver() {
        for (subscriber o : driverList){
            o.update(this.getLatestRequest());
        }

    }

}
