package com.aredowl.tests;

import org.testng.annotations.*;
import com.aredowl.ship.*;
import org.xml.sax.SAXException;

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
}
