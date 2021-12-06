package me.adamcraftmaster;

import static org.junit.Assert.*;
import org.junit.Test;

import me.adamcraftmaster.projs.*;

public class AppTest 
{
    @Test
    public void helloWorldShouldReturnStringHelloWorld() {

        HelloWorld HelloWorld = new HelloWorld();

        assertTrue(HelloWorld.helloWorld().equals("Hello World!"));
    }

    @Test
    public void letterValueSumCheckAccuracy() {

        LetterValueSum LetterValueSum = new LetterValueSum();

        assertTrue(LetterValueSum.letterValueSum("test") == 64); //20+5+19+20
    }
}
