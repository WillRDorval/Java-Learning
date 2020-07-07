package com.aredowl.testing.blocks;

import com.aredowl.testing.materials.material;

public class armour extends block{
    private final float density;
    private final float healthMod;

    public armour(int l, int w, int h, material material){
        super(l, w, h);
        density = 1.66f*material.getMass();
        healthMod = 3.75f*4*material.getHealthMultiplier();
    }

    @Override
    float getDensity() {
        return density;
    }

    @Override
    float getPower() {
        return 0;
    }

    @Override
    float getHealth() {
        return healthMod*getVolume();
    }
}
