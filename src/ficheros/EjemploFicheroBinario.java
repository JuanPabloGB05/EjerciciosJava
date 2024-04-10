package ficheros;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploFicheroBinario {

	public static void main(String[] args) throws IOException {
		File f = new File("c:\\Users\\Julio\\Documents\\ejemplo");
		try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f)))) {
			out.writeInt(73428);
			out.writeUTF("Hola Mundo!");
			out.writeLong(65536);
			out.writeBoolean(false);
			out.writeDouble(30e-9);
		}
		
		try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(f)))) {
			System.out.println(in.readInt());
			System.out.println(in.readUTF());
			System.out.println(in.readLong());
			System.out.println(in.readBoolean());
			System.out.println(in.readDouble());
		}
	}

}
