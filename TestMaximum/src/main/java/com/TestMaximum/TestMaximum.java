package com.TestMaximum;

public class TestMaximum {

    public Integer findMaximumInteger( Integer intNum1, Integer intNum2, Integer intNum3) {

        if ((intNum1.compareTo(intNum2) > 0) && intNum1.compareTo(intNum3) > 0) {
            return intNum1;
        }
        else if (intNum2.compareTo(intNum3) > 0){
            return intNum2;
        }
        else {
            return intNum3;
        }
    }

    public Float findMaximumFloat( Float floatNum1, Float floatNum2, Float floatNum3) {

        if ((floatNum1.compareTo(floatNum2) > 0) && floatNum1.compareTo(floatNum3) > 0) {
            return floatNum1;
        }
        else if (floatNum2.compareTo(floatNum3) > 0){
            return floatNum2;
        }
        else {
            return floatNum3;
        }
    }
}
