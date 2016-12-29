package com.onlylemi.processing;

import processing.core.*;
import processing.data.JSONArray;
import processing.data.JSONObject;
import processing.data.Table;
import processing.data.XML;
import processing.event.Event;
import processing.event.KeyEvent;
import processing.event.MouseEvent;
import processing.opengl.PGL;
import processing.opengl.PShader;

import java.io.*;

/**
 * Processing
 *
 * @author onlylemi
 */
public class Processing extends PApplet{

    static ProcessingMain p5;

    static void init(ProcessingMain pm) {
        p5 = pm;
    }


    // processing reference

    @Override
    public PSurface getSurface() {
        return p5.getSurface();
    }

    @Override
    public void settings() {
        p5.settings();
    }

    @Override
    public int displayDensity() {
        return p5.displayDensity();
    }

    @Override
    public void pixelDensity(int density) {
        p5.pixelDensity(density);
    }

    @Override
    public void setSize(int width, int height) {
        p5.setSize(width, height);
    }

    @Override
    public void smooth() {
        p5.smooth();
    }

    @Override
    public void smooth(int level) {
        p5.smooth(level);
    }

    @Override
    public void noSmooth() {
        p5.noSmooth();
    }

    @Override
    public PGraphics getGraphics() {
        return p5.getGraphics();
    }

    @Override
    public void orientation(int which) {
        p5.orientation(which);
    }

    @Override
    public void start() {
        p5.start();
    }

    @Override
    public void stop() {
        p5.stop();
    }

    @Override
    public void pause() {
        p5.pause();
    }

    @Override
    public void resume() {
        p5.resume();
    }

    @Override
    public void registerMethod(String methodName, Object target) {
        p5.registerMethod(methodName, target);
    }

    @Override
    public void unregisterMethod(String name, Object target) {
        p5.unregisterMethod(name, target);
    }

    @Override
    public void setup() {
        p5.setup();
    }

    @Override
    public void draw() {
        p5.draw();
    }

    @Override
    public void fullScreen() {
        p5.fullScreen();
    }

    @Override
    public void fullScreen(int display) {
        p5.fullScreen(display);
    }

    @Override
    public void fullScreen(String renderer) {
        p5.fullScreen(renderer);
    }

    @Override
    public void fullScreen(String renderer, int display) {
        p5.fullScreen(renderer, display);
    }

    @Override
    public void size(int width, int height) {
        p5.size(width, height);
    }

    @Override
    public void size(int width, int height, String renderer) {
        p5.size(width, height, renderer);
    }

    @Override
    public void size(int width, int height, String renderer, String path) {
        p5.size(width, height, renderer, path);
    }

    @Override
    public PGraphics createGraphics(int w, int h) {
        return p5.createGraphics(w, h);
    }

    @Override
    public PGraphics createGraphics(int w, int h, String renderer) {
        return p5.createGraphics(w, h, renderer);
    }

    @Override
    public PGraphics createGraphics(int w, int h, String renderer, String path) {
        return p5.createGraphics(w, h, renderer, path);
    }

    @Override
    public PImage createImage(int w, int h, int format) {
        return p5.createImage(w, h, format);
    }

    @Override
    public void handleDraw() {
        p5.handleDraw();
    }

    @Override
    public synchronized void redraw() {
        p5.redraw();
    }

    @Override
    public synchronized void loop() {
        p5.loop();
    }

    @Override
    public synchronized void noLoop() {
        p5.noLoop();
    }

    @Override
    public boolean isLooping() {
        return p5.isLooping();
    }

    @Override
    public void postEvent(Event pe) {
        p5.postEvent(pe);
    }

    @Override
    public void mousePressed() {
        p5.mousePressed();
    }

    @Override
    public void mousePressed(MouseEvent event) {
        p5.mousePressed(event);
    }

    @Override
    public void mouseReleased() {
        p5.mouseReleased();
    }

    @Override
    public void mouseReleased(MouseEvent event) {
        p5.mouseReleased(event);
    }

    @Override
    public void mouseClicked() {
        p5.mouseClicked();
    }

    @Override
    public void mouseClicked(MouseEvent event) {
        p5.mouseClicked(event);
    }

    @Override
    public void mouseDragged() {
        p5.mouseDragged();
    }

    @Override
    public void mouseDragged(MouseEvent event) {
        p5.mouseDragged(event);
    }

    @Override
    public void mouseMoved() {
        p5.mouseMoved();
    }

    @Override
    public void mouseMoved(MouseEvent event) {
        p5.mouseMoved(event);
    }

    @Override
    public void mouseEntered() {
        p5.mouseEntered();
    }

    @Override
    public void mouseEntered(MouseEvent event) {
        p5.mouseEntered(event);
    }

    @Override
    public void mouseExited() {
        p5.mouseExited();
    }

    @Override
    public void mouseExited(MouseEvent event) {
        p5.mouseExited(event);
    }

    @Override
    public void mouseWheel() {
        p5.mouseWheel();
    }

