package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import model.Checkbox;
import model.Component;
import model.TextArea;
import model.TextField;
import view.MenuScreen;
import view.Simulator;

public class EventListener implements ActionListener{

    private Simulator simulator;

    private Component component;



    public EventListener(Simulator simulator){
        this.simulator = simulator;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        Object source = e.getSource();

        if(source == simulator.getExitButton()){
            System.out.println("Exit Button Clicked");
            JFrame window = simulator.getWindow();
            window.getContentPane().removeAll();
            var menu = new MenuScreen(window);
            menu.init();
            window.pack();
            window.revalidate();
        }else if(source == simulator.getAddButton()){
            System.out.println("add Button Clicked");
            simulator.getCanvas().getComponentList().add(simulator.getComponent());
            simulator.getCanvas().repaint();
           
        }else if(source == simulator.getClearButton()){
            System.out.println("clear Button Clicked");
            simulator.getCanvas().getComponentList().clear();
            simulator.getCanvas().repaint();

        }else if(source == simulator.getTextButton()){
            System.out.println("textfield Button Clicked");
            component = new TextField();
            simulator.setComponent(component);
            simulator.getCanvas().repaint();
        }else if(source == simulator.getTextAreaButton()){
            System.out.println("TextArea Button Clicked");
            component = new TextArea();
            simulator.setComponent(component);
            simulator.getCanvas().repaint();
        }else if(source == simulator.getCheckBoxButton()){
            System.out.println("Checkbox Button Clicked");
            component = new Checkbox();
            simulator.setComponent(component);
            simulator.getCanvas().repaint();
        }
        
    }
  
    
    
}
