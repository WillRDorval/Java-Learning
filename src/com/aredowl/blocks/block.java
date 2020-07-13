package com.aredowl.blocks;

public abstract class block {
    private  int l;
    private int w;
    private int h;
    private int volume;
    private float mass;

    public block(int l,int  w,int h){
        volume = l*w*h;
        this.h = h;
        this.w = w;
        this.l = l;
        mass = volume*getDensity();
    }
    final public int getVolume(){
        return volume;
    }
    final public float getMass(){
        return mass;
    }
    final public void setSide(int length, char side){
        switch (side){
            case 'l':
                l = length;
                break;
            case 'w':
                w = length;
                break;
            case 'h':
                h = length;
                break;
            case 'a':
                l = length;
                w = length;
                h = length;
                break;
        }
        volume = l*w*h;
        mass = volume*getDensity();
    }
    final public void scaleSide(float scale, char side){
        switch (side){
            case 'l':
                l *= scale;
                break;
            case 'w':
                w *= scale;
                break;
            case 'h':
                h *= scale;
                break;
            case 'a':
                l *= scale;
                w *= scale;
                h *= scale;
                break;
        }
        volume = l*w*h;
        mass = volume*getDensity();
    }
    abstract float getDensity();
    abstract float getPower();
    abstract float getHealth();
}
