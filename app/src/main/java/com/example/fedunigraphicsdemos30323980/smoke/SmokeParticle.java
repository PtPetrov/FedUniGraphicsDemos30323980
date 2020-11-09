package com.example.fedunigraphicsdemos30323980.smoke;

import static com.example.fedunigraphicsdemos30323980.Utils.randRange;
/**
 * @author Petar Petrov
 * @Student ID: 30323980
 *
 */

public class SmokeParticle {

    private float x;
    private float y;
    private float particleSize = randRange(60.0f, 120.0f);
    ;
    private int alpha = 255;
    private float rotationRads = randRange(0.0f, 6.28f);

    public SmokeParticle(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public int alpha() {
        return alpha;
    }

    public float rotationRads() {
        return rotationRads;
    }

    public float particleSize() {
        return particleSize;
    }

    public float x() {
        return x;
    }

    public float y() {
        return y;
    }

    public void update() {
        y -= 4.0f;
        alpha = alpha() - 2;
        rotationRads = rotationRads() + 0.05f;
        particleSize = particleSize() * 1.008f;
    }
}
