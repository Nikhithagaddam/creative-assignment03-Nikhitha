package model;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TextField implements Component, KeyListener {
    static int i =0;
    @Override
    public String render() {
        i++;
        return "textfield"+i;
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