    @Override
    public void mouseWheel(MouseEvent event) {
        p5.mouseWheel(event);
    }

    @Override
    public void keyPressed() {
        p5.keyPressed();
    }

    @Override
    public void keyPressed(KeyEvent event) {
        p5.keyPressed(event);
    }

    @Override
    public void keyReleased() {
        p5.keyReleased();
    }

    @Override
    public void keyReleased(KeyEvent event) {
        p5.keyReleased(event);
    }

    @Override
    public void keyTyped() {
        p5.keyTyped();
    }

    @Override
    public void keyTyped(KeyEvent event) {
        p5.keyTyped(event);
    }

    @Override
    public void focusGained() {
        p5.focusGained();
    }

    @Override
    public void focusLost() {
        p5.focusLost();
    }

    @Override
    public int millis() {
        return p5.millis();
    }

    @Override
    public void delay(int napTime) {
        p5.delay(napTime);
    }

    @Override
    public void frameRate(float fps) {
        p5.frameRate(fps);
    }

    @Override
    public void link(String url) {
        p5.link(url);
    }

    @Override
    public void die(String what) {
        p5.die(what);
    }

    @Override
    public void die(String what, Exception e) {
        p5.die(what, e);
    }

    @Override
    public void exit() {
        p5.exit();
    }

    @Override
    public boolean exitCalled() {
        return p5.exitCalled();
    }

    @Override
    public void exitActual() {
        p5.exitActual();
    }

    @Override
    public void dispose() {
        p5.dispose();
    }

    @Override
    public void method(String name) {
        p5.method(name);
    }

    @Override
    public void thread(String name) {
        p5.thread(name);
    }

    @Override
    public void save(String filename) {
        p5.save(filename);
    }

    @Override
    public void saveFrame() {
        p5.saveFrame();
    }

    @Override
    public void saveFrame(String filename) {
        p5.saveFrame(filename);
    }

    @Override
    public String insertFrame(String what) {
        return p5.insertFrame(what);
    }

    @Override
    public void cursor(int kind) {
        p5.cursor(kind);
    }

    @Override
    public void cursor(PImage img) {
        p5.cursor(img);
    }

    @Override
    public void cursor(PImage img, int x, int y) {
        p5.cursor(img, x, y);
    }

    @Override
    public void cursor() {
        p5.cursor();
    }

    @Override
    public void noCursor() {
        p5.noCursor();
    }

    @Override
    public float noise(float x) {
        return p5.noise(x);
    }

    @Override
    public float noise(float x, float y) {
        return p5.noise(x, y);
    }

    @Override
    public float noise(float x, float y, float z) {
        return p5.noise(x, y, z);
    }

    @Override
    public void noiseDetail(int lod) {
        p5.noiseDetail(lod);
    }

    @Override
    public void noiseDetail(int lod, float falloff) {
        p5.noiseDetail(lod, falloff);
    }

    @Override
    public void noiseSeed(long seed) {
        p5.noiseSeed(seed);
    }

    @Override
    public PImage loadImage(String filename) {
        return p5.loadImage(filename);
    }

    @Override
    public PImage loadImage(String filename, String extension) {
        return p5.loadImage(filename, extension);
    }

    @Override
    public PImage requestImage(String filename) {
        return p5.requestImage(filename);
    }

    @Override
    public PImage requestImage(String filename, String extension) {
        return p5.requestImage(filename, extension);
    }

    @Override
    public XML loadXML(String filename) {
        return p5.loadXML(filename);
    }

    @Override
    public XML loadXML(String filename, String options) {
        return p5.loadXML(filename, options);
    }

    @Override
    public XML parseXML(String xmlString) {
        return p5.parseXML(xmlString);
    }

    @Override
    public XML parseXML(String xmlString, String options) {
        return p5.parseXML(xmlString, options);
    }

    @Override
    public boolean saveXML(XML xml, String filename) {
        return p5.saveXML(xml, filename);
    }

    @Override
    public boolean saveXML(XML xml, String filename, String options) {
        return p5.saveXML(xml, filename, options);
    }

    @Override
    public JSONObject parseJSONObject(String input) {
        return p5.parseJSONObject(input);
    }

    @Override
    public JSONObject loadJSONObject(String filename) {
        return p5.loadJSONObject(filename);
    }

    @Override
    public boolean saveJSONObject(JSONObject json, String filename) {
        return p5.saveJSONObject(json, filename);
    }

    @Override
    public boolean saveJSONObject(JSONObject json, String filename, String options) {
        return p5.saveJSONObject(json, filename, options);
    }

    @Override
    public JSONArray parseJSONArray(String input) {
        return p5.parseJSONArray(input);
    }

    @Override
    public JSONArray loadJSONArray(String filename) {
        return p5.loadJSONArray(filename);
    }

    @Override
    public boolean saveJSONArray(JSONArray json, String filename) {
        return p5.saveJSONArray(json, filename);
    }

