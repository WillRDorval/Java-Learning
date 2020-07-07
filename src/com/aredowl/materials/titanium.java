package com.aredowl.materials;

public class titanium extends material{
    @Override
    public int getMass() {
        return 30;
    }

    @Override
    public float getCreditMultiplier() {
        return 1.35f;
    }

    @Override
    public float getCost() {
        return 7.6f;
    }

    @Override
    public float getHealthMultiplier() {
        return 1.5f;
    }

    @Override
    public int getTier() {
        return 2;
    }
}
