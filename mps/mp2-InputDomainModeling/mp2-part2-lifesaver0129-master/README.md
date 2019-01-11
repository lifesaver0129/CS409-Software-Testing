# mp2-idm-jodatime-lifesaver0129

## Personal info

* 11510225 Yuxing Hu (胡与兴) [@lifesaver0129](https://github.com/lifesaver0129)
* Team Name: ExitCode0
* Other team member:
  * 11510003 Sitong Liu (刘斯彤) [@Liu-Sitong ](https://github.com/Liu-Sitong)
  * 11510064 Lin Wang (王林) [@Hanswanglin](https://github.com/Hanswanglin)
  * 11510255 Jingxin Wu (吴景新) [@JXWu](https://github.com/xwoooo)

## Original Codes

> Some unnecessary codes is omitted

```java
  static RecordingInfo calculateRecordingInfo(int displayWidth, int displayHeight,
       boolean isLandscapeDevice, int cameraWidth, int cameraHeight) {
    if (cameraWidth == -1 && cameraHeight == -1) {
      // No cameras. Fall back to the display size.
      return new RecordingInfo(displayWidth, displayHeight);
    }

    int frameWidth = isLandscapeDevice ? cameraWidth : cameraHeight;
    int frameHeight = isLandscapeDevice ? cameraHeight : cameraWidth;
    if (frameWidth >= displayWidth && frameHeight >= displayHeight) {
      // Frame can hold the entire display. Use exact values.
      return new RecordingInfo(displayWidth, displayHeight);
    }

    // Calculate new width or height to preserve aspect ratio.
    if (isLandscapeDevice) {
      frameWidth = displayWidth * frameHeight / displayHeight;
    } else {
      frameHeight = displayHeight * frameWidth / displayWidth;
    }
    return new RecordingInfo(frameWidth, frameHeight);
  }
```

## Questions

**a)  What are the parameters of this public method? Remember that parameters includes arguments to the method and the state variables.** 

int displayWidth, int displayHeight, boolean isLandscapeDevice, int cameraWidth, int cameraHeight

**b)  Identify the characteristic according to Interface-based Input Domain Modeling. Make sure that your partitions are complete and disjoint.** 

**i.What are the partitions according to this characteristic?**

| Characteristic                               | b1                                  | b2                                          | b3          |
| -------------------------------------------- | ----------------------------------- | ------------------------------------------- | ----------- |
| q1 = “Relation of displayWidth to 0”         | greater than 0                      | equal or less than 0                        |             |
| q2 = “Relation of displayHeight to 0”        | greater than 0                      | equal or less than 0                        |             |
| q3 = “Relation of isLandscapeDevice to true” | true                                | false                                       |             |
| q4 = “Refinement of cameraWidth”             | greater or equal than displayWidth  | less than displayWidth but not equal to -1  | equal to -1 |
| q5 = “Refinement of cameraHeight”            | greater or equal than displayHeight | less than displayHeight but not equal to -1 | equal to -1 |

​	For convenience, we relabel the blocks:

| Characteristic | b1   | b2   | b3   |
| -------------- | ---- | ---- | ---- |
| A              | A1   | A2   |      |
| B              | B1   | B2   |      |
| C              | C1   | C2   |      |
| D              | D1   | D2   | D3   |
| E              | E1   | E2   | E3   |

**ii. What are the test inputs that fulfills Each Choice Coverage?** 

​	For calculateRecordingInfo(): A1, B1, C1, D1, E1; A1, B1, C2, D2, E2; A2, B2, C2, D3, E3

​	Substituting values: 1920, 1080, true, 1920, 1080; 2160, 3840, false, 1920, 1080; -10, -10, false, -1, -1.

**iii. Write JUnit tests for the test inputs in ii.**  

```java
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;
import static com.jakewharton.telecine.RecordingSession.RecordingInfo;
import static com.jakewharton.telecine.RecordingSession.calculateRecordingInfo;

public final class RecordingSessionTest {
  @Test public void videoSizeFitsInCameraLandscape() {
    RecordingInfo size = calculateRecordingInfo(1920, 1080, true, 1920, 1080);
    assertThat(size.width).isEqualTo(1920);
    assertThat(size.height).isEqualTo(1080);
  }

  @Test public void videoSizeLargerThanCamera() {
    RecordingInfo size = calculateRecordingInfo(2160, 3840, false, 1920, 1080);
    assertThat(size.width).isEqualTo(1080);
    assertThat(size.height).isEqualTo(1920);
  }

  @Test public void videoSizeLargerThanCameraLandscape() {
    RecordingInfo size = calculateRecordingInfo(-10, -10, true, -1, -1);
    assertThat(size.width).isEqualTo(-10);
    assertThat(size.height).isEqualTo(-10);
  }
}

```

**c)  Identify the characteristic according to Functionality-based Input Domain Modeling. Make sure that your partitions are complete and disjoint. (2 points for identify characteristic)** 

**i.What are the partitions according to this characteristic?**

| Characteristic               | b1        | b2                 | b3                    |
| ---------------------------- | --------- | ------------------ | --------------------- |
| q1 = “Effect Classification” | No camera | Enough frame holds | Preserve aspect ratio |

​	For convenience, we relabel the blocks:

| Characteristic | b1   | b2   | b3   |
| -------------- | ---- | ---- | ---- |
| A              | A1   | A2   | A3   |

**ii. What are the test inputs that fulfills Each Choice Coverage?** 

​	For calculateRecordingInfo(): A1; A2; A3.

​	Substituting values: (1080, 1920, false, -1, -1); (1920, 1080, true, 1920, 1080); (1200, 1920, false, 1920, 1080).

**iii. Write JUnit tests for the test inputs in ii.** 

```java
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;
import static com.jakewharton.telecine.RecordingSession.RecordingInfo;
import static com.jakewharton.telecine.RecordingSession.calculateRecordingInfo;

public final class RecordingSessionTest {
  @Test public void videoSizeFitsInCameraLandscape() {
    RecordingInfo size = calculateRecordingInfo(1080, 1920, false, -1, -1);
    assertThat(size.width).isEqualTo(1080);
    assertThat(size.height).isEqualTo(1920);
  }

  @Test public void videoSizeLargerThanCamera() {
    RecordingInfo size = calculateRecordingInfo(1920, 1080, true, 1920, 1080);
    assertThat(size.width).isEqualTo(1920);
    assertThat(size.height).isEqualTo(1080);
  }

  @Test public void videoSizeLargerThanCameraLandscape() {
    RecordingInfo size = calculateRecordingInfo(1200, 1920, false, 1920, 1080);
    assertThat(size.width).isEqualTo(1728);
    assertThat(size.height).isEqualTo(1080);
  }
}
```

