package edu.wctc;
import org.apache.commons.codec.language.Soundex;

public class LastNameUtility {
    private soundex soundex;


    public String encodeLastName(String lastName) throws Exception {
        MissingNameException exception = new MissingNameException(lastName);
        String upException = exception.toString();
        if (lastName == null){
            throw new Exception(upException);
            return lastName;
        }
    }
}
