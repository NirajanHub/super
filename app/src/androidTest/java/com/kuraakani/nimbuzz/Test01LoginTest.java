package com.kuraakani.nimbuzz;


import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;

import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;


@RunWith(AndroidJUnit4.class)
public class Test01LoginTest {


    @Rule
    public ActivityTestRule<LoginActivity> mActivityRule = new ActivityTestRule<>(LoginActivity.class);

    @Test
    public void login() {
        onView(withId(R.id.etOrganization)).perform(clearText()).perform(typeText("clover"));
        onView(withId(R.id.etUserName)).perform(clearText()).perform(typeText("sdktest"));
        onView(withId(R.id.etPassword)).perform(clearText()).perform(typeText("sdktest"), closeSoftKeyboard());
        onView(withId(R.id.btnLogin)).perform(click());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        onView(withId(R.id.rlGroups)).perform(click());
        onView(withId(R.id.rlContacts)).perform(click());
        onView(withId(R.id.rlSettings)).perform(click());
        onView(withId(R.id.rlLifestyle)).perform(click());
        onView(withId(R.id.rlRecent)).perform(click());

        //create new room test
        onView(withId(R.id.rightIcon)).perform(click());
        onView(allOf(withId(R.id.title_item), withText("Room"))).perform(click());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(withId(R.id.etRoomName)).perform(typeText("unit test room"));

    }

}