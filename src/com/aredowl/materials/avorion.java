package com.aredowl.materials;

public class avorion implements material{
    public int getMass() {
        return 36;
    }

    public float getCreditMultiplier() {
        return (float) Math.pow(1.35, 6);
    }

    public float getCost() {
        return 27.4f;
    }

    public float getHealthMultiplier() {
        return (float) Math.pow(1.5, 6);
    }

    public int getTier() {
        return 7;
    }
}
