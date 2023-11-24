package Entities;

import javax.swing.*;
import java.awt.*;

public class ValoresEntradaPanel extends JPanel {
    public ValoresEntradaPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);

        String[] lotes = {"Primeiro", "Segundo", "Terceiro", "Quarto", "Quinto"};

        for (String lote : lotes) {
            add(new JLabel(lote + " Lote:"), gbc);
            gbc.gridx++;
            add(new JTextField(10), gbc);
            gbc.gridx = 0;
            gbc.gridy++;
        }
    }
}
