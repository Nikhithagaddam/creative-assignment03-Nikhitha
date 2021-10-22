package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class MenuScreen {

    private JFrame window;

    public MenuScreen(JFrame window){
        this.window=window;
    }

    public void init(){
        Container cp = window.getContentPane();
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(500,200));
        panel.setLayout(new GridLayout(1,1));
        JButton button = new JButton("Enter into Form Builder");
        panel.add(button);
        cp.add(BorderLayout.CENTER,panel);
        button.addActionListener( action -> 
        {

            System.out.println("Enter into Form Builder System");
            window.getContentPane().removeAll();
            var simulator = new Simulator(window);
            simulator.init();
            window.pack();
            window.revalidate();


        }
        
        );
    }

}
