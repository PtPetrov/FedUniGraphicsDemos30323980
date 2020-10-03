package com.example.fedunigraphicsdemos30323980;

import  java.util.Random;
import processing.core.PImage;

public abstract class Utils
{
    static Random random = new Random();

    // Method to return a random floating point value within a given range
    public static float randRange(float min, float max)
    {
        return (random.nextFloat() * (max - min)) + min;
    }

    // Method to return a random integer value within a given range (inclusive of min and max)
    public static int randRange(int min, int max)
    {
        //return random.nextInt(max + 1 - min) + min;
        return random.nextInt(max + 1 - min) + min;
    }

}