    @Override
    public boolean saveJSONArray(JSONArray json, String filename, String options) {
        return p5.saveJSONArray(json, filename, options);
    }

    @Override
    public Table loadTable(String filename) {
        return p5.loadTable(filename);
    }

    @Override
    public Table loadTable(String filename, String options) {
        return p5.loadTable(filename, options);
    }

    @Override
    public boolean saveTable(Table table, String filename) {
        return p5.saveTable(table, filename);
    }

    @Override
    public boolean saveTable(Table table, String filename, String options) {
        return p5.saveTable(table, filename, options);
    }

    @Override
    public PFont loadFont(String filename) {
        return p5.loadFont(filename);
    }

    @Override
    public PFont createFont(String name, float size) {
        return p5.createFont(name, size);
    }

    @Override
    public PFont createFont(String name, float size, boolean smooth) {
        return p5.createFont(name, size, smooth);
    }

    @Override
    public PFont createFont(String name, float size, boolean smooth, char[] charset) {
        return p5.createFont(name, size, smooth, charset);
    }

    @Override
    public void selectInput(String prompt, String callback) {
        p5.selectInput(prompt, callback);
    }

    @Override
    public void selectInput(String prompt, String callback, File file) {
        p5.selectInput(prompt, callback, file);
    }

    @Override
    public void selectInput(String prompt, String callback, File file, Object callbackObject) {
        p5.selectInput(prompt, callback, file, callbackObject);
    }

    @Override
    public void selectOutput(String prompt, String callback) {
        p5.selectOutput(prompt, callback);
    }

    @Override
    public void selectOutput(String prompt, String callback, File file) {
        p5.selectOutput(prompt, callback, file);
    }

    @Override
    public void selectOutput(String prompt, String callback, File file, Object callbackObject) {
        p5.selectOutput(prompt, callback, file, callbackObject);
    }

    @Override
    public void selectFolder(String prompt, String callback) {
        p5.selectFolder(prompt, callback);
    }

    @Override
    public void selectFolder(String prompt, String callback, File file) {
        p5.selectFolder(prompt, callback, file);
    }

    @Override
    public void selectFolder(String prompt, String callback, File file, Object callbackObject) {
        p5.selectFolder(prompt, callback, file, callbackObject);
    }

    @Override
    public BufferedReader createReader(String filename) {
        return p5.createReader(filename);
    }

    @Override
    public PrintWriter createWriter(String filename) {
        return p5.createWriter(filename);
    }

    @Override
    public InputStream createInput(String filename) {
        return p5.createInput(filename);
    }

    @Override
    public InputStream createInputRaw(String filename) {
        return p5.createInputRaw(filename);
    }

    @Override
    public byte[] loadBytes(String filename) {
        return p5.loadBytes(filename);
    }

    @Override
    public String[] loadStrings(String filename) {
        return p5.loadStrings(filename);
    }

    @Override
    public OutputStream createOutput(String filename) {
        return p5.createOutput(filename);
    }

    @Override
    public boolean saveStream(String target, String source) {
        return p5.saveStream(target, source);
    }

    @Override
    public boolean saveStream(File target, String source) {
        return p5.saveStream(target, source);
    }

    @Override
    public boolean saveStream(String target, InputStream source) {
        return p5.saveStream(target, source);
    }

    @Override
    public void saveBytes(String filename, byte[] data) {
        p5.saveBytes(filename, data);
    }

    @Override
    public void saveStrings(String filename, String[] data) {
        p5.saveStrings(filename, data);
    }

    @Override
    public String sketchPath() {
        return p5.sketchPath();
    }

    @Override
    public String sketchPath(String where) {
        return p5.sketchPath(where);
    }

    @Override
    public File sketchFile(String where) {
        return p5.sketchFile(where);
    }

    @Override
    public String savePath(String where) {
        return p5.savePath(where);
    }

    @Override
    public File saveFile(String where) {
        return p5.saveFile(where);
    }

    @Override
    public String dataPath(String where) {
        return p5.dataPath(where);
    }

    @Override
    public File dataFile(String where) {
        return p5.dataFile(where);
    }

    @Override
    public int lerpColor(int c1, int c2, float amt) {
        return p5.lerpColor(c1, c2, amt);
    }

    @Override
    public void frameMoved(int x, int y) {
        p5.frameMoved(x, y);
    }

    @Override
    public void frameResized(int w, int h) {
        p5.frameResized(w, h);
    }

    @Override
    public PGraphics beginRecord(String renderer, String filename) {
        return p5.beginRecord(renderer, filename);
    }

    @Override
    public void beginRecord(PGraphics recorder) {
        p5.beginRecord(recorder);
    }

    @Override
    public void endRecord() {
        p5.endRecord();
    }

    @Override
    public PGraphics beginRaw(String renderer, String filename) {
        return p5.beginRaw(renderer, filename);
    }

    @Override
    public void beginRaw(PGraphics rawGraphics) {
        p5.beginRaw(rawGraphics);
    }

