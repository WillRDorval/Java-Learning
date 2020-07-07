package com.aredowl.materials;

public class ogonite extends material{
    @Override
    public int getMass() {
        return 45;
    }

    @Override
    public float getCreditMultiplier() {
        return (float) Math.pow(1.35, 5);
    }

    @Override
    public float getCost() {
        return 25.6f;
    }

    @Override
    public float getHealthMultiplier() {
        return (float) Math.pow(1.5, 5);
    }

    @Override
    public int getTier() {
        return 6;
    }
}
