package com.example.shppyad14.Departure;

import java.util.Date;

public class Departure {
    private String type;
    private Date departureDate;

    public Departure(String type, Date departureDate) {
        this.type = type;
        this.departureDate = departureDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }
}
