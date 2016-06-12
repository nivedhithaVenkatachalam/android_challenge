# Android Challenge
Fork the branch and create a text carousel that incorporates unit tests for the methods 
defined. Please run this description text carousel in the MainFragment, and
ensure the descriptions-- say, for example, "Fandor is a pretty cool service--!!"--
change every 6 seconds. 

## Starting Point
First create a Carousel object-- perhaps you want to have code that 
can be called sorta like `introDescriptionCarousel = new Carousel<>();`. 

Create
a basic function that adds text to the Carousel-- maybe something like 
`introDescriptionCarousel.addIntroDescription("Hey, Fandor is _____")`. 

Then call the code in the fragment, say in a `Thread`. 

What we'd really like to see are good, clean unit tests for the object
that you create, this Carousel. Maybe add a note or two on what you feel 
is an example of a good testing style.

## Breath
You have three hours to do this. Write some code, have some fun, and ensure
that you enjoy the process--!! 

## Thoughts/Questions

The challenging portion of testing the carousel class is testing the continuously updating text in the carousel object. I looked into Mockito to see if I could mock the textview which is being updated continously as well as tried extending Instrumented Unit test case class. I will keep researching on how to refer to a android view object from a test class. 
