package com.example.fedunigraphicsdemos30323980.snow;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * @author Petar Petrov
 * @Student ID: 30323980
 *
 */

public class SnowSketch extends PApplet {

    public SnowParticle[] snowParticles;
    public static int screenWidth;
    public static int screenHeight;
    public static PImage backgroundImage;


    /**
     * Method that perform device setup
     */
    public void settings() {
        size(displayWidth , displayHeight);
    }

    /**
     * Method that performs one-off
     * sketch setup operations
     */
    public void setup() {
        /**
         * Assign the screenWidth to the displayWidth
         * and the screenHeight to the displayHeight
         */
        screenWidth = displayWidth;
        screenHeight = displayHeight;

        /**
         * Load the background image
         * and set it to be the size of the sketch
         */
        backgroundImage = loadImage("mountain_background.jpg");
        backgroundImage.resize(screenWidth, screenHeight);

        /**
         * Instantiate the snowParticleArray
         */

        snowParticles = new SnowParticle[300];

        /**
         * Loop through the array and
         * instantiate each of the SnowParticles
         */
        for (int i = 0; i < snowParticles.length; ++i) {
            snowParticles[i] = new SnowParticle();
        }
    }

    /**
     * Method that draw the scene
     */
    public void draw() {
        /**
         * Draw the background image
         */
        image(backgroundImage, 0.0f, 0.0f);


        for (int i = 0; i < snowParticles.length; ++i) {
            stroke(snowParticles[i].colour());
            strokeWeight(snowParticles[i].particleSize());
            point(snowParticles[i].x(), snowParticles[i].y());
            snowParticles[i].update();
        }


    }

}
