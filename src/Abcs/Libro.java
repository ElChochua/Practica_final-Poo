
package Abcs;

public class Libro {
    private String sinopsis, titulo, autor,editorial, codigo_Id,generos, fecha_Lanzamiento;
    private int paginas;
    public Libro(){
        this.titulo = "";
        this.autor = "";
        this.codigo_Id = "";
        this.generos = "";
        this.fecha_Lanzamiento = "";
        this.sinopsis = "";
        this.paginas = 0;
    }
    public Libro(int paginas, String titulo, String autor, String codigo_Id, String generos, String fecha_Lanzamiento, String sinopsis){
        this.titulo = titulo;
        this.autor = autor;
        this.sinopsis = sinopsis;
        this.codigo_Id = codigo_Id;
        this.generos = generos;
        this.fecha_Lanzamiento = fecha_Lanzamiento;
        this.paginas = paginas;
    }
    public void setEditorial(String editorial){
        this.editorial = editorial;
    }
    public String getEditorial(){
        return editorial;
    }
    public void setSinopsis(String sinopsis){
        this.sinopsis = sinopsis;
    }
    public String getSinopsis(){
        return sinopsis;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCodigo_Id() {
        return codigo_Id;
    }

    public void setCodigo_Id(String codigo_Id) {
        this.codigo_Id = codigo_Id;
    }

    public String getGeneros() {
        return generos;
    }

    public void setGeneros(String generos) {
        this.generos = generos;
    }

    public String getFecha_Lanzamiento() {
        return fecha_Lanzamiento;
    }

    public void setFecha_Lanzamiento(String fecha_Lanzamiento) {
        this.fecha_Lanzamiento = fecha_Lanzamiento;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}
