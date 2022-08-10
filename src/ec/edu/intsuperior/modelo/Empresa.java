/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author DAVID
 */
public class Empresa {
   private String ruc;
   private String nombre;
   private String direccion;
   private String telefonoContacto;
   private String correo;

    public Empresa() {
      
    }

    public Empresa(String ruc, String nombre, String direccion, String telefonoContacto, String correo) {
        this.ruc = ruc;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefonoContacto = telefonoContacto;
        this.correo = correo;
    }
    

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return  "Ruc: "+getRuc()+"\n"
                + "Nombre: "+getNombre()+"\n"
                + "Direccion: "+getDireccion()+"\n"
                + "Telefono de contacto; "+getTelefonoContacto()+"\n"
                + "Correo: "+getCorreo();
    }
    
    
   
   
   
   
    
    
}
