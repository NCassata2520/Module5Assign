package edu.wctc;

public class UnknownGenderCodeException extends Exception{
    public UnknownGenderCodeException(char genderCode){
        super("Gender code is not known");

    }
}
