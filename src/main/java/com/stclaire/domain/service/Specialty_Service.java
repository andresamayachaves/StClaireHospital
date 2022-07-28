package com.stclaire.domain.service;

import com.stclaire.domain.model.AttributeCategory;

public class Specialty_Service {
    public static void verifyLimits(AttributeCategory category, String input) {
        boolean inLimits = false;
        if (category == AttributeCategory.PERSON_NAME) {
            if(isBetween(input.length(), 10, 45)) inLimits = true;

        } else if (category == AttributeCategory.SPECIALTY_NAME) {
            if(isBetween(input.length(), 5, 100)) inLimits = true;
        }
        else if(category == AttributeCategory.AGE && isInteger(input)){
            if(Integer.parseInt(input)>0) inLimits = true;
        }
    }

    private static boolean isBetween(int verify, int lowerLimit, int upperLimit){
        boolean ans = false;
        if(verify>=lowerLimit && verify<=upperLimit) ans = true;
        return ans;
    }

    public static boolean isInteger(String strNum) {
        boolean ans = true;

        if (strNum == null) ans = false;

        try {
            Integer i = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            ans = false;
        }
        return ans;
    }

}
