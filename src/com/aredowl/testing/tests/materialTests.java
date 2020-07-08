package com.aredowl.testing.tests;

import org.testng.annotations.*;
import com.aredowl.testing.materials.*;

public class materialTests {
    private material Titanium;
    private material Iron;
    private material Naonite;
    private material Trinium;
    private material Xanion;
    private material Ogonite;
    private material Avorion;

    @BeforeClass
    public void setUp(){
        this.Iron = new iron();
        this.Titanium = new titanium();
        this.Naonite = new naonite();
        this.Trinium = new trinium();
        this.Xanion = new xanion();
        this.Ogonite = new ogonite();
        this.Avorion = new avorion();
    }

    @Test(groups = {"Name"})
    public void nameTest(){
        assert Iron.getClass().getName().equals("com.aredowl.testing.materials.iron");
        assert Titanium.getClass().getName().equals("com.aredowl.testing.materials.titanium");
    }
}
