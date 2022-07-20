package Registro;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class VentanaPersona extends JFrame implements ActionListener, MouseListener{

    private JButton botonAdd;
    private JLabel nombreLabel;
    private JLabel apellidoLabel;
    private JLabel edadLabel;
    private JLabel tituloLabel;
    private JFormattedTextField edadText;
    private JTextField nombreText;
    private JTextField apellidoText;
    private JTable tablaPersonas;
    private JScrollPane scroll;
    private List<Persona> personas = new ArrayList<>();    
    

    public VentanaPersona() {
        setTitle("Mintic : Registro Personas");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(462, 463);
        getContentPane().setLayout(null);

        initComponents();
        
    }

    private void initComponents() {

        tituloLabel = new JLabel();
        tituloLabel.setText("Registro");
        tituloLabel.setFont(new Font("Tahoma", 1, 20));
        tituloLabel.setBounds(130, 5, 380, 40);

        nombreLabel = new JLabel();
        nombreLabel.setText("Nombre:");
        nombreLabel.setBounds(20, 50, 280, 23);

        nombreText = new JTextField();
        nombreText.setBounds(80, 50, 100, 23);

        apellidoLabel = new JLabel();
        apellidoLabel.setText("Apellido:");
        apellidoLabel.setBounds(20, 80, 80, 23);

        apellidoText = new JTextField();
        apellidoText.setBounds(80, 80, 100, 23);

        edadLabel = new JLabel();
        edadLabel.setText("Edad:");
        edadLabel.setBounds(20, 120, 80, 23);

        edadText = new JFormattedTextField(NumberFormat.getCurrencyInstance());
        edadText.setText("0");
        edadText.setFocusLostBehavior(JFormattedTextField.COMMIT);
        edadText.setBounds(80, 120, 80, 23);
        
        botonAdd = new JButton();
        botonAdd.setText("Add");
        botonAdd.setBounds(320, 150, 80, 23);
        botonAdd.addActionListener(this);
        
        tablaPersonas = new JTable();
        scroll = new JScrollPane();
        scroll.setBounds(27, 180, 379, 130);

        

        add(tituloLabel);
        add(nombreLabel);
        add(nombreText);
        add(apellidoLabel);
        add(apellidoText);
        add(edadLabel);
        add(edadText);
        add(botonAdd);
        add(scroll);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == botonAdd){
           personas.add(new Persona(nombreText.getText(),apellidoText.getText(), Integer.parseInt(edadText.getText().trim())));
           construirTabla();
           cleanRegistro();
       }
    }

    private void construirTabla() {
       String titulos[] = {"nombre", "apellido", "edad","",""};
       String informacion[][] = obtenerPersonas();
       
       tablaPersonas = new JTable(informacion,titulos);
       tablaPersonas.addMouseListener(this);
       scroll.setViewportView(tablaPersonas);
    }

    private String[][] obtenerPersonas() {
       String informacion[][] = new String[personas.size()][5];
       for(int i = 0; i < informacion.length; i++){
           informacion[i][0] = personas.get(i).getName();
           informacion[i][1] = personas.get(i).getApellido();
           informacion[i][2] = personas.get(i).getEdad()+"";
           informacion[i][3] = "Update";
           informacion[i][4] = "Delete";
       }
       return informacion;
    }
    
    private void cleanRegistro(){
        nombreText.setText("");
        apellidoText.setText("");
        edadText.setText("");
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int fila =  tablaPersonas.rowAtPoint(e.getPoint());
        int columna =  tablaPersonas.columnAtPoint(e.getPoint());
        if(columna == 3){
            personas.set(fila, new Persona(tablaPersonas.getValueAt(fila, 0).toString(),tablaPersonas.getValueAt(fila, 1).toString(), Integer.parseInt(tablaPersonas.getValueAt(fila, 2).toString())));
            construirTabla();
        }
        if(columna == 4){
            personas.remove(fila);
            construirTabla();            
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

}
