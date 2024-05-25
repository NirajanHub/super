package com.kuraakani.nimbuzz;


import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import com.kuraakani.nimbuzz.nimbuzz.v1.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;


@RunWith(AndroidJUnit4.class)
public class Test03NewRoomTest {


    @Rule
    public ActivityTestRule<HomeActivity> mActivityRule = new ActivityTestRule<>(HomeActivity.class);

    @Test
    public void createNewRoom() {

        //create new room test
        onView(withId(R.id.rightIcon)).perform(click());
        onView(allOf(withId(R.id.title_item), withText("Room"))).perform(click());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(withId(R.id.etRoomName)).perform(typeText("unit test room"), closeSoftKeyboard());

        onView(withId(R.id.rvUsers)).perform(actionOnItemAtPosition(0, AdapterSimpleClick.clickChildViewWithId(R.id.parentView)));
        onView(withId(R.id.rvUsers)).perform(actionOnItemAtPosition(1, AdapterSimpleClick.clickChildViewWithId(R.id.parentView)));
        onView(withId(R.id.rvUsers)).perform(actionOnItemAtPosition(2, AdapterSimpleClick.clickChildViewWithId(R.id.parentView)));

        onView(withId(R.id.rightIcon)).perform(click());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}