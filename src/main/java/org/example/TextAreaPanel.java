package org.example;

import javax.swing.*;
import java.awt.*;

public class TextAreaPanel extends JPanel {


    private static JTextArea textArea;

    public TextAreaPanel(){
        textArea = new JTextArea();

        setLayout(new BorderLayout());

        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }

    public void appendiTesto(String testo) {
        textArea.append(testo);
    }

}
