package ventanas;

public class JFrameAndDialogMain {
    //http://codejavu.blogspot.com/2013/08/jframe-y-jdialog.html
    public static void main(String[] args) {
        //JFRAME - Permite alojar otros componentes y representa la ventana principal de la app.
        VJFrame jframe = new VJFrame();
        jframe.setVisible(true);
        //JDialog - Ventana secundaria.
        VDialogo dialogo = new VDialogo();
        dialogo.setVisible(true);
    }

}
