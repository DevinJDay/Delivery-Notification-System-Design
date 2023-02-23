/*
 * Name: Jie Dai
 * Course: cs665 Software Designs & Patterns
 * Date: 02/23/2023
 * File name: subscriber.java
 * Description: This is the subscribe interface.
 */

package edu.bu.met.cs665.Subscribers;

/**
 * This is the subscriber interface.
 * 1 abstract method to update the delivery request message
 */
public interface subscriber {
    void update(String message);
}
