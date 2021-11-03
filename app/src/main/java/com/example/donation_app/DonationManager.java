package com.example.donation_app;

import java.util.ArrayList;

public class DonationManager {
    ArrayList<Donation> listOfDonations = new ArrayList<>(0);

    public ArrayList<Donation> getListOfDonations() {
        return listOfDonations;
    }
    public void addNewDonation(Donation d) {
        listOfDonations.add(d);
    }
}
