/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;

/**
 *
 * @author Adrian
 */
public class Cuenta implements Serializable {
    private String Nombre;
    private String Clave;
    private String Status;

    public Cuenta() {
    }

    public Cuenta(String Nombre, String Clave, String Status) {
        this.Nombre = Nombre;
        this.Clave = Clave;
        this.Status = Status;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
}
