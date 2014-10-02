package com.drabelo.holocalc;


/**
 * Created by dailtonrabelo on 6/28/13.
 */

import java.util.ArrayList;


public class Calculator {

    ArrayList<Double> holdsNum = new ArrayList<Double>();
    boolean sum1 = false;
    boolean divide1 = false;
    boolean multiply1 = false;
    boolean subtract1 = false;
    boolean power1 = false;

    public Calculator() {
        // default constructor
    }

    public void add(double num) {
        holdsNum.add(num);
    }

    public double sum() {
        sum1 = true;
        double result = holdsNum.get(0);
        for (int i = 0; i <= holdsNum.size() - 2; i++)
            result += holdsNum.get(i + 1);
        return result;
    }

    public double subtract() {
        subtract1 = true;
        double result = holdsNum.get(0);
        for (int i = 0; i <= holdsNum.size() - 2; i++)
            result -= holdsNum.get(i+1);
        return result;
    }

    public double multiply() {
        multiply1 = true;
        double result = holdsNum.get(0);
        for (int i = 0; i <= holdsNum.size() - 2; i++)
            result *= holdsNum.get(i + 1);
        return result;
    }

    public double divide() {
        divide1 = true;
        double result = holdsNum.get(0);
        for (int i = 0; i <= holdsNum.size() - 2; i++)
            result /= holdsNum.get(i + 1);
        return result;
    }

    public double power(){
        double result = 0;
        try{
            power1 = true;
            double first = holdsNum.get(0);
            double second = holdsNum.get(1);
            result = Math.pow(first, second);
        }
        catch(Exception e){
            System.out.println("Exception: because power method needs both numbers to work, click on another number to create Y");
        }
        return result;
    }



    public void muteAll(){
        sum1 = false;
        divide1 = false;
        multiply1 = false;
        subtract1 = false;
        power1 = false;
    }

    public double equals() {
        double result = 0;
        if (sum1 == true)
            result = sum();
        else if(divide1 == true)
            result = divide();
        else if(multiply1 == true)
            result = multiply();
        else if(subtract1 == true)
            result = subtract();
        else if(power1 == true)
            result = power();

        else{
            result = 0;
        }
        muteAll();
        holdsNum.clear();
        return result;

    }

}
