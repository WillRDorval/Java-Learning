package com.aredowl.blocks;

import com.aredowl.materials.material;

public class generator extends block {
    private final int tier;
    private final float density;
    private final float healthMod;

    public generator(float lx, float ux, float ly, float uy, float lz, float uz, material material){
        super(lx, ux, ly, uy, lz, uz);
        density = 1.33f*material.getMass();
        healthMod = 0.125f*4*material.getHealthMultiplier();
        tier = material.getTier()-1;
        updateMass();
    }

    @Override
    public float getDensity() {
        return density;
    }

    @Override
    public float getPower() {
        return -1875*(40+3*tier+tier*tier);
    }

    @Override
    public float getHealth() {
        return healthMod*getVolume();
    }
}
