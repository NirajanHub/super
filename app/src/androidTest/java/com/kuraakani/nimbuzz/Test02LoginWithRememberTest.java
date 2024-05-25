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
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.allOf;


@RunWith(AndroidJUnit4.class)
public class Test02LoginWithRememberTest {


    @Rule
    public ActivityTestRule<LoginActivity> mActivityRule = new ActivityTestRule<>(LoginActivity.class);

    @Test
    public void loginWithRememberMe() {
        onView(withId(R.id.etOrganization)).perform(clearText()).perform(typeText("clover"));
        onView(withId(R.id.etUserName)).perform(clearText()).perform(typeText("sdktest"));
        onView(withId(R.id.etPassword)).perform(clearText()).perform(typeText("sdktest"), closeSoftKeyboard());
        onView(withId(R.id.cbRememberMe)).perform(click());
        onView(withId(R.id.btnLogin)).perform(click());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}