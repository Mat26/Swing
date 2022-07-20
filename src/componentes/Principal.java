package componentes;


public class Principal {

    public static void main(String[] args) {
        //1. COMPONENTES ATOMICOS - Son elementos que no pueden almacenar otros objetos o componentes Gráficos.
        //http://codejavu.blogspot.com/2013/09/componentes-atomicos-java-swing.html
        Atomicos ventanaAtomica = new Atomicos();
        ventanaAtomica.setVisible(true);
        //2. COMPONENTES TEXTO - Nos permite procesar datos de tipo cadena.
        //http://codejavu.blogspot.com/2013/09/componentes-de-texto-java-swing.html
        Texto miVentanaPrincipal = new Texto();
        miVentanaPrincipal.setVisible(true);
        //3. MENUS - Nos brinda opciones que queremos realizar.
        //http://codejavu.blogspot.com/2013/09/menus-con-java-swing.html
        Menu menus = new Menu();
        menus.setVisible(true);
        
    }
}
