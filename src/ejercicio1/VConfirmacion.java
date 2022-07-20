package ejercicio1;


import javax.swing.JDialog;
import javax.swing.JLabel;

public class VConfirmacion extends JDialog {

    //ATRIBUTO
    JLabel labelTitulo;
    
    
    //CONSTRUCTOR
    public VConfirmacion(VentanaPrincipal miVentanaPrincipal, boolean modal) {
        /**
         * Al llamar al constructor super(), le enviamos el JFrame Padre y la
         * propiedad booleana que determina que es hija
         */
        super(miVentanaPrincipal, modal);
        getContentPane().setLayout(null);
        //Asigna un titulo a la barra de titulo
        setTitle("CoDejaVu : JDialog VentanaConfirmacion");

        labelTitulo = new JLabel();
        labelTitulo.setText("VENTANA DE CONFIRMACION");
        labelTitulo.setBounds(90, 20, 180, 23);

        add(labelTitulo);
        //tamaño de la ventana
        setSize(350, 150);
        //pone la ventana en el Centro de la pantalla
        setLocationRelativeTo(null);
    }

}
