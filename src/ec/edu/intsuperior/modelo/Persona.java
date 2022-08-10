
package ec.edu.intsuperior.modelo;
import java.util.Date;

/**
 *
 * @author DAVID
 */
public  abstract class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String correo;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String cedula, String nombre, String apellido, String direccion, String correo, Date fechaNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    public String getCedula() {
        return cedula;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    @Override
    public String toString() {
        return   "Cedula: "+getCedula()+"\n"
                + "Nombre: "+getNombre()+"\n"
                + "Apellido: "+getApellido()+"\n"
                + "Direccion; "+getDireccion()+"\n"
                + "Correo: "+getCorreo();
    }
    
}
