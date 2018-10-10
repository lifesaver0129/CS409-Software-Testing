package com.bradteachescode.basiccalculator;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule
    public ActivityTestRule activityTestRule = new ActivityTestRule<>(MainActivity.class);

    /* Initial test for TDD */
    @Test
    public void decimalTest() {
        onView(withId(R.id.key_3_btn)).perform(click());
        onView(withId(R.id.key_point_btn)).perform(click());
        onView(withId(R.id.key_6_btn)).perform(click());
        onView(withId(R.id.key_add_btn)).perform(click());
        onView(withId(R.id.key_2_btn)).perform(click());
        onView(withId(R.id.key_add_btn)).perform(click());
        onView(withId(R.id.key_2_btn)).perform(click());
        onView(withId(R.id.answer_tv)).check(matches(withText("answer: 4.8")));
    }

}