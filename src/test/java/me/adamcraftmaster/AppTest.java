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
}
