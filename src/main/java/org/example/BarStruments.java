package org.example;

import javax.swing.*;
import java.awt.*;

public class BarStruments extends JPanel {

    private JButton giorno;
    private JButton sera;

    public BarStruments() {
        giorno = new JButton("Giorno");
        sera = new JButton("Sera");

        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(giorno);
        add(sera);
    }

}
