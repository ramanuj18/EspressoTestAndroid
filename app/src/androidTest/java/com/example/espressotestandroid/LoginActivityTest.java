package com.example.espressotestandroid;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class LoginActivityTest {

    @Rule
    public ActivityTestRule<LoginActivity> activityTestRule=new ActivityTestRule<>(LoginActivity.class);

    @Test
    public void testLogin(){
        onView(withId(R.id.edtUserName)).perform(typeText("Ramanuj"),closeSoftKeyboard());

        onView(withId(R.id.edtPassword)).perform(typeText("123456"),closeSoftKeyboard());

        onView(withId(R.id.btnLogin)).perform(click());

        onView(withId(R.id.txtResult)).check(matches(withText("success")));

    }
}
