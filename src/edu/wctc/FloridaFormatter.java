package edu.wctc;

public class FloridaFormatter implements DriversLicenseFormatter {
    @Override
    public String formatLicenseNumber(DriversLicense Object driversLicense){
        return (Object.getSSSS()+ "-"+ Object.getFFF()+ Object.getYY()/*tried to split here*/+"-"+ Object.getDDD()+"-"+ Object.getNN());
    }
}
