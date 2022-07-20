package ejercicio3;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class VentanaPrincipal extends JFrame implements ActionListener {

    private JMenuBar barra;
    private JMenu menuOpciones;
    private JMenuItem itemSuma, itemResta, itemMulti;
    private JButton operaButton;
    private JFormattedTextField num1Text, num2Text;
    private final Calculos operaciones = new Calculos();

    public VentanaPrincipal() throws ParseException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 180);
        getContentPane().setLayout(null);
        iniciarComponentes();
    }

    private void iniciarComponentes() throws ParseException {
        barra = new JMenuBar();

        itemSuma = new JMenuItem("Suma");
        itemSuma.addActionListener(this);

        itemResta = new JMenuItem("Resta");
        itemResta.addActionListener(this);

        itemMulti = new JMenuItem("Multiplicación");
        itemMulti.addActionListener(this);

        menuOpciones = new JMenu("Opciones");
        menuOpciones.add(itemSuma);
        menuOpciones.add(itemResta);
        menuOpciones.add(itemMulti);

        operaButton = new JButton();
        operaButton.setText("Sumar");
        operaButton.setBounds(90, 80, 150, 30);
        operaButton.addActionListener(this);

        
        num1Text = new JFormattedTextField(NumberFormat.getCurrencyInstance());
        num1Text.setFocusLostBehavior(JFormattedTextField.COMMIT);
        num1Text.setText("0");
        num1Text.setBounds(30, 30, 120, 23);
        
        num2Text = new JFormattedTextField(NumberFormat.getCurrencyInstance());
        num2Text.setEditable(true);
        num2Text.setFocusLostBehavior(JFormattedTextField.COMMIT);
        num2Text.setText("0");
        num2Text.setBounds(180, 30, 120, 23);

        barra.add(menuOpciones);
        setJMenuBar(barra);

        add(operaButton);
        add(num1Text);
        add(num2Text);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == itemSuma) {
            validaciones("Sumar");
        }
        if (e.getSource() == itemResta) {
            validaciones("Restar");
        }
        if (e.getSource() == itemMulti) {
            validaciones("Multiplicar");
        }
        if (e.getSource() == operaButton) {
            accionOperacion();
        }

    }

    private void validaciones(String operacion) {
        operaButton.setText(operacion);
    }

    private void accionOperacion() {
        long resultado;
        if (num1Text.getText().trim().isEmpty() || num2Text.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No ha igresado información");
        } else {
            switch (operaButton.getText()) {
                case "Restar":
                    resultado = operaciones.restar(Long.parseLong(num1Text.getText().trim()), Long.parseLong(num2Text.getText().trim()));
                    JOptionPane.showMessageDialog(null, resultado);
                    break;
                case "Multiplicar":
                    resultado = operaciones.multiplicar(Long.parseLong(num1Text.getText().trim()), Long.parseLong(num2Text.getText().trim()));
                    JOptionPane.showMessageDialog(null, resultado);
                    break;
                default:
                    resultado = operaciones.sumar(Long.parseLong(num1Text.getText().trim()), Long.parseLong(num2Text.getText().trim()));
                    JOptionPane.showMessageDialog(null, resultado);
                    break;
             
            }

        }
        
    }

}
