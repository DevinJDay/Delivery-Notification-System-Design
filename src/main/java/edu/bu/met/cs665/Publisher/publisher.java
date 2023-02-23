/*
 * Name: Jie Dai
 * Course: cs665 Software Designs & Patterns
 * Date: 02/23/2023
 * File name: publisher.java
 * Description: This is the class of delivery requests.
 */
package edu.bu.met.cs665.Publisher;

import edu.bu.met.cs665.Subscribers.*;

public interface publisher {

    void subscribe(subscriber o);

    void unsubscribe(subscriber o);

    void notifyDriver();

}
