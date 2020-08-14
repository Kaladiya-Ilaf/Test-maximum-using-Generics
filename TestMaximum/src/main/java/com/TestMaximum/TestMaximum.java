package com.TestMaximum;

public class TestMaximum<E extends Comparable<E>> {
    E value1;
    E value2;
    E value3;

    TestMaximum(){

    }
    TestMaximum(E value1, E value2, E value3){
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public E findMaximum(){
        return findMaximumValue(value1, value2, value3);
    }

    public <E extends Comparable> E findMaximumValue(E value1, E value2, E value3){
        if (value1.compareTo(value2) > 0 && value1.compareTo(value3) > 0){
            return value1;
        }
        else if (value2.compareTo(value3) > 0){
            return value2;
        }
        else {
            return value3;
        }

    }
}
