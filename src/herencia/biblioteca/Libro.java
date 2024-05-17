package herencia.biblioteca;

public class Libro extends Publicacion implements Prestable {

	private String autor;
	private boolean prestado;
	
	public Libro(String codigo, String titulo, int año, String autor) {
		super(codigo, titulo, año);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	@Override
	public String toString() {
		return super.toString() + " Libro [autor=" + autor + "]";
	}

	@Override
	public void prestar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		
	}

}
