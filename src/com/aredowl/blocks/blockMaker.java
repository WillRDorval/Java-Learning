package com.aredowl.blocks;

import com.aredowl.materials.*;

public abstract class blockMaker {

    public block fromXML(){
        block block;
        block = new hull(1, 1, 1, new iron());
        return block;
    }
}