    @Override
    public void endRaw() {
        p5.endRaw();
    }

    @Override
    public void loadPixels() {
        p5.loadPixels();
    }

    @Override
    public void updatePixels() {
        p5.updatePixels();
    }

    @Override
    public void updatePixels(int x1, int y1, int x2, int y2) {
        p5.updatePixels(x1, y1, x2, y2);
    }

    @Override
    public PGL beginPGL() {
        return p5.beginPGL();
    }

    @Override
    public void endPGL() {
        p5.endPGL();
    }

    @Override
    public void flush() {
        p5.flush();
    }

    @Override
    public void hint(int which) {
        p5.hint(which);
    }

    @Override
    public void beginShape() {
        p5.beginShape();
    }

    @Override
    public void beginShape(int kind) {
        p5.beginShape(kind);
    }

    @Override
    public void edge(boolean edge) {
        p5.edge(edge);
    }

    @Override
    public void normal(float nx, float ny, float nz) {
        p5.normal(nx, ny, nz);
    }

    @Override
    public void attribPosition(String name, float x, float y, float z) {
        p5.attribPosition(name, x, y, z);
    }

    @Override
    public void attribNormal(String name, float nx, float ny, float nz) {
        p5.attribNormal(name, nx, ny, nz);
    }

    @Override
    public void attribColor(String name, int color) {
        p5.attribColor(name, color);
    }

    @Override
    public void attrib(String name, float... values) {
        p5.attrib(name, values);
    }

    @Override
    public void attrib(String name, int... values) {
        p5.attrib(name, values);
    }

    @Override
    public void attrib(String name, boolean... values) {
        p5.attrib(name, values);
    }

    @Override
    public void textureMode(int mode) {
        p5.textureMode(mode);
    }

    @Override
    public void textureWrap(int wrap) {
        p5.textureWrap(wrap);
    }

    @Override
    public void texture(PImage image) {
        p5.texture(image);
    }

    @Override
    public void noTexture() {
        p5.noTexture();
    }

    @Override
    public void vertex(float x, float y) {
        p5.vertex(x, y);
    }

    @Override
    public void vertex(float x, float y, float z) {
        p5.vertex(x, y, z);
    }

    @Override
    public void vertex(float[] v) {
        p5.vertex(v);
    }

    @Override
    public void vertex(float x, float y, float u, float v) {
        p5.vertex(x, y, u, v);
    }

    @Override
    public void vertex(float x, float y, float z, float u, float v) {
        p5.vertex(x, y, z, u, v);
    }

    @Override
    public void beginContour() {
        p5.beginContour();
    }

    @Override
    public void endContour() {
        p5.endContour();
    }

    @Override
    public void endShape() {
        p5.endShape();
    }

    @Override
    public void endShape(int mode) {
        p5.endShape(mode);
    }

    @Override
    public PShape loadShape(String filename) {
        return p5.loadShape(filename);
    }

    @Override
    public PShape loadShape(String filename, String options) {
        return p5.loadShape(filename, options);
    }

    @Override
    public PShape createShape() {
        return p5.createShape();
    }

    @Override
    public PShape createShape(int type) {
        return p5.createShape(type);
    }

    @Override
    public PShape createShape(int kind, float... p) {
        return p5.createShape(kind, p);
    }

    @Override
    public PShader loadShader(String fragFilename) {
        return p5.loadShader(fragFilename);
    }

    @Override
    public PShader loadShader(String fragFilename, String vertFilename) {
        return p5.loadShader(fragFilename, vertFilename);
    }

    @Override
    public void shader(PShader shader) {
        p5.shader(shader);
    }

    @Override
    public void shader(PShader shader, int kind) {
        p5.shader(shader, kind);
    }

    @Override
    public void resetShader() {
        p5.resetShader();
    }

    @Override
    public void resetShader(int kind) {
        p5.resetShader(kind);
    }

    @Override
    public void filter(PShader shader) {
        p5.filter(shader);
    }

    @Override
    public void clip(float a, float b, float c, float d) {
        p5.clip(a, b, c, d);
    }

    @Override
    public void noClip() {
        p5.noClip();
    }

    @Override
    public void blendMode(int mode) {
        p5.blendMode(mode);
    }

    @Override
    public void bezierVertex(float x2, float y2, float x3, float y3, float x4, float y4) {
        p5.bezierVertex(x2, y2, x3, y3, x4, y4);
    }

    @Override
    public void bezierVertex(float x2, float y2, float z2, float x3, float y3, float z3, float x4, float y4, float z4) {
        p5.bezierVertex(x2, y2, z2, x3, y3, z3, x4, y4, z4);
    }

    @Override
    public void quadraticVertex(float cx, float cy, float x3, float y3) {
        p5.quadraticVertex(cx, cy, x3, y3);
    }

    @Override
    public void quadraticVertex(float cx, float cy, float cz, float x3, float y3, float z3) {
        p5.quadraticVertex(cx, cy, cz, x3, y3, z3);
    }

