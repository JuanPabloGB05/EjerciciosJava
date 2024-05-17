package ficheros;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ejercicio2 {

//	public static void main(String[] args) throws IOException {
//		File f = new File("c:\\Users\\Julio\\Documents\\Quijote.txt");
//		long t0 = System.nanoTime();
//		try (FileInputStream in = new FileInputStream(f)) {
//			while (in.read() != -1);
//		}
//		long t1 = System.nanoTime() - t0;
//		System.out.println(t1);
//		t0 = System.nanoTime();
//		try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(f))) {
//			while (in.read() != -1);
//		}
//		t1 = System.nanoTime() - t0;
//		System.out.println(t1);
//	}
	
	public static void main(String[] args) {
		File f = new File("El Quijote UTF8.txt");
		long t0 = System.nanoTime();
		FileInputStream in1 = null;
		try {
			in1 = new FileInputStream(f);
			while (in1.read() != -1);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in1 != null)
				try {
					in1.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		long t1 = System.nanoTime() - t0;
		System.out.println(t1);
		t0 = System.nanoTime();
		BufferedInputStream in2 = null;
		try {
			in2 = new BufferedInputStream(new FileInputStream(f));
			while (in2.read() != -1);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in2 != null)
				try {
					in2.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		t1 = System.nanoTime() - t0;
		System.out.println(t1);
	}

}
