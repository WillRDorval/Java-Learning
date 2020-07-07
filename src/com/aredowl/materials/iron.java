package com.aredowl.materials;

public class iron extends material{
    @Override
    public int getMass() {
        return 51;
    }

    @Override
    public float getCreditMultiplier() {
        return 1;
    }

    @Override
    public float getCost() {
        return 3.4f;
    }

    @Override
    public float getHealthMultiplier() {
        return 1;
    }

    @Override
    public int getTier() {
        return 1;
    }
}
