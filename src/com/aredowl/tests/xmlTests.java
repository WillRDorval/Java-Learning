package com.aredowl.tests;

import com.aredowl.blocks.block;
import com.aredowl.blocks.blockMaker;
import org.testng.annotations.*;
import com.aredowl.ship.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class xmlTests {
    String path;
    @BeforeClass
    public void before() {
        path = "src\\com\\aredowl\\tests\\tester0.xml";
    }

    @Test
    public void xmlReadTest1() throws IOException, SAXException {
        shipMaker.fromXML(path);
    }
    @Test
    public void xmlReadTest2() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dBFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dBFactory.newDocumentBuilder();
        File inFile = new File(path);
        Document doc = dBuilder.parse(inFile);
        NodeList nList = doc.getElementsByTagName("item");
        Element testItem = (Element) nList.item(0);
        Element testBlock = (Element) testItem.getElementsByTagName("block").item(0);
        block block = blockMaker.fromXML(testBlock);
        assert block.getVolume()== 8000f;
        assert block.getDensity()== 51f;
        testItem = (Element) nList.item(1);
        testBlock = (Element) testItem.getElementsByTagName("block").item(0);
        block = blockMaker.fromXML(testBlock);
        assert block.getVolume()== 8000f;
        assert block.getDensity()== 25.5f;
        assert block.getPower()== 400000f*block.getVolume();
    }
}
