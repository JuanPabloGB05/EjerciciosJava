package ficheros;

import java.io.File;

public class Ejercicio1 {

	public static void main(String[] args) {
		File f = new File(args[0]);
		System.out.println(f.exists());
		System.out.println(f.isDirectory());
		System.out.println(f.getName());
		System.out.println(f.canExecute() + " - " + f.canRead() + " - " + f.canWrite());
		if (!f.isDirectory())
			System.out.println(f.length());
	}
	
}
