import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Ecker_TankFuellungTest {
    @Test
    public void t010averageKmPerTankful() {

        int[] kilometers = new int[] {123, 134, 120, 122};
        assertThat(Ecker_TankFuellung.average(kilometers), is(124.75));

    }

    @Test
    public void t020averageKmPerTankful() {

        int[] kilometers = new int[] {100, 100, 100, 100};
        assertThat(Ecker_TankFuellung.average(kilometers), is(100.00));

    }

    @Test
    public void t030averageKmPerTankful() {

        int[] kilometers = new int[] {};
        assertThat(Ecker_TankFuellung.average(kilometers), is(-1.0));

    }


}