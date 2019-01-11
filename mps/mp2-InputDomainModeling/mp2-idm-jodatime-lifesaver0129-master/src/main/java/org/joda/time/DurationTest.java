package org.joda.time;

import static junit.framework.TestCase.assertEquals;

public class DurationTest {
    Duration DurBase1 = new Duration(400);
    Duration DurBase2 = new Duration(0);
    Duration DurBase3 = new Duration(100);
    Duration DurBase4 = new Duration(-100);

    @org.junit.Test
    public void withDurationAdded1() {
        Duration DurZero = new Duration(0);
        DurZero = DurZero.withDurationAdded(20,20);
        assertEquals(DurBase1.getStandardSeconds(), DurZero.getStandardSeconds());
    }

    @org.junit.Test
    public void withDurationAdded2() {
        Duration DurZero = new Duration(0);
        DurZero = DurZero.withDurationAdded(0,0);
        assertEquals(DurBase2.getStandardSeconds(), DurZero.getStandardSeconds());
    }

    @org.junit.Test
    public void withDurationAdded3() {
        Duration DurZero = new Duration(0);
        DurZero = DurZero.withDurationAdded(-10,-10);
        assertEquals(DurBase3.getStandardSeconds(), DurZero.getStandardSeconds());
    }

    @org.junit.Test
    public void withDurationAdded4() {
        Duration DurZero = new Duration(0);
        DurZero = DurZero.withDurationAdded(10,10);
        assertEquals(DurBase3.getStandardSeconds(), DurZero.getStandardSeconds());
    }

    @org.junit.Test
    public void withDurationAdded5() {
        Duration DurZero = new Duration(0);
        DurZero = DurZero.withDurationAdded(0,10);
        assertEquals(DurBase2.getStandardSeconds(), DurZero.getStandardSeconds());
    }

    @org.junit.Test
    public void withDurationAdded6() {
        Duration DurZero = new Duration(0);
        DurZero = DurZero.withDurationAdded(-10,10);
        assertEquals(DurBase4.getStandardSeconds(), DurZero.getStandardSeconds());
    }

}
