/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

import Clases.Cuenta;
import Persistencia.Persistencia;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Adrian
 */
public class Accounts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here

        Persistencia persistencia = new Persistencia();
//        persistencia.BuildUp();
//        persistencia.StartUp();
//        Cuenta cuenta1= new Cuenta("Adrian", "01", "ONLINE");
//        Cuenta cuenta2= new Cuenta("Adrian", "02", "ONLINE");
//        Cuenta cuenta3= new Cuenta("Adrian", "03", "ONLINE");
//        Cuenta cuenta4= new Cuenta("Adrian", "04", "ONLINE");
//        Cuenta cuenta5 = new Cuenta("Adrian", "05", "ONLINE");
//        Cuenta cuenta6 = new Cuenta("Adrian", "06", "ONLINE");
               Cuenta cuenta7 = new Cuenta("Adrián", "06", "ONLINE");
//        persistencia.Guardar(cuenta1);
//        persistencia.Guardar(cuenta2);
//        persistencia.Guardar(cuenta3);
//        persistencia.Guardar(cuenta4);
//        persistencia.Guardar(cuenta5);
        persistencia.Guardar(cuenta7);
        persistencia.CountUp();
    }
}
