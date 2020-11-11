package com.chelsea;

/*Create a method that will take a string as a parameter and will perform the math required and return the integer result.
example 1:
input: "5 + 7" | Output: 12
example 2:
input: "8 x 2" | Output 16

requirements:
can accept 2 integers and one operator.
can handle the following operators: "+" "-" "/" "x" "%" (extra challenge allow both * and X for multiplication as well)*/

import java.util.Arrays;

public class algoChallenge {

    public static void solveEquation(String equation) {
        String[] splitString = equation.split(" ");
        //System.out.println(Arrays.toString(splitString));
        String operator = splitString[1];
        //System.out.println(operator);
        String firstStr = splitString[0];
        int firstNum = Integer.parseInt(firstStr);
        //System.out.println("first num: " + firstNum);
        String lastStr = splitString[2];
        int secondNum = Integer.parseInt(lastStr);
        //System.out.println("second num: "+ secondNum);

        if (operator.equals("x") || operator.equals("X") || operator.equals("*")) {
            int totalProduct = firstNum * secondNum;
            System.out.println(totalProduct);
        } else if (operator.equals("-")) {
            int totalDifference = firstNum - secondNum;
            System.out.println(totalDifference);
        } else if (operator.equals("/")) {
            float totalQuotient = (float) firstNum / secondNum;
            System.out.println(totalQuotient);
        } else if (operator.equals("%")) {
            int totalRemainder = firstNum % secondNum;
            System.out.println(totalRemainder);
        } else if (operator.equals("+")) {
            int totalSum = firstNum + secondNum;
            System.out.println(totalSum);
        } else {
            System.out.println("invalid operator! try again");
        }

    }
}