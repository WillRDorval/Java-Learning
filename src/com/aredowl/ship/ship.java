package com.aredowl.ship;

import com.aredowl.materials.material;

import java.util.*;

public class ship {
    float cost = 0;
    static Set<String> materialList = new HashSet<>(Arrays.asList("iron", "titanium", "naonite", "trinium", "xanion",
                                                                  "ogonite", "avorion"));
    Map<String, Integer> materialsUsed = new HashMap<>(){};

    public ship(){
        for(String material: materialList){
            materialsUsed.put(material, 0);
        }
    }

    public ship(material material){
        this();
        String materialName = material.getClass().getName().replaceAll("com.aredowl.testing.materials.", "");
    }
}
