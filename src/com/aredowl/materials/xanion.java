package com.aredowl.materials;

public class xanion extends material{
    @Override
    public int getMass() {
        return 27;
    }

    @Override
    public float getCreditMultiplier() {
        return (float) Math.pow(1.35, 4);
    }

    @Override
    public float getCost() {
        return 21.3f;
    }

    @Override
    public float getHealthMultiplier() {
        return (float) Math.pow(1.5, 4);
    }

    @Override
    public int getTier() {
        return 5;
    }
}
