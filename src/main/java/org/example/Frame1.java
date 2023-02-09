package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame1 extends JFrame {

    private TextAreaPanel textAreaPanel;
    private JButton button;
    private BarStruments struments;

    public Frame1() {

        super("Rame83's Test");

        setLayout(new BorderLayout());

        struments = new BarStruments();
        textAreaPanel = new TextAreaPanel();
        button = new JButton("Clicca per accedere");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   textAreaPanel.appendiTesto("Ciao \n");
            }
        });

        add(textAreaPanel, BorderLayout.CENTER);
        add(button, BorderLayout.PAGE_END);
        add(struments, BorderLayout.PAGE_START);

        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


    }

}
