package com.aredowl.testing.materials;

public class ogonite implements material{
    public int getMass() {
        return 45;
    }

    public float getCreditMultiplier() {
        return (float) Math.pow(1.35, 5);
    }

    public float getCost() {
        return 25.6f;
    }

    public float getHealthMultiplier() {
        return (float) Math.pow(1.5, 5);
    }

    public int getTier() {
        return 6;
    }
}
