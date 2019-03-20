package com.example.espressotestandroid;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import static android.support.test.espresso.Espresso.pressBackUnconditionally;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityTestRule =new ActivityTestRule<>(MainActivity.class);  //launch MainActivity

    @Before
    public void before(){
        Log.d("TAG","Before test Called");
    }

    @After
    public void after(){
        Log.d("TAG","After test called");
    }

    @BeforeClass()
        public static void beforeClass(){
            Log.d("TAG","Before Class Called");
        }
    @AfterClass()
        public static void afterClass(){
        Log.d("TAG","After Class Called");
        }

    @Test
    public void ensureTextChangeWork(){
        onView(withId(R.id.editText))
                .perform(typeText("HELLO"), closeSoftKeyboard());   //type text in editText
        onView(withId(R.id.changeText)).perform(click());           //perform onClick event in changeText Button

        onView(withId(R.id.editText)).check(matches(withText("HsHsssss")));   //check editText text match with a text.
        Log.d("TAG","test1 executed");
    }
    @Test
    public void changeText_newActivity() {
        // Type text and then press the button.
        onView(withId(R.id.editText)).perform(typeText("NewText"),
                closeSoftKeyboard());

        onView(withId(R.id.switchActivity)).perform(click());

        // This view is in a different Activity, no need to tell Espresso.
        onView(withId(R.id.txtResult)).check(matches(withText("NewText")));
        Log.d("TAG","test2 executed");
    }
}
