package com.example.fedunigraphicsdemos30323980.snow;

import java.lang.reflect.Array;

import processing.core.PApplet;
import processing.core.PImage;

public class SnowSketch extends PApplet {

    public static int screenWidth;
    public static int screenHeight;
    public static PImage backgroudImage;
    public Array[] snowParticleArray;
    public SnowParticle[] sp;


    /**
     * Method that perform device setup
     */
    public void settings() {
        size(200, 200);
    }

    /**
     * Method that performs one-off
     * sketch setup operations
     */
    public void setup() {
        screenWidth = displayWidth;
        screenHeight = displayHeight;

        backgroudImage = loadImage("mountain_background.jpg");
        backgroudImage.resize(screenWidth, screenHeight);

        sp = new SnowParticle[300];

    }

    /**
     * Method that draw the scene
     */
    public void draw() {
        image(backgroudImage, 0.0f, 0.0f);

        for (int i = 0; i < sp.length; i++) {
            stroke(sp[i].colour());
            strokeWeight(sp[i].particleSize());
            point(sp[i].x(), sp[i].y());
            sp[i].update();
        }

    }

}
