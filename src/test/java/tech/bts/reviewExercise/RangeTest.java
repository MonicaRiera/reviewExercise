package tech.bts.reviewExercise;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RangeTest {

    @Test
    public void returnList() {
        Range range = new Range(5, 12);
        assertThat(range.getRangeList().size(), is(range.getLastNumber()-(range.getFirstNumber()-1)));
    }

    @Test
    public void listWithExclusions() {
        Range range = new Range(3, 7);
        range.setExcludeFirst(true);
        assertThat(range.getRangeList().size(), is(range.getLastNumber()-(range.getFirstNumber()-1)));
        assertThat(range.getRangeList().contains(3), is(false));
    }

}