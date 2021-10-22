package model;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TextArea implements Component, KeyListener {
    static int i =0;
    @Override
    public String render() {
        i++;
        return "textarea"+i;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("key Typed");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("key Typed");

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("key Released");

    }
}
