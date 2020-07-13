package com.aredowl.ship;

import com.aredowl.blocks.block;
import com.aredowl.materials.material;

import java.util.*;

public class ship {
    float cost = 0;
    float health = 0;
    float power = 500000000;
    float shield = 0;
    float thrust = 0;
    float mass = 0;
    float volume = 0;
    Map<Integer, block> blocks = new HashMap<>();
    Map<Integer, Integer> parentMap = new HashMap<>();
    static Set<String> materialList = new HashSet<>(Arrays.asList("iron", "titanium", "naonite", "trinium", "xanion",
                                                                  "ogonite", "avorion"));
    Map<String, Integer> materialsUsed = new HashMap<>(){};

    public ship(){
        for(String material: materialList){
            materialsUsed.put(material, 0);
        }
    }

    public void addBlock(block block, int index, int parent){
        blocks.put(index, block);
        parentMap.put(index, parent);
        thrust += block.getThrust();
        health += block.getHealth();
        mass += block.getMass();
        power += block.getPower();
        shield += block.getShield();
        mass += block.getMass();
        volume += block.getVolume();
    }
}
