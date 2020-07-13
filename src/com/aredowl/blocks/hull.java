package com.aredowl.blocks;

import com.aredowl.materials.material;

public class hull extends block {
    private final float density;
    private final float healthMod;

    public hull(float lx, float ux, float ly, float uy, float lz, float uz, material material){
        super(lx, ux, ly, uy, lz, uz);
        density = material.getMass();
        healthMod = 4*material.getHealthMultiplier();
        updateMass();
    }

    @Override
    public float getDensity() {
        return density;
    }

    @Override
    public float getPower() {
        return 0.5f*getVolume();
    }

    @Override
    public float getHealth() {
        return healthMod*getVolume();
    }
}
