package tech.bts.reviewExercise;

import java.util.ArrayList;
import java.util.List;

public class Range {
    
    private int firstNumber;
    private int lastNumber;
    private boolean excludeFirst;
    private boolean excludeLast;

    public Range(int firstNumber, int lastNumber) {
        this.firstNumber = firstNumber;
        this.lastNumber = lastNumber;
        this.excludeFirst = false;
        this.excludeLast = false;
    }

    // We can add this constructor with the default values 0 that is the minimum range of numbers
    // and change them with the setters if necessary
    public Range() {
        this.firstNumber = 0;
        this.lastNumber = 0;
        this.excludeFirst = false;
        this.excludeLast = false;
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

    public void setExcludeFirst(boolean excludeFirst) {
        this.excludeFirst = excludeFirst;
        if (excludeFirst) {
            this.firstNumber += 1;
        }
    }

    public void setExcludeLast(boolean excludeLast) {
        this.excludeLast = excludeLast;
        if (excludeLast) {
            this.lastNumber -= 1;
        }
    }
}
