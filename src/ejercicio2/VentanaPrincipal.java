package ejercicio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class VentanaPrincipal extends JFrame implements ActionListener {

    JCheckBox check1, check2, check3;
    JRadioButton radio1, radio2, radio3;
    ButtonGroup grupoDeRadios;
    JComboBox<String> combo1;
    JButton boton;

    public VentanaPrincipal() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 350);
        getContentPane().setLayout(null);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        check1 = new JCheckBox();
        check1.setText("Check1");
        check1.setBounds(20, 30, 120, 40);

        check2 = new JCheckBox();
        check2.setText("Check2");
        check2.setBounds(20, 60, 120, 40);

        check3 = new JCheckBox();
        check3.setText("Check3");
        check3.setBounds(20, 90, 120, 40);

        boton = new JButton();
        boton.setText("Boton");
        boton.setBounds(230, 60, 120, 40);
        boton.addActionListener(this);

        radio1 = new JRadioButton();
        radio1.setText("Radio1");
        radio1.setBounds(20, 120, 120, 40);

        radio2 = new JRadioButton();
        radio2.setText("Radio2");
        radio2.setBounds(20, 150, 120, 40);

        radio3 = new JRadioButton();
        radio3.setText("Radio3");
        radio3.setBounds(20, 180, 120, 40);

        grupoDeRadios = new ButtonGroup();
        grupoDeRadios.add(radio1);
        grupoDeRadios.add(radio2);
        grupoDeRadios.add(radio3);

        combo1 = new JComboBox<>();
        combo1.setBounds(20, 220, 140, 20);
        combo1.setModel(new DefaultComboBoxModel<>(new String[]{"Opciones","Opcion 1", "Opcion 2", "Opcion 3"}));
        //combo1.addItem("Seleccione")

        add(check1);
        add(check2);
        add(check3);
        add(boton);
        add(radio1);
        add(radio2);
        add(radio3);
        add(combo1);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton) {
            String check = validarSeleccion();
            String radio = validarRadios();
            String combo = validarCombo();
            JOptionPane.showMessageDialog(null, "Check seleccionado(s): " + check + "\n"
                    + "Radio seleccionado: " + radio + "\n"
                    + "Combo seleccionado: " + combo);
        }
    }

    private String validarSeleccion() {
        String seleccion = "";

        if (check1.isSelected()) {
            seleccion += "\nCheck1";
        }
        if (check2.isSelected()) {
            seleccion += "\nCheck2";
        }
        if (check3.isSelected()) {
            seleccion += "\nCheck3";
        }
        return seleccion;
    }

    private String validarRadios() {
        String cad = "";

        if (radio1.isSelected()) {
            cad += "Radio 1";
        }else if(radio2.isSelected()) {
            cad += "Radio 2";
        }else{
            cad += "Radio 3";
        }
        
        return cad;
    }

    private String validarCombo() {

        if (combo1.getSelectedItem().equals("Opcion 1")) {
            return "Opcion 1";
        }
        if (combo1.getSelectedItem().equals("Opcion 2")) {
            return "Opcion 2";
        }
        if (combo1.getSelectedItem().equals("Opcion 3")) {
            return "Opcion 3";
        }
        return "No fue seleccionado ninguna opción..";
    }

}
