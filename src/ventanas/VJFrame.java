
package ventanas;

import javax.swing.JFrame;


public class VJFrame extends JFrame {
    
    public VJFrame(){//CONSTRUCTOR DEFINE COMO VA A ESTAR CONSTRUIDO NUESTRA VENTANA
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,400);//DIMENSIONES DE ALTO POR ANCHO DE LA VENTANA
        setTitle("VENTANA PRINCIPAL");//TITULO DE LA VENTANA
        setLocationRelativeTo(null);//NOS UBICA EN EL CENTRO
        //setBounds(60,120, 500, 400);//UBICACIÓN HORIZONTAL(IZQUIERDA), (ARRIBA)VERTICAL, ANCHO, ALTO
        //setVisible(true);//SE PUEDA VISUALIZAR, DE NO SER ASI LA APLICACIÓN AL CORRERLA NO VA A MOSTRAR NADA
    }
    
}
