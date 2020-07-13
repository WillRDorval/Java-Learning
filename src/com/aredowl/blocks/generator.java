package com.aredowl.blocks;

import com.aredowl.materials.material;

public class generator extends block {
    private final int tier;
    private final float density;
    private final float healthMod;

    public generator(int l, int w, int h, material material){
        super(l, w, h);
        density = 1.33f*material.getMass();
        healthMod = 0.125f*4*material.getHealthMultiplier();
        tier = material.getTier()-1;
    }

    @Override
    float getDensity() {
        return density;
    }

    @Override
    float getPower() {
        return -1875*(40+3*tier+tier*tier);
    }

    @Override
    float getHealth() {
        return healthMod*getVolume();
    }
}
