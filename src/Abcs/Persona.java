package Abcs;
import java.sql.*;
public class Persona {
    private String nombre, sexo, nacionalidad, estadoCivil,
    telefono,correo;
    private int edad;
    public Persona(){
        this.nombre = "";
        this.sexo = "";
        this.nacionalidad = "";
        this.estadoCivil = "";
        this.telefono = "";
        this.correo = "";
        this.edad = 0;
    }

    public Persona(String nombre, String genero, String nacionalidad, String estadoCivil, String telefono, String correo, int edad) {
        this.nombre = nombre;
        this.sexo = genero;
        this.nacionalidad = nacionalidad;
        this.estadoCivil = estadoCivil;
        this.telefono = telefono;
        this.correo = correo;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public int getEdad() {
        return edad;
    }
    
    
}
