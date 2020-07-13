package com.aredowl.blocks;

import com.aredowl.materials.material;

public class armour extends block{
    private final float density;
    private final float healthMod;

    public armour(float lx, float ux, float ly, float uy, float lz, float uz, material material){
        super(lx, ux, ly, uy, lz, uz);
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
