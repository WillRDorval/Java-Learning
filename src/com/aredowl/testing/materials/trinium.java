package com.aredowl.testing.materials;

public class trinium extends material{
    @Override
    public int getMass() {
        return 21;
    }

    @Override
    public float getCreditMultiplier() {
        return (float) Math.pow(1.35, 3);
    }

    @Override
    public float getCost() {
        return 16.8f;
    }

    @Override
    public float getHealthMultiplier() {
        return (float) Math.pow(1.5, 3);
    }

    @Override
    public int getTier() {
        return 4;
    }
}
