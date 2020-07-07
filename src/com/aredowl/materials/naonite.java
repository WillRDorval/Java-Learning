package com.aredowl.materials;

public class naonite extends material{
    @Override
    public int getMass() {
        return 33;
    }

    @Override
    public float getCreditMultiplier() {
        return (float) Math.pow(1.35, 2);
    }

    @Override
    public float getCost() {
        return 11.3f;
    }

    @Override
    public float getHealthMultiplier() {
        return (float) Math.pow(1.5, 2);
    }

    @Override
    public int getTier() {
        return 3;
    }
}
