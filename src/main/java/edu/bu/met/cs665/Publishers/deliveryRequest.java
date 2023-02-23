/*
 * Name: Jie Dai
 * Course: cs665 Software Designs & Patterns
 * Date: 02/23/2023
 * File name: deliveryRequest.java
 * Description: This is the class of delivery requests.
 */

package edu.bu.met.cs665.Publishers;

/**
 * This is the deliveryRequest class, which contains delivery information of item, number, customer and location.
 */
public class deliveryRequest {

    private String item;
    private int number;
    private String customer;
    private String location;
    private String orderInfo;

    public String getOrderInfo() {
        return orderInfo;
    }
    public deliveryRequest(String orderInfo){
        this.orderInfo = orderInfo;
    }

    public deliveryRequest(int number, String item, String customer, String location){
        this.item = item;
        this.number = number;
        this.customer = customer;
        this.location = location;
        this.orderInfo = number + " " + item + " for " + customer + " to " + location;
    }


}
