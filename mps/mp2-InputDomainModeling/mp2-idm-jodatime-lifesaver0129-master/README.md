# mp2-idm-jodatime-lifesaver0129

## Personal info

* 11510225 Yuxing Hu (胡与兴) [@lifesaver0129](https://github.com/lifesaver0129)
* Team Name: ExitCode0
* Other team member:
  * 11510003 Sitong Liu (刘斯彤) [@Liu-Sitong ](https://github.com/Liu-Sitong)
  * 11510064 Lin Wang (王林) [@Hanswanglin](https://github.com/Hanswanglin)
  * 11510255 Jingxin Wu (吴景新) [@JXWu](https://github.com/xwoooo)

## Original Codes

```java
    /**
     * Returns a new duration with this length plus that specified multiplied by the scalar.
     * This instance is immutable and is not altered.
     * <p>
     * If the addition is zero, this instance is returned.
     * 
     * @param durationToAdd  the duration to add to this one
     * @param scalar  the amount of times to add, such as -1 to subtract once
     * @return the new duration instance
     */
    public Duration withDurationAdded(long durationToAdd, int scalar) {
        if (durationToAdd == 0 || scalar == 0) {
            return this;
        }
        long add = FieldUtils.safeMultiply(durationToAdd, scalar);
        long duration = FieldUtils.safeAdd(getMillis(), add);
        return new Duration(duration);
    }
```

## Questions

**a)  What are the parameters of this public method? Remember that parameters includes arguments to the method and the state variables.** 

​	long durationToAdd, int scalar

**b)  Identify the characteristic according to Interface-based Input Domain Modeling. Make sure that your partitions are complete and disjoint.** 

**i.What are the partitions according to this characteristic?**

| Characteristic                        | b1             | b2         | b3          |
| ------------------------------------- | -------------- | ---------- | ----------- |
| q1 = “Relation of durationToAdd to 0” | greater than 0 | equal to 0 | less than 0 |
| q2 = “Relation of scalar to 0”        | greater than 0 | equal to 0 | less than 0 |

​	For convenience, we relabel the blocks:

| Characteristic | b1   | b2   | b3   |
| -------------- | ---- | ---- | ---- |
| A              | A1   | A2   | A3   |
| B              | B1   | B2   | B3   |

**ii. What are the test inputs that fulfills Each Choice Coverage?** 	

​	For withDurationAdded(): A1, B1; A2, B2; A3, B3.

​	Substituting values: 20, 20; 0, 0; -10, -10.

**iii. Write JUnit tests for the test inputs in ii.** 

```java
package org.joda.time;

import static junit.framework.TestCase.assertEquals;

public class DurationTest {
    Duration DurBase1 = new Duration(400);
    Duration DurBase2 = new Duration(0);
    Duration DurBase3 = new Duration(100);

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

}
```

**c)  Identify the characteristic according to Functionality-based Input Domain Modeling. Make sure that your partitions are complete and disjoint. (2 points for identify characteristic)** 

**i.What are the partitions according to this characteristic?**

| Characteristic               | b1            | b2        | b3             |
| ---------------------------- | ------------- | --------- | -------------- |
| q1 = “Effect Classification” | become bigger | stay same | become smaller |

​	For convenience, we relabel the blocks:

| Characteristic | b1   | b2   | b3   |
| -------------- | ---- | ---- | ---- |
| A              | A1   | A2   | A3   |

**ii. What are the test inputs that fulfills Each Choice Coverage?**

​	For withDurationAdded(): A1; A2; A3.

​	Substituting values: (10, 10); (0, 10); (-10, 10).

**iii. Write JUnit tests for the test inputs in ii.** 

```java
package org.joda.time;

import static junit.framework.TestCase.assertEquals;

public class DurationTest {
    Duration DurBase1 = new Duration(400);
    Duration DurBase2 = new Duration(0);
    Duration DurBase3 = new Duration(100);
    Duration DurBase4 = new Duration(-100);
    
    ...
    
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
```

