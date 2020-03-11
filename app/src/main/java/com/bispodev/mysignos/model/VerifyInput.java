package com.bispodev.mysignos.model;

import android.widget.EditText;

import java.util.ArrayList;

public class VerifyInput {

    ArrayList<Integer> month30 = new ArrayList<>();
    ArrayList<Integer> month31 = new ArrayList<>();

    public void fillMonth30(){
        for (int i = 1; i <= 30; i++){
            if(i%2 == 0){
                month30.add(i);
            }
        }
    }

    public void fillMonth31(){
        for (int i = 1; i <= 31; i++){
            if(i%2 != 0){
                month30.add(i);
            }
        }
    }

    public boolean verify(int day, int month){
        int typeMonth;

        if(month == 2){
            typeMonth = 2;
        }else if(month30.equals(month)){
           typeMonth = 30;
       }else if(month31.equals(month)){
           typeMonth = 31;
       }
        return false;

   }
}
