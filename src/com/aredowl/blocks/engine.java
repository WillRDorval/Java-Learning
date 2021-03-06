package com.aredowl.blocks;

import com.aredowl.materials.material;

public class engine extends block{
    private final int tier;
    private final float density;
    private final float healthMod;

    public engine(float lx, float ux, float ly, float uy, float lz, float uz, material material){
        super(lx, ux, ly, uy, lz, uz);
        density = 0.5f*material.getMass();
        healthMod = 0.5f*4*material.getHealthMultiplier();
        tier = material.getTier();
        updateMass();
    }

    @Override
    public float getDensity() {
        return density;
    }

    @Override
    public float getPower() {
        return (float) ((400000/0.95)*Math.pow(0.95, tier))*getVolume();
    }

    @Override
    public float getHealth() {
        return healthMod*getVolume();
    }

    public float getThrust(){
        return 20000*getVolume();
    }
}
