package herencia.biblioteca;

public class Publicacion {

	protected String codigo;
	protected String titulo;
	protected int año;
	public Publicacion(String codigo, String titulo, int año) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.año = año;
		
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	@Override
	public String toString() {
		return "Publicacion [codigo=" + codigo + ", titulo=" + titulo + ", año=" + año + "]";
	}
	
	
}
