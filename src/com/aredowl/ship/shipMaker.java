package com.aredowl.ship;

import java.util.logging.*;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import com.aredowl.blocks.block;
import com.aredowl.blocks.blockMaker;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public abstract class shipMaker {
    static DocumentBuilderFactory dBFact = DocumentBuilderFactory.newInstance();
    static DocumentBuilder dBuilder;
    private final static Logger logger = Logger.getLogger(shipMaker.class.getName());

    static {
        logger.setLevel(Level.INFO);
        try {
            dBuilder = dBFact.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }

    static public ship fromXML(String path) throws IOException, SAXException {
        ship ship = new ship();
        File inFile = new File(path);
        Document doc = dBuilder.parse(inFile);
        NodeList nList = doc.getElementsByTagName("item");
        block current;
        for(int i=0; i < nList.getLength(); i++){
            Node item = nList.item(i);
            Element block = (Element) item;
            logger.log(Level.INFO,"Block Element" + block.getAttribute("index"));
            Element part = (Element) block.getElementsByTagName("block").item(0);
            logger.log(Level.INFO,"Part Element" + part.getAttribute("index"));
            current = blockMaker.fromXML(part);
            ship.addBlock(current, Integer.parseInt(block.getAttribute("index")), Integer.parseInt(block.getAttribute("parent")));
        }
        return ship;
    }
}
