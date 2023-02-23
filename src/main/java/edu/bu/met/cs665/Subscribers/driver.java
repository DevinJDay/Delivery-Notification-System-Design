package edu.bu.met.cs665.Subscribers;

import edu.bu.met.cs665.Publisher.*;

public class driver implements subscriber{
    private String name;
    public String getName() {
        return name;
    }
    public driver(String name){
        this.name = name;
    }

    private deliveryRequest latestRequest;
    public String getLatestRequest() {
        return latestRequest.getNewOrder();
    }
    @Override
    public void update(String message) {
        this.latestRequest = new deliveryRequest(message);
        System.out.println("Hey " + this.getName() + ", you have a new delivery request of " + this.getLatestRequest());
    }




}
