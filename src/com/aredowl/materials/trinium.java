package com.aredowl.materials;

public class trinium implements material{
    public int getMass() {
        return 21;
    }

    public float getCreditMultiplier() {
        return (float) Math.pow(1.35, 3);
    }

    public float getCost() {
        return 16.8f;
    }

    public float getHealthMultiplier() {
        return (float) Math.pow(1.5, 3);
    }

    public int getTier() {
        return 4;
    }
}
