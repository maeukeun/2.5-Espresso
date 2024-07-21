package ru.kkuzmichev.simpleappforespresso;

import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityTestRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testHomeFragmentText() {
        // Найдите элемент по ID
        ViewInteraction element = onView(
                withId(R.id.text_home)
        );

        // Проверьте, что текст соответствует ожиданиям
        element.check(
                matches(withText("This is home fragment"))
        );
    }
}
