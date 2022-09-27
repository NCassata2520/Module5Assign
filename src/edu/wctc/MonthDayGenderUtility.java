package edu.wctc;

public class MonthDayGenderUtility implements DateV{
    private final int MOD_MALE = 0;
    private final int MOD_FEMALE = 500;
    private final char CODE_MALE = 'M';
    private final char CODE_FEMALE = 'F';



    public String encodeMonthDayGender(int year, int month, int day, char genderCode) throws java.lang.Exception {
        int genderModConstant = 0;
        int valid = 0;
        if(genderCode != CODE_FEMALE || genderCode != CODE_MALE){
            throw new java.lang.Exception("Unknown gender, please enter M or F");
        }
        else if (year != valid)
       return String.valueOf((month - 1) * 40 + day + genderModConstant);

        return null;
    }

}
