package tech.bts.reviewExercise;

public class Main {
    public static void main(String[] args) {
        /**Range range = new Range(2, 8);
        range.printRange();
        range.setFirstNumber(1);
        range.setLastNumber(10);
        range.setExcludeFirst(true);
        range.setExcludeLast(true);
        System.out.println(range.getRangeList());*/

        Range range2 = new Range(3, 7);
        range2.setExcludeFirst(true);
        System.out.println(range2.getRangeList().size());
        System.out.println(range2.getRangeList());
        range2.printRange();
    }
}
