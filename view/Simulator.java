package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

import controller.EventListener;
import model.Component;

public class Simulator {

    private JFrame window;
    private Canvas canvas;
    private JRadioButton textButton = new JRadioButton("TEXTFIELD");
    private JRadioButton textAreaButton = new JRadioButton("TEXTAREA");
    private JRadioButton checkBoxButton = new JRadioButton("CHECKBOX");
    private JButton addButton = new JButton("ADD");
    private JButton clearButton = new JButton("CLEAR");
    private JButton exitButton = new JButton("EXIT");

    private Component component;


    public Simulator(JFrame window) {
        this.window = window;
        window.setTitle("Welcome to Form Builder");
    }

    public void init() {
        Container cp = window.getContentPane();

        JPanel bottomPanel = new JPanel();
        cp.add(BorderLayout.SOUTH, bottomPanel);
        bottomPanel.setLayout(new GridLayout(2, 1));

        JPanel formPanel = new JPanel();
        formPanel.add(textButton);
        formPanel.add(textAreaButton);
        formPanel.add(checkBoxButton);
        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(textButton);
        radioButtonGroup.add(textAreaButton);
        radioButtonGroup.add(checkBoxButton);
        formPanel.setLayout(new GridLayout(1, 1, 20, 25));
        bottomPanel.add(formPanel);

        // buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(exitButton);

        bottomPanel.add(buttonPanel);

        canvas = new Canvas(this);
        cp.add(BorderLayout.CENTER,canvas);

        // Action Listeners
        EventListener eventListener = new EventListener(this);
        addButton.addActionListener(eventListener);
        exitButton.addActionListener(eventListener);
        clearButton.addActionListener(eventListener);
        textButton.addActionListener(eventListener);
        textAreaButton.addActionListener(eventListener);
        checkBoxButton.addActionListener(eventListener);

             

    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    public JFrame getWindow() {
        return window;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public JRadioButton getTextButton() {
        return textButton;
    }

    public JRadioButton getTextAreaButton() {
        return textAreaButton;
    }

    public JRadioButton getCheckBoxButton() {
        return checkBoxButton;
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getClearButton() {
        return clearButton;
    }

    public JButton getExitButton() {
        return exitButton;
    }


}