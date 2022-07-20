package ejercicio1;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaPrincipal extends JFrame implements ActionListener {

    //Atributos
    JButton botonCambiar;
    JLabel labelTitulo;

    //Constructor
    public VentanaPrincipal() {        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ejercicio1 : JFRAME y JDialog");
        setSize(300, 180);
        setLocationRelativeTo(null);
        iniciarComponentes();
    }

  

    //Inicar la pantalla de bienvenida
    private void iniciarComponentes() {
        //INSTANCIAMOS EL CONTENEDOR
        getContentPane();
        //PODEMOS DEFINIR TAMAÑO Y POSICION DE LOS COMPONENTES 
        setLayout(null);
        //TITULO
        labelTitulo = new JLabel();
        labelTitulo.setText("VENTANA PRINCIPAL");
        labelTitulo.setBounds(80, 20, 180, 23);
        //BOTON
        botonCambiar = new JButton();
        botonCambiar.setText("Iniciar");
        botonCambiar.setBounds(100, 80, 80, 23);
        botonCambiar.addActionListener(this);//Sin esta línea no podría ser funcional el botón..       
        //AGREGAR AL CONTENEDOR
        add(labelTitulo);
        add(botonCambiar);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == botonCambiar) {
            VConfirmacion miVentanaConfirmacion = new VConfirmacion(this, true);
            miVentanaConfirmacion.setVisible(true);
        }
    }
}
