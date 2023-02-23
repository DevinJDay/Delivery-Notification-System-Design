/*
 * Name: Jie Dai
 * Course: cs665 Software Designs & Patterns
 * Date: 02/23/2023
 * File name: publisher.java
 * Description: This is the publish interface.
 */

package edu.bu.met.cs665.Publishers;

import edu.bu.met.cs665.Subscribers.*;

/**
 * This is the publisher interface.
 * 3 abstract methods:
 * - subscribe
 * - unsubscribe
 * - notifyDriver
 */
public interface publisher {

    void subscribe(subscriber o);

    void unsubscribe(subscriber o);

    void notifyDriver();

}
