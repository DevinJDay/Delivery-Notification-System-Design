/*
 * Name: Jie Dai
 * Course: cs665 Software Designs & Patterns
 * Date: 02/23/2023
 * File name: driver.java
 * Description: This is the driver class.
 */

package edu.bu.met.cs665.Subscribers;

import edu.bu.met.cs665.Publishers.*;

/**
 * This is the driver class implementing the subscriber interface.
 * It has the name of driver, the type of the vehicle, and the latest delivery request
 * It contains the update method from subscriber interface to receive updated delivery request
 */
public class driver implements subscriber{
    private String name;
    private String type;
    public String getName() {return this.name;}
    public String getType() {return this.type;}
    public driver(String name, String type){
        this.name = name;
        this.type = type;
    }

    private deliveryRequest latestRequest;
    public String getLatestRequest() {
        //System.out.println(this.name + " has a new delivery request: " + this.latestRequest.getOrderInfo());
        return latestRequest.getOrderInfo();
    }
    @Override
    public void update(String message) {
        this.latestRequest = new deliveryRequest(message);
        System.out.println("Hey " + this.getName() + ", you have a new delivery request: " + this.getLatestRequest());
    }




}
