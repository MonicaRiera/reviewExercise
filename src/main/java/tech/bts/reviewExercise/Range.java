package tech.bts.reviewExercise;

import java.util.ArrayList;
import java.util.List;

public class Range {
    
    private int firstNumber;
    private int lastNumber;

    public Range(int firstNumber, int lastNumber) {
        this.firstNumber = firstNumber;
        this.lastNumber = lastNumber;
    }
    
    public void printRange() {
        for (int i = this.firstNumber; i <= this.lastNumber; i++) {
            System.out.println(i);
        }
    }

    public List<Integer> getRangeList() {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = this.firstNumber; i <= this.lastNumber; i++) {
            result.add(i);
        }
        return result;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(int lastNumber) {
        this.lastNumber = lastNumber;
    }
}
