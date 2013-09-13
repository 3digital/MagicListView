package com.delta.magiclistview;

/**
 * Created by spawrks on 8/15/13.
 */
public class ZipCode{


    public int zipCodeNumber;

    public ZipCode (int startZipCode)
    {
        zipCodeNumber = startZipCode;
    }

    public int getZipCodeNumber() {
        return zipCodeNumber;
    }
    public String getZipCodeNumberAsString() {

        String zipCodeAsString;
        zipCodeAsString = String.valueOf(zipCodeNumber);
        return zipCodeAsString;
    }

    public void setZipCodeNumber(int zipCodeNumber) {
        this.zipCodeNumber = zipCodeNumber;
    }

}
