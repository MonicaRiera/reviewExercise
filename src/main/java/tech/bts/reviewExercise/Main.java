package tech.bts.reviewExercise;

public class Main {
    public static void main(String[] args) {
        Range range = new Range(2, 8);

        range.printRange();

        range.setFirstNumber(1);
        range.setLastNumber(10);

        System.out.println(range.getRangeList());

    }
}
