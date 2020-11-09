package com.example.fedunigraphicsdemos30323980.smoke;

import java.util.ArrayList;
import java.util.Iterator;
import processing.core.PApplet;
import processing.core.PImage;

/**
 * @author Petar Petrov
 * @Student ID: 30323980
 *
 */

public class SmokeSketch extends PApplet {

    public static PImage backgroundImage;
    public static PImage smokeImage;
    public static ArrayList<SmokeParticle> smokeParticleList = new ArrayList<SmokeParticle>();


    public void settings() {
        size(displayWidth, displayHeight);
        fullScreen(P2D);
    }

    public void setup() {
        smokeImage = loadImage("smoke_particle.png");

        backgroundImage = loadImage("bonfire_background.png");
        backgroundImage.resize(displayWidth, displayHeight);
    }


    public void draw() {

        imageMode(CORNER);
        tint(255, 255);
        image(backgroundImage, 0.0f, 0.0f);

        for (int i = 0; i < touches.length; i++) {
            SmokeParticle sp = new SmokeParticle(touches[i].x, touches[i].y);
            smokeParticleList.add(sp);
        }

        //Set image mode to Center
        imageMode(CENTER);

        // Loop over all out particles using an iterator to avoid concurrent modification errors
        Iterator<SmokeParticle> spIter = smokeParticleList.iterator();

        while (spIter.hasNext()) {
            // While there are still particles to process, grab one.
            SmokeParticle sp = spIter.next();

            /** WRITE LOGIC HERE SO THAT IF sp.alpha is <= 0 you call spIter.remove() to remove
             the particle from the list...
             ...otherwise if the particle alpha is greater than zero we do the following.. **/

            if (sp.alpha() <= 0)
            {
                spIter.remove();
            }
            else if (sp.alpha() > 0)
            {
                // Move coordinate system to be centred on and rotated to orientation of particle
                translate(sp.x(), sp.y());
                rotate(sp.rotationRads());

                // Set the alpha via a call to tint and draw the image at the origin
                tint(255, sp.alpha());
                image(smokeImage, 0.0f, 0.0f, sp.particleSize(), sp.particleSize());

                // Un-rotate & move coordinate system back to screen origin (i.e. top left of screen)
                rotate(-sp.rotationRads());
                translate(-sp.x(), -sp.y());

                // Update the particle so it rises, grows in size, rotates and alpha is decreased
                sp.update();

            }
        }
    }
}
