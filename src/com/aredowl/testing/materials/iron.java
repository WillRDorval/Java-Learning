package com.aredowl.testing.materials;

public class iron implements material{
    public int getMass() {
        return 51;
    }

    public float getCreditMultiplier() {
        return 1;
    }

    public float getCost() {
        return 3.4f;
    }

    public float getHealthMultiplier() {
        return 1;
    }

    public int getTier() {
        return 1;
    }
}
