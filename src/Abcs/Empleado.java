package Abcs;

public class Empleado extends Persona{
    int numero_Empleado;
    int salario;
    String cargo, puesto, supervisor;
    public Empleado(){
        this.numero_Empleado = 0;
        this.salario = 0;
        this.cargo = "";
        this.puesto = "";
        this.supervisor = "";
    }
    public Empleado(String nombre, String sexo, String nacionalidad, String estadoCivil, String telefono, String correo, int edad, int numero_Empleado, int salario, String cargo, String puesto, String supervisor){
        super(nombre, sexo, nacionalidad, estadoCivil, telefono, correo, edad);
        this.numero_Empleado = numero_Empleado;
        this.salario = salario;
        this.cargo = cargo;
        this.puesto = puesto;
        this.supervisor = supervisor;
    }

    public void setNumero_Empleado(int numero_Empleado) {
        this.numero_Empleado = numero_Empleado;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public int getNumero_Empleado() {
        return numero_Empleado;
    }

    public int getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getSupervisor() {
        return supervisor;
    }
    
}