    @Override
    public void curveVertex(float x, float y) {
        p5.curveVertex(x, y);
    }

    @Override
    public void curveVertex(float x, float y, float z) {
        p5.curveVertex(x, y, z);
    }

    @Override
    public void point(float x, float y) {
        p5.point(x, y);
    }

    @Override
    public void point(float x, float y, float z) {
        p5.point(x, y, z);
    }

    @Override
    public void line(float x1, float y1, float x2, float y2) {
        p5.line(x1, y1, x2, y2);
    }

    @Override
    public void line(float x1, float y1, float z1, float x2, float y2, float z2) {
        p5.line(x1, y1, z1, x2, y2, z2);
    }

    @Override
    public void triangle(float x1, float y1, float x2, float y2, float x3, float y3) {
        p5.triangle(x1, y1, x2, y2, x3, y3);
    }

    @Override
    public void quad(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4) {
        p5.quad(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    @Override
    public void rectMode(int mode) {
        p5.rectMode(mode);
    }

    @Override
    public void rect(float a, float b, float c, float d) {
        p5.rect(a, b, c, d);
    }

    @Override
    public void rect(float a, float b, float c, float d, float r) {
        p5.rect(a, b, c, d, r);
    }

    @Override
    public void rect(float a, float b, float c, float d, float tl, float tr, float br, float bl) {
        p5.rect(a, b, c, d, tl, tr, br, bl);
    }

    @Override
    public void ellipseMode(int mode) {
        p5.ellipseMode(mode);
    }

    @Override
    public void ellipse(float a, float b, float c, float d) {
        p5.ellipse(a, b, c, d);
    }

    @Override
    public void arc(float a, float b, float c, float d, float start, float stop) {
        p5.arc(a, b, c, d, start, stop);
    }

    @Override
    public void arc(float a, float b, float c, float d, float start, float stop, int mode) {
        p5.arc(a, b, c, d, start, stop, mode);
    }

    @Override
    public void box(float size) {
        p5.box(size);
    }

    @Override
    public void box(float w, float h, float d) {
        p5.box(w, h, d);
    }

    @Override
    public void sphereDetail(int res) {
        p5.sphereDetail(res);
    }

    @Override
    public void sphereDetail(int ures, int vres) {
        p5.sphereDetail(ures, vres);
    }

    @Override
    public void sphere(float r) {
        p5.sphere(r);
    }

    @Override
    public float bezierPoint(float a, float b, float c, float d, float t) {
        return p5.bezierPoint(a, b, c, d, t);
    }

    @Override
    public float bezierTangent(float a, float b, float c, float d, float t) {
        return p5.bezierTangent(a, b, c, d, t);
    }

    @Override
    public void bezierDetail(int detail) {
        p5.bezierDetail(detail);
    }

    @Override
    public void bezier(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4) {
        p5.bezier(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    @Override
    public void bezier(float x1, float y1, float z1, float x2, float y2, float z2, float x3, float y3, float z3, float x4, float y4, float z4) {
        p5.bezier(x1, y1, z1, x2, y2, z2, x3, y3, z3, x4, y4, z4);
    }

    @Override
    public float curvePoint(float a, float b, float c, float d, float t) {
        return p5.curvePoint(a, b, c, d, t);
    }

    @Override
    public float curveTangent(float a, float b, float c, float d, float t) {
        return p5.curveTangent(a, b, c, d, t);
    }

    @Override
    public void curveDetail(int detail) {
        p5.curveDetail(detail);
    }

    @Override
    public void curveTightness(float tightness) {
        p5.curveTightness(tightness);
    }

    @Override
    public void curve(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4) {
        p5.curve(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    @Override
    public void curve(float x1, float y1, float z1, float x2, float y2, float z2, float x3, float y3, float z3, float x4, float y4, float z4) {
        p5.curve(x1, y1, z1, x2, y2, z2, x3, y3, z3, x4, y4, z4);
    }

    @Override
    public void imageMode(int mode) {
        p5.imageMode(mode);
    }

    @Override
    public void image(PImage img, float a, float b) {
        p5.image(img, a, b);
    }

    @Override
    public void image(PImage img, float a, float b, float c, float d) {
        p5.image(img, a, b, c, d);
    }

    @Override
    public void image(PImage img, float a, float b, float c, float d, int u1, int v1, int u2, int v2) {
        p5.image(img, a, b, c, d, u1, v1, u2, v2);
    }

    @Override
    public void shapeMode(int mode) {
        p5.shapeMode(mode);
    }

    @Override
    public void shape(PShape shape) {
        p5.shape(shape);
    }

    @Override
    public void shape(PShape shape, float x, float y) {
        p5.shape(shape, x, y);
    }

    @Override
    public void shape(PShape shape, float a, float b, float c, float d) {
        p5.shape(shape, a, b, c, d);
    }

    @Override
    public void textAlign(int alignX) {
        p5.textAlign(alignX);
    }

    @Override
    public void textAlign(int alignX, int alignY) {
        p5.textAlign(alignX, alignY);
    }

    @Override
    public float textAscent() {
        return p5.textAscent();
    }

    @Override
    public float textDescent() {
        return p5.textDescent();
    }

    @Override
    public void textFont(PFont which) {
        p5.textFont(which);
    }

    @Override
    public void textFont(PFont which, float size) {
        p5.textFont(which, size);
    }

    @Override
    public void textLeading(float leading) {
        p5.textLeading(leading);
    }

    @Override
    public void textMode(int mode) {
        p5.textMode(mode);
    }

    @Override
    public void textSize(float size) {
        p5.textSize(size);
    }

    @Override
    public float textWidth(char c) {
        return p5.textWidth(c);
    }

    @Override
    public float textWidth(String str) {
        return p5.textWidth(str);
    }

    @Override
    public float textWidth(char[] chars, int start, int length) {
        return p5.textWidth(chars, start, length);
    }

    @Override
    public void text(char c, float x, float y) {
        p5.text(c, x, y);
    }

    @Override
    public void text(char c, float x, float y, float z) {
        p5.text(c, x, y, z);
    }

    @Override
    public void text(String str, float x, float y) {
        p5.text(str, x, y);
    }

    @Override
    public void text(char[] chars, int start, int stop, float x, float y) {
        p5.text(chars, start, stop, x, y);
    }

    @Override
    public void text(String str, float x, float y, float z) {
        p5.text(str, x, y, z);
    }

    @Override
    public void text(char[] chars, int start, int stop, float x, float y, float z) {
        p5.text(chars, start, stop, x, y, z);
    }

    @Override
    public void text(String str, float x1, float y1, float x2, float y2) {
        p5.text(str, x1, y1, x2, y2);
    }

    @Override
    public void text(int num, float x, float y) {
        p5.text(num, x, y);
    }

    @Override
    public void text(int num, float x, float y, float z) {
        p5.text(num, x, y, z);
    }

    @Override
    public void text(float num, float x, float y) {
        p5.text(num, x, y);
    }

    @Override
    public void text(float num, float x, float y, float z) {
        p5.text(num, x, y, z);
    }

    @Override
    public void pushMatrix() {
        p5.pushMatrix();
    }

    @Override
    public void popMatrix() {
        p5.popMatrix();
    }

    @Override
    public void translate(float x, float y) {
        p5.translate(x, y);
    }

    @Override
    public void translate(float x, float y, float z) {
        p5.translate(x, y, z);
    }

    @Override
    public void rotate(float angle) {
        p5.rotate(angle);
    }

    @Override
    public void rotateX(float angle) {
        p5.rotateX(angle);
    }

    @Override
    public void rotateY(float angle) {
        p5.rotateY(angle);
    }

    @Override
    public void rotateZ(float angle) {
        p5.rotateZ(angle);
    }

    @Override
    public void rotate(float angle, float x, float y, float z) {
        p5.rotate(angle, x, y, z);
    }

    @Override
    public void scale(float s) {
        p5.scale(s);
    }

    @Override
    public void scale(float x, float y) {
        p5.scale(x, y);
    }

    @Override
    public void scale(float x, float y, float z) {
        p5.scale(x, y, z);
    }

    @Override
    public void shearX(float angle) {
        p5.shearX(angle);
    }

    @Override
    public void shearY(float angle) {
        p5.shearY(angle);
    }

    @Override
    public void resetMatrix() {
        p5.resetMatrix();
    }

    @Override
    public void applyMatrix(PMatrix source) {
        p5.applyMatrix(source);
    }

    @Override
    public void applyMatrix(PMatrix2D source) {
        p5.applyMatrix(source);
    }

    @Override
    public void applyMatrix(float n00, float n01, float n02, float n10, float n11, float n12) {
        p5.applyMatrix(n00, n01, n02, n10, n11, n12);
    }

    @Override
    public void applyMatrix(PMatrix3D source) {
        p5.applyMatrix(source);
    }

    @Override
    public void applyMatrix(float n00, float n01, float n02, float n03, float n10, float n11, float n12, float n13, float n20, float n21, float n22, float n23, float n30, float n31, float n32, float n33) {
        p5.applyMatrix(n00, n01, n02, n03, n10, n11, n12, n13, n20, n21, n22, n23, n30, n31, n32, n33);
    }

    @Override
    public PMatrix getMatrix() {
        return p5.getMatrix();
    }

    @Override
    public PMatrix2D getMatrix(PMatrix2D target) {
        return p5.getMatrix(target);
    }

    @Override
    public PMatrix3D getMatrix(PMatrix3D target) {
        return p5.getMatrix(target);
    }

    @Override
    public void setMatrix(PMatrix source) {
        p5.setMatrix(source);
    }

    @Override
    public void setMatrix(PMatrix2D source) {
        p5.setMatrix(source);
    }

    @Override
    public void setMatrix(PMatrix3D source) {
        p5.setMatrix(source);
    }

    @Override
    public void printMatrix() {
        p5.printMatrix();
    }

    @Override
    public void beginCamera() {
        p5.beginCamera();
    }

    @Override
    public void endCamera() {
        p5.endCamera();
    }

    @Override
    public void camera() {
        p5.camera();
    }

    @Override
    public void camera(float eyeX, float eyeY, float eyeZ, float centerX, float centerY, float centerZ, float upX, float upY, float upZ) {
        p5.camera(eyeX, eyeY, eyeZ, centerX, centerY, centerZ, upX, upY, upZ);
    }

    @Override
    public void printCamera() {
        p5.printCamera();
    }

    @Override
    public void ortho() {
        p5.ortho();
    }

    @Override
    public void ortho(float left, float right, float bottom, float top) {
        p5.ortho(left, right, bottom, top);
    }

    @Override
    public void ortho(float left, float right, float bottom, float top, float near, float far) {
        p5.ortho(left, right, bottom, top, near, far);
    }

    @Override
    public void perspective() {
        p5.perspective();
    }

    @Override
    public void perspective(float fovy, float aspect, float zNear, float zFar) {
        p5.perspective(fovy, aspect, zNear, zFar);
    }

    @Override
    public void frustum(float left, float right, float bottom, float top, float near, float far) {
        p5.frustum(left, right, bottom, top, near, far);
    }

    @Override
    public void printProjection() {
        p5.printProjection();
    }

    @Override
    public float screenX(float x, float y) {
        return p5.screenX(x, y);
    }

    @Override
    public float screenY(float x, float y) {
        return p5.screenY(x, y);
    }

    @Override
    public float screenX(float x, float y, float z) {
        return p5.screenX(x, y, z);
    }

    @Override
    public float screenY(float x, float y, float z) {
        return p5.screenY(x, y, z);
    }

    @Override
    public float screenZ(float x, float y, float z) {
        return p5.screenZ(x, y, z);
    }

    @Override
    public float modelX(float x, float y, float z) {
        return p5.modelX(x, y, z);
    }

    @Override
    public float modelY(float x, float y, float z) {
        return p5.modelY(x, y, z);
    }

    @Override
    public float modelZ(float x, float y, float z) {
        return p5.modelZ(x, y, z);
    }

    @Override
    public void pushStyle() {
        p5.pushStyle();
    }

    @Override
    public void popStyle() {
        p5.popStyle();
    }

    @Override
    public void style(PStyle s) {
        p5.style(s);
    }

    @Override
    public void strokeWeight(float weight) {
        p5.strokeWeight(weight);
    }

    @Override
    public void strokeJoin(int join) {
        p5.strokeJoin(join);
    }

    @Override
    public void strokeCap(int cap) {
        p5.strokeCap(cap);
    }

    @Override
    public void noStroke() {
        p5.noStroke();
    }

    @Override
    public void stroke(int rgb) {
        p5.stroke(rgb);
    }

    @Override
    public void stroke(int rgb, float alpha) {
        p5.stroke(rgb, alpha);
    }

    @Override
    public void stroke(float gray) {
        p5.stroke(gray);
    }

    @Override
    public void stroke(float gray, float alpha) {
        p5.stroke(gray, alpha);
    }

    @Override
    public void stroke(float v1, float v2, float v3) {
        p5.stroke(v1, v2, v3);
    }

    @Override
    public void stroke(float v1, float v2, float v3, float alpha) {
        p5.stroke(v1, v2, v3, alpha);
    }

    @Override
    public void noTint() {
        p5.noTint();
    }

    @Override
    public void tint(int rgb) {
        p5.tint(rgb);
    }

    @Override
    public void tint(int rgb, float alpha) {
        p5.tint(rgb, alpha);
    }

    @Override
    public void tint(float gray) {
        p5.tint(gray);
    }

    @Override
    public void tint(float gray, float alpha) {
        p5.tint(gray, alpha);
    }

    @Override
    public void tint(float v1, float v2, float v3) {
        p5.tint(v1, v2, v3);
    }

    @Override
    public void tint(float v1, float v2, float v3, float alpha) {
        p5.tint(v1, v2, v3, alpha);
    }

    @Override
    public void noFill() {
        p5.noFill();
    }

    @Override
    public void fill(int rgb) {
        p5.fill(rgb);
    }

    @Override
    public void fill(int rgb, float alpha) {
        p5.fill(rgb, alpha);
    }

    @Override
    public void fill(float gray) {
        p5.fill(gray);
    }

    @Override
    public void fill(float gray, float alpha) {
        p5.fill(gray, alpha);
    }

    @Override
    public void fill(float v1, float v2, float v3) {
        p5.fill(v1, v2, v3);
    }

    @Override
    public void fill(float v1, float v2, float v3, float alpha) {
        p5.fill(v1, v2, v3, alpha);
    }

    @Override
    public void ambient(int rgb) {
        p5.ambient(rgb);
    }

    @Override
    public void ambient(float gray) {
        p5.ambient(gray);
    }

    @Override
    public void ambient(float v1, float v2, float v3) {
        p5.ambient(v1, v2, v3);
    }

    @Override
    public void specular(int rgb) {
        p5.specular(rgb);
    }

    @Override
    public void specular(float gray) {
        p5.specular(gray);
    }

    @Override
    public void specular(float v1, float v2, float v3) {
        p5.specular(v1, v2, v3);
    }

    @Override
    public void shininess(float shine) {
        p5.shininess(shine);
    }

    @Override
    public void emissive(int rgb) {
        p5.emissive(rgb);
    }

    @Override
    public void emissive(float gray) {
        p5.emissive(gray);
    }

    @Override
    public void emissive(float v1, float v2, float v3) {
        p5.emissive(v1, v2, v3);
    }

    @Override
    public void lights() {
        p5.lights();
    }

    @Override
    public void noLights() {
        p5.noLights();
    }

    @Override
    public void ambientLight(float v1, float v2, float v3) {
        p5.ambientLight(v1, v2, v3);
    }

    @Override
    public void ambientLight(float v1, float v2, float v3, float x, float y, float z) {
        p5.ambientLight(v1, v2, v3, x, y, z);
    }

    @Override
    public void directionalLight(float v1, float v2, float v3, float nx, float ny, float nz) {
        p5.directionalLight(v1, v2, v3, nx, ny, nz);
    }

    @Override
    public void pointLight(float v1, float v2, float v3, float x, float y, float z) {
        p5.pointLight(v1, v2, v3, x, y, z);
    }

    @Override
    public void spotLight(float v1, float v2, float v3, float x, float y, float z, float nx, float ny, float nz, float angle, float concentration) {
        p5.spotLight(v1, v2, v3, x, y, z, nx, ny, nz, angle, concentration);
    }

    @Override
    public void lightFalloff(float constant, float linear, float quadratic) {
        p5.lightFalloff(constant, linear, quadratic);
    }

    @Override
    public void lightSpecular(float v1, float v2, float v3) {
        p5.lightSpecular(v1, v2, v3);
    }

    @Override
    public void background(int rgb) {
        p5.background(rgb);
    }

    @Override
    public void background(int rgb, float alpha) {
        p5.background(rgb, alpha);
    }

    @Override
    public void background(float gray) {
        p5.background(gray);
    }

    @Override
    public void background(float gray, float alpha) {
        p5.background(gray, alpha);
    }

    @Override
    public void background(float v1, float v2, float v3) {
        p5.background(v1, v2, v3);
    }

    @Override
    public void background(float v1, float v2, float v3, float alpha) {
        p5.background(v1, v2, v3, alpha);
    }

    @Override
    public void clear() {
        p5.clear();
    }

    @Override
    public void background(PImage image) {
        p5.background(image);
    }

    @Override
    public void colorMode(int mode) {
        p5.colorMode(mode);
    }

    @Override
    public void colorMode(int mode, float max) {
        p5.colorMode(mode, max);
    }

    @Override
    public void colorMode(int mode, float max1, float max2, float max3) {
        p5.colorMode(mode, max1, max2, max3);
    }

    @Override
    public void colorMode(int mode, float max1, float max2, float max3, float maxA) {
        p5.colorMode(mode, max1, max2, max3, maxA);
    }

    @Override
    public int get(int x, int y) {
        return p5.get(x, y);
    }

    @Override
    public PImage get(int x, int y, int w, int h) {
        return p5.get(x, y, w, h);
    }

    @Override
    public PImage get() {
        return p5.get();
    }

    @Override
    public PImage copy() {
        return p5.copy();
    }

    @Override
    public void set(int x, int y, int c) {
        p5.set(x, y, c);
    }

    @Override
    public void set(int x, int y, PImage img) {
        p5.set(x, y, img);
    }

    @Override
    public void mask(PImage img) {
        p5.mask(img);
    }

    @Override
    public void filter(int kind) {
        p5.filter(kind);
    }

    @Override
    public void filter(int kind, float param) {
        p5.filter(kind, param);
    }

    @Override
    public void copy(int sx, int sy, int sw, int sh, int dx, int dy, int dw, int dh) {
        p5.copy(sx, sy, sw, sh, dx, dy, dw, dh);
    }

    @Override
    public void copy(PImage src, int sx, int sy, int sw, int sh, int dx, int dy, int dw, int dh) {
        p5.copy(src, sx, sy, sw, sh, dx, dy, dw, dh);
    }

    @Override
    public void blend(int sx, int sy, int sw, int sh, int dx, int dy, int dw, int dh, int mode) {
        p5.blend(sx, sy, sw, sh, dx, dy, dw, dh, mode);
    }

    @Override
    public void blend(PImage src, int sx, int sy, int sw, int sh, int dx, int dy, int dw, int dh, int mode) {
        p5.blend(src, sx, sy, sw, sh, dx, dy, dw, dh, mode);
    }
}
