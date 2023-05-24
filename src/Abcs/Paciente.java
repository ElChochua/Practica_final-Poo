package Abcs;

public class Paciente extends Persona{
    String tipoSangre, alergias, enfermedades, antecedentes, ocupacion,peso, estatura;
    public Paciente(){
        this.tipoSangre = "";
        this.alergias = "";
        this.enfermedades = "";
        this.antecedentes = "";
        this.ocupacion = "";
        this.peso = "";
        this.estatura = "";
    }
    public Paciente(String tipoSangre, String alergias, String enfermedades, String antecedentes, String ocupacion, String peso, String estatura, String nombre, String genero, String nacionalidad, String estadoCivil, String telefono, String correo, int edad){
        super(nombre, genero, nacionalidad, estadoCivil, telefono, correo, edad);
        this.tipoSangre = tipoSangre;
        this.alergias = alergias;
        this.enfermedades = enfermedades;
        this.antecedentes = antecedentes;
        this.ocupacion = ocupacion;
        this.peso = peso;
        this.estatura = estatura;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }
}
