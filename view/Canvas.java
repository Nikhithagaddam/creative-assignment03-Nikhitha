
package view;

import model.Checkbox;
import model.Component;
import model.TextArea;
import model.TextField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class Canvas extends JPanel {

    private List<Component> componentList = new ArrayList<>();

    public Canvas(Simulator panel) {
        setPreferredSize(new Dimension(800, 300));
        setBackground(Color.WHITE);
    }

    @Override
    public void paintComponent(Graphics gh) {
        super.paintComponent(gh);
        System.out.println("paint Component");
        if(!componentList.isEmpty()) {
            for (Component component : componentList) {
                if (component instanceof TextField) {
                    JTextField textField = new JTextField(40);
                    textField.setText(component.render());
                    add(textField);
                } else if (component instanceof TextArea) {
                    JTextArea textArea = new JTextArea(12, 40);
                    textArea.setText(component.render());
                    add(textArea);
                } else if (component instanceof Checkbox) {
                    JCheckBox checkBox = new JCheckBox(component.render());
                    add(checkBox);
                }
            }
        }

    }

    public List<Component> getComponentList() {
        return componentList;
    }

    public void setComponentList(List<Component> componentList) {
        this.componentList = componentList;
    }
}
