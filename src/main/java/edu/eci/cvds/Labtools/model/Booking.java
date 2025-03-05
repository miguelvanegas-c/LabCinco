package edu.eci.cvds.Labtools.model;

import lombok.Data;

@Data
public class Booking {

    private String bookingId;
    private int day;
    private int timeLine;
    private User user;
    private Lab lab;


}
