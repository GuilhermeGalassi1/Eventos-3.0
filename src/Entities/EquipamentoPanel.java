package Entities;

import javax.swing.*;
import java.awt.*;

public class EquipamentoPanel extends JPanel {
    public EquipamentoPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);

        add(new JLabel("Descrição do Equipamento:"), gbc);
        gbc.gridx++;
        add(new JTextField(30), gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        add(new JLabel("Valor do Equipamento:"), gbc);
        gbc.gridx++;
        add(new JTextField(10), gbc);
    }
}
