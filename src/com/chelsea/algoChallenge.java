package com.chelsea;

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

//        if (operator.equals("x") || operator.equals("X") || operator.equals("*")) {
//            int totalProduct = firstNum * secondNum;
//            System.out.println(totalProduct);
//        } else if (operator.equals("-")) {
//            int totalDifference = firstNum - secondNum;
//            System.out.println(totalDifference);
//        } else if (operator.equals("/")) {
//            float totalQuotient = (float) firstNum / secondNum;
//            System.out.println(totalQuotient);
//        } else if (operator.equals("%")) {
//            int totalRemainder = firstNum % secondNum;
//            System.out.println(totalRemainder);
//        } else if (operator.equals("+")) {
//            int totalSum = firstNum + secondNum;
//            System.out.println(totalSum);
//        } else {
//            System.out.println("invalid operator! try again");
//        }

        //alternative to long if else statement... is a long switch case statement...
        switch (operator) {
            case "x": case "X": case "*":
                int totalProduct = firstNum * secondNum;
                System.out.println(totalProduct);
                break;
            case "+":
                int totalSum = firstNum + secondNum;
                System.out.println(totalSum);
                break;
            case "-":
                int totalDifference = firstNum - secondNum;
                System.out.println(totalDifference);
                break;
            case "/":
                float totalQuotient = (float) firstNum / secondNum;
                System.out.println(totalQuotient);
                break;
            case "%":
                int totalRemainder = firstNum % secondNum;
                System.out.println(totalRemainder);
                break;
            default:
                System.out.println("invalid operator! try again");
        }
    }
}
