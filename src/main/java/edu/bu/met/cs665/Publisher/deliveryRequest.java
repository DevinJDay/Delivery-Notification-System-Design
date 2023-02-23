/*
 * Name: Jie Dai
 * Course: cs665 Software Designs & Patterns
 * Date: 02/23/2023
 * File name: deliveryRequest.java
 * Description: This is the class of delivery requests.
 */
package edu.bu.met.cs665.Publisher;
/**
 * This is the deliveryRequest class, which contains information of what is going to be delivered and where it is going.
 */
public class deliveryRequest {

    private String newOrder; //what it is and where it is going
    public String getNewOrder() {
        return newOrder;
    }

    public deliveryRequest(String newOrder){
        this.newOrder = newOrder;
    }


}
