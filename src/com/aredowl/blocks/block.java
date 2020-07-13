package com.aredowl.blocks;

public abstract class block {
    private float x;
    private float z;
    private float y;
    private float lx;
    private float ux;
    private float ly;
    private float uy;
    private float lz;
    private float uz;
    private float volume;
    private float mass;

    public block(float lx, float ux, float ly, float uy, float lz, float uz){
        this.lx = lx;
        this.ux = ux;
        this.ly = ly;
        this.uy = uy;
        this.lz = lz;
        this.uz = uz;
        this.x = ux-lx;
        this.y = uy-ly;
        this.z = uz-lz;
        volume = x*y*z;
    }
    final public float getVolume(){
        return volume;
    }
    final public float getMass(){
        return mass;
    }
    final public void scale(float scale){
        lx*=scale;
        ux*=scale;
        ly*=scale;
        uy*=scale;
        lz*=scale;
        uz*=scale;
        this.x = ux-lx;
        this.y = uy-ly;
        this.z = uz-lz;
        volume = x*y*z;
        mass = volume*getDensity();
    }
    public void updateMass(){
        mass = volume*getDensity();
    }
    abstract public float getDensity();
    abstract public float getPower();
    abstract public float getHealth();
    public float getThrust(){
        return 0f;
    }
    public float getShield(){
        return 0f;
    }
}
