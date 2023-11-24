package Entities;

import javax.swing.*;
import java.awt.*;

public class TotalPanel extends JPanel {
    public TotalPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);

        add(new JLabel("Total de Ingressos Vendidos:"), gbc);
        gbc.gridx++;
        add(new JTextField(10), gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        add(new JLabel("Valor Arrecadado:"), gbc);
        gbc.gridx++;
        add(new JTextField(10), gbc);
    }
}
