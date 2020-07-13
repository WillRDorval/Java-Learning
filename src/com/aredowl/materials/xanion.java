package com.aredowl.materials;

public class xanion implements material{
    public int getMass() {
        return 27;
    }

    public float getCreditMultiplier() {
        return (float) Math.pow(1.35, 4);
    }

    public float getCost() {
        return 21.3f;
    }

    public float getHealthMultiplier() {
        return (float) Math.pow(1.5, 4);
    }

    public int getTier() {
        return 5;
    }
}
