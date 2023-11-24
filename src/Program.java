import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;

import Entities.GastosPanel;
import Entities.TotalPanel;
import Entities.ValorIngressosPanel;
import Entities.ValoresEntradaPanel;

public class Program extends JFrame {
    public Program() {
        setTitle("Calculadora de Eventos");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Adiciona as abas
        tabbedPane.addTab("Valores de entrada", new ValoresEntradaPanel());
        tabbedPane.addTab("Valor dos ingressos", new ValorIngressosPanel());
        tabbedPane.addTab("Gastos", new GastosPanel());
        tabbedPane.addTab("Total", new TotalPanel());
        add(tabbedPane);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Program());
    }
}
