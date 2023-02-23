package edu.bu.met.cs665;
import edu.bu.met.cs665.Publishers.*;
import edu.bu.met.cs665.Subscribers.*;
/**
 * This is the Test class.
 * It has an instance of Shop, a Delivery Request, and 5 Driver objects.
 * The shop broadcasts a single Delivery Request and send notifications to all Drivers
 * regarding the delivery.
 */

public class Test {

    public Test() {
    }

    @org.junit.Test
    public void testDelivery() {

        shop tatte = new shop();
        deliveryRequest flatWhite = new deliveryRequest(1, "Flat White", "Devin", "725 Commonwealth Ave");
        tatte.setLatestRequest(flatWhite);

        driver Alex = new scooterDriver("Alex");
        driver Bob = new scooterDriver("Bob");
        driver Claudia = new taxiDriver("Claudia");
        driver David = new taxiDriver("David");
        driver Eason = new vanDriver("Eason");

        tatte.subscribe(Alex);
        tatte.subscribe(Bob);
        tatte.subscribe(Claudia);
        tatte.subscribe(David);
        tatte.subscribe(Eason);

        tatte.notifyDriver();

    }










}
