package com.onlylemi.processing;

import processing.core.PApplet;

/**
 * ProcessingMain
 *
 * @author onlylemi
 * @time 2016/12/24 10:08
 */
public class ProcessingMain extends PApplet {

    IProcessing app;
    static String className;

    public static void startProcessing(Class<?> c) {
        className = c.getName();

        PApplet.main(ProcessingMain.class);
    }

    @Override
    public void settings() {
        Processing.init(this);

        try {
            Class<?> mClass = Class.forName(className);
            app = (IProcessing) mClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        app.setting();
    }

    @Override
    public void setup() {
        app.setup();
    }

    @Override
    public void draw() {
        app.draw();
    }
}
