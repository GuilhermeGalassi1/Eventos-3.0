package Entities;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EspacoPanel extends JPanel {
    public EspacoPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);

        add(new JLabel("Localização:"), gbc);
        gbc.gridx++;
        add(new JTextField(30), gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        add(new JLabel("Horário:"), gbc);
        gbc.gridx++;
        add(new JTextField(30), gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        add(new JLabel("Data:"), gbc);
        gbc.gridx++;
        add(new JCalendar(), gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        add(new JLabel("Valor do Espaço:"), gbc);
        gbc.gridx++;
        add(new JTextField(10), gbc);
    }
}
