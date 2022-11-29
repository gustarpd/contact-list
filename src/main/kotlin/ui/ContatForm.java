package ui;

import bussines.ContateBussines;
import entity.ContactEntity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ContatForm extends JFrame {

    private JPanel rootPanelForm;
    private JTextField nomeTextField;
    private JTextField TextPhone;
    private JButton ButtonSave;
    private JButton ButtinCancelar;

    private ContateBussines mContactBussiness;

    public ContatForm() {
        setContentPane(rootPanelForm);
        setSize(500, 250);
        setVisible(true);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width / 2 - getSize().width, dim.height / 2 - getSize().height);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setListeners();
        loadContacts();

        mContactBussiness = new ContateBussines();
    }

    private void loadContacts() {
        List<ContactEntity> contactList = mContactBussiness.getList();
    }

    private void setListeners() {

        ButtonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        ButtinCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainForm();
                dispose();
            }
        });
    }
}
