package com.aredowl.testing.blocks;

import com.aredowl.testing.materials.material;

public class hull extends block {
    private final float density;
    private final float healthMod;

    public hull(int l, int w, int h, material material){
        super(l, w, h);
        density = material.getMass();
        healthMod = 4*material.getHealthMultiplier();
    }

    @Override
    float getDensity() {
        return density;
    }

    @Override
    float getPower() {
        return 0.5f*getVolume();
    }

    @Override
    float getHealth() {
        return healthMod*getVolume();
    }
}
