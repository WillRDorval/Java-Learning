package com.aredowl.materials;

public class titanium implements material{
    public int getMass() {
        return 30;
    }

    public float getCreditMultiplier() {
        return 1.35f;
    }

    public float getCost() {
        return 7.6f;
    }

    public float getHealthMultiplier() {
        return 1.5f;
    }

    public int getTier() {
        return 2;
    }
}
