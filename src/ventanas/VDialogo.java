
package ventanas;

import javax.swing.JDialog;


public class VDialogo extends JDialog {
    
    public VDialogo(){
        setSize(500,400);//DIMENSIONES DE ALTO POR ANCHO DE LA VENTANA
        setTitle("VENTANA DIALOGO");//TITULO DE LA VENTANA
        setLocationRelativeTo(null);//NOS UBICA EN EL CENTRO
        //setBounds(60,120, 500, 400);//UBICACIÓN HORIZONTAL(IZQUIERDA), (ARRIBA)VERTICAL, ANCHO, ALTO
        setVisible(true);//SE PUEDA VISUALIZAR, DE NO SER ASI LA APLICACIÓN AL CORRERLA NO VA A MOSTRAR NADA
    }
    
}
