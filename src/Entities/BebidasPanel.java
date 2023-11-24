package Entities;

import javax.swing.*;
import java.awt.*;

public class BebidasPanel extends JPanel {
    public BebidasPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);

        String[] tiposBebidas = {"Água", "Destilado", "Fermentado", "Suco", "Refrigerante"};

        for (String tipo : tiposBebidas) {
            add(new JLabel("Descrição de " + tipo + ":"), gbc);
            gbc.gridx++;
            add(new JTextField(30), gbc);
            gbc.gridx = 0;
            gbc.gridy++;
        }

        gbc.gridx = 0;
        gbc.gridy++;
        add(new JLabel("Valor Total de Bebidas:"), gbc);
        gbc.gridx++;
        add(new JTextField(10), gbc);
    }
}
