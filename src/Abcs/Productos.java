package Abcs;

public class Productos {
    private String nombre, id, descripcion, proveedor;
    private int cantidad, precio;
    public Productos(){
        this.nombre = "";
        this.id = "";
        this.descripcion = "";
        this.proveedor = "";
        this.cantidad = 0;
        this.precio = 0;
    }
    public Productos(String nombre, String id, String descripcion, String proveedor, int cantidad, int precio){
        this.nombre = nombre;
        this.id = id;
        this.descripcion = descripcion;
        this.proveedor = proveedor;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setProveedor(String proveedor){
        this.proveedor = proveedor;
    }
    public String getProveedor(){
        return proveedor;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    public int getCantidad(){
        return cantidad;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
    public int getPrecio(){
        return precio;
    }
    
    
}
