package com.aredowl.blocks;

import com.aredowl.materials.*;

import java.util.logging.*;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public abstract class blockMaker {

    public static block fromXML(Element block){
        block out;
        float lx = Float.parseFloat(block.getAttribute("lx"));
        float ux = Float.parseFloat(block.getAttribute("ux"));
        float ly = Float.parseFloat(block.getAttribute("ly"));
        float uy = Float.parseFloat(block.getAttribute("uy"));
        float lz = Float.parseFloat(block.getAttribute("lz"));
        float uz = Float.parseFloat(block.getAttribute("uz"));
        int index = Integer.parseInt(block.getAttribute("index"));
        int material = Integer.parseInt(block.getAttribute("material"));
        material materialUsed;

        switch (material){
            case 1:
                materialUsed = new titanium();
                break;
            case 2:
                materialUsed = new naonite();
                break;
            case 3:
                materialUsed = new trinium();
                break;
            case 4:
                materialUsed = new xanion();
                break;
            case 5:
                materialUsed = new ogonite();
                break;
            case 6:
                materialUsed = new avorion();
                break;
            default:
                materialUsed = new iron();
        }
        switch (index){
            case 3:
                out = new engine(lx, ux, ly, uy, lz, uz, materialUsed);
                break;
            case 8:
                out = new armour(lx, ux, ly, uy, lz, uz, materialUsed);
                break;
            case 52:
                out = new generator(lx, ux, ly, uy, lz, uz, materialUsed);
                break;
            default:
                out = new hull(lx, ux, ly, uy, lz, uz, materialUsed);
                break;
        }

        return out;
    }
}
