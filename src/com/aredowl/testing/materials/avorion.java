package com.aredowl.testing.materials;

public class avorion extends material{
    @Override
    public int getMass() {
        return 36;
    }

    @Override
    public float getCreditMultiplier() {
        return (float) Math.pow(1.35, 6);
    }

    @Override
    public float getCost() {
        return 27.4f;
    }

    @Override
    public float getHealthMultiplier() {
        return (float) Math.pow(1.5, 6);
    }

    @Override
    public int getTier() {
        return 7;
    }
}
