package io.izaan;
import java.sql.SQLOutput;
import java.util.AbstractList;

public class AbcdBank {

    int numberOfAtms = 200;
    // instance variable

    String hillsideAtmID = "QHIL-A210";
    // class variable
    // if a field (variable,method) defined as static to access that field
    //using the class name of that object.

    static String astoriaAtmID = "QAST - A211";

    public AbcdBank() {

        System.out.println("i am the default constructor at AbcdBank");
    }

    public void getTotalCashCountOnAtm() {
        int balance = 2000;

        // select balance from ATM where ATM-ID = hillsideAtmID;
        System.out.println("ATM ID: " + hillsideAtmID + "Balance: " + balance);
    }

}
