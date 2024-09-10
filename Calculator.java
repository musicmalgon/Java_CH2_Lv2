package hw3;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Double> resList = new ArrayList<Double>();
    double result = 0;
    public ArrayList calculate(String operator, int firstNumber, int secondNumber) {
        if (operator.equals("+")) {
            result = firstNumber + secondNumber;
        }else if (operator.equals("-")) {
            result = firstNumber - secondNumber;
        }else if (operator.equals("*")) {
            result = firstNumber * secondNumber;
        }else if (operator.equals("/")) {
            result = (double) firstNumber / secondNumber;
        }
        resList.add(result);
        return resList;
    }

    public ArrayList<Double> getResList() {
        return resList;
    }
    public void setResList(ArrayList<Double> resList) {
        this.resList = resList;
    }

    public void removeResult(){
        resList.remove(0);
    }
}
