package ui;

import bussines.ContateBussines;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    private JPanel rootPanel;
    private JButton NovoContato;
    private JButton ButtonRemove;
    private JTable TableContext;

    private ContateBussines mContactBussiness;

    public MainForm() {

        setContentPane(rootPanel);
        setSize(500, 250);
        setVisible(true);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width / 2 - getSize().width, dim.height / 2 - getSize().height);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mContactBussiness = new ContateBussines();

        setListenners();
        LocadContacts();
    }

    private void LocadContacts() {
        mContactBussiness.getList();
    }

    private void setListenners() {

        NovoContato.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new ContatForm();
                dispose();
            }
        });

        ButtonRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }
}

