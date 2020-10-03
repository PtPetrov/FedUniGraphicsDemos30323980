package com.example.fedunigraphicsdemos30323980.snow;

import static com.example.fedunigraphicsdemos30323980.Utils.randRange;

public class SnowParticle {
    private float x;
    private float y;
    private float colour;
    private float xSpeed;
    private float ySpeed;
    private int particleSize;

    public SnowParticle() {
    }

    public float x() {
        return x = randRange(0, SnowSketch.screenWidth);
    }

    public float y() {
        return y = randRange(0, SnowSketch.screenHeight);
    }


    public float colour() {
        return colour = randRange(128.0f, 255.0f);
    }


    public float xSpeed() {
        return xSpeed = randRange(1.0f, 3.0f);
    }


    public float ySpeed() {
        return ySpeed = randRange(1.0f, 3.0f);
    }

    public int particleSize() {
        return particleSize = randRange(3, 13);
    }

    public void update() {
        x += xSpeed;
        y += ySpeed;

        if (x > SnowSketch.screenWidth) {
            x = 0.0f;
            y = randRange(0, SnowSketch.screenHeight);
        }

        if (y > SnowSketch.screenHeight) {
            y = 0.0f;
            x = randRange(0, SnowSketch.screenWidth);
        }
    }

}
