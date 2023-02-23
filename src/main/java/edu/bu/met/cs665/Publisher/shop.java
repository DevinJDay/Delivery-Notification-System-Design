package edu.bu.met.cs665.Publisher;

import edu.bu.met.cs665.Subscribers.*;

import java.util.ArrayList;

public class shop implements publisher{

    private deliveryRequest latestRequest;
    public String getLatestRequest() {
        return latestRequest.getNewOrder();
    }
    public void setLatestRequest(String newRequest) {
        this.latestRequest = new deliveryRequest(newRequest);
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
