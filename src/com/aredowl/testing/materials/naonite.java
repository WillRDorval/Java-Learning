package com.aredowl.testing.materials;

public class naonite implements material{
    public int getMass() {
        return 33;
    }

    public float getCreditMultiplier() {
        return (float) Math.pow(1.35, 2);
    }

    public float getCost() {
        return 11.3f;
    }

    public float getHealthMultiplier() {
        return (float) Math.pow(1.5, 2);
    }

    public int getTier() {
        return 3;
    }
}
