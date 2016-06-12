package com.fandor.challenge;

import android.test.InstrumentationTestCase;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by nivedhithav on 6/11/16.
 */

public class CarouselTest{

    @Test
    public void testAddIntroDescription(){
        Carousel myCarousel=new Carousel();
        int arrSize=myCarousel.getArraySize();
        myCarousel.addIntroDescription("This app is Amazing!");
        //using assertThat instead of assertEquals as it displays both the expected and actual values if the test case does not pass
        assertThat(myCarousel.getArraySize(),is(arrSize+1));
    }

    @Test
    public void testSetArr(){
        Carousel myCarousel=new Carousel();
        ArrayList<String> testArray=new ArrayList<String>();
        testArray.add("Fandor is awesome!");
        testArray.add("How entertaining is Fandor!");
        myCarousel.setArr(testArray);
        assertThat(myCarousel.getArr(),is(testArray));
    }



}
