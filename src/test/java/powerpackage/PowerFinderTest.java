package powerpackage;


import org.junit.Test;

public class PowerFinderTest {
    @Test
    public void one_raised_to_one_is_one() {
        assert PowerFinder.calculatePower(1,1) == 1;
    }

    @Test
    public void two_raised_to_one_is_two() {
        assert PowerFinder.calculatePower(2,1) == 2;
    }

    @Test
    public void two_raised_to_two_is_four() {
        assert PowerFinder.calculatePower(2, 2) == 4;
    }

    @Test
    public void three_raised_to_three_is_nine() {
        assert PowerFinder.calculatePower(3, 2) == 9;
    }
}
