package com.merive.press1mtimes.utils;

import android.view.View;

// BETTER DO NOT TOUCH
public class Rotation {
    static final long DURATION = 350L;
    static final int FACTOR = 10;

    public static void defineRotation(float axisX, float axisY, View view) {
        /* Define Rotation level for view */
        int axisXRounded = Math.round(axisX * FACTOR);
        int axisYRounded = Math.round(axisY * FACTOR);
        if (Math.abs(axisXRounded) < 45 && Math.abs(axisYRounded) < 45)
            if (Math.abs(axisXRounded) > Math.abs(axisYRounded))
                setRotation(axisXRounded, 0, view);
            else if (Math.abs(axisXRounded) < Math.abs(axisYRounded))
                setRotation(0, axisYRounded, view);
            else if (Math.abs(axisXRounded) == Math.abs(axisYRounded))
                setRotation(0, 0, view);
    }

    public static void setRotation(float X, float Y, View view) {
        /* Set rotation for view */
        view.animate().rotationX(X).rotationY(Y).setDuration(DURATION).start();
    }
}
