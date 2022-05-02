package poo;

public class AppBiblioteca {
	public static void main(String[] args){
		Libro libro = new Libro("129311", "Luis y las vacas", 1991);
		
		libro.devolver();
		libro.prestar();
		libro.prestado();
		System.out.println(libro);
	}
}
