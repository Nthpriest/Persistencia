/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Clases.Cuenta;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adrian
 */
public class Persistencia implements Serializable {

    private List<Cuenta> ListaCuentas;
    File Lista[];
    File Accounts = new File("C:\\Users\\Adrian\\Documents\\ITSON\\Metodos numericos\\Accounts\\Accounts");

    public Persistencia() {
        this.ListaCuentas = new ArrayList<>();

    }

    public void StartUp() throws IOException, ClassNotFoundException {
        this.Lista = Accounts.listFiles();
        for (int i = 0; i < Lista.length; i++) {
            ObjectInputStream file = new ObjectInputStream(new FileInputStream(Lista[i]));
            Cuenta cuenta = (Cuenta) file.readObject();
            ListaCuentas.add(cuenta);
            System.out.println(cuenta.getClave());
        }
            System.out.println("---------------------------------");
    }

    public void BuildUp() {
        if (!Accounts.exists()) {
            Accounts.mkdir();
            System.out.println("Carpeta Accounts Creada");
        }
    }

    public void CountUp() {
        if (!Accounts.exists()) {
            System.out.println("Carpeta Accounts no Existe");
        } else {
            for (int e = 0; e < this.ListaCuentas.size(); e++) {
                System.out.println(ListaCuentas.get(e).getClave());
            }

        }
    }

    public void Guardar(Cuenta cuenta) throws FileNotFoundException, IOException, ClassNotFoundException {
        try {
                ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream(Accounts.getAbsolutePath() + "\\" + cuenta.getNombre() + cuenta.getClave() + ".txt"));
            file.writeObject(cuenta);
            file.close();
        } catch (Exception e) {
        }
        Reload();
    }
    
    public void Reload() throws FileNotFoundException, IOException, ClassNotFoundException{
        this.Lista = Accounts.listFiles();
        List<Cuenta> ListaProvisional= new ArrayList<>();
        for (int i = 0; i < Lista.length; i++) {
            ObjectInputStream file = new ObjectInputStream(new FileInputStream(Lista[i]));
            Cuenta cuenta = (Cuenta) file.readObject();
            ListaProvisional.add(cuenta);
        }
        this.ListaCuentas=ListaProvisional;
    }
}
