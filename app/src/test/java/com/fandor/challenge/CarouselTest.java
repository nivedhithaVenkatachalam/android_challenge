package com.fandor.challenge;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by nivedhithav on 6/11/16.
 */
public class CarouselTest {

    @Test
    public void testAddIntroDescription(){
        Carousel myCarousel=new Carousel();
        int arrSize=myCarousel.getArraySize();
        myCarousel.addIntroDescription("This app is Amazing!");
        assertThat(myCarousel.getArraySize(),is(arrSize+1));
    }

    
}
