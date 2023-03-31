//Francisco Jos� Cabello Lij�, 1�DAM

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

// 2.b
public class AgendaB {
	private Set<Contacto> contactos;
	final static int max_contactos = 500;

	public AgendaB(Contacto[] c) {
		contactos = new HashSet<>();
		for (Contacto cont : c) {
			contactos.add(cont);
		}
	}

	// 3.1
	public AgendaB() {
		this(max_contactos);
	}

	// 3.2
	public Contacto buscaContacto(String nombre, String apellidos) {
		for (Contacto c : contactos) {
			if (c.getNombre().equalsIgnoreCase(nombre) && c.getApellidos().equalsIgnoreCase(apellidos)) {
				return c;

			}
		}
		return null;
	}

	// 3.3
	public int buscaContacto(Contacto cont) {
		int i = 0;
		for (Contacto c : contactos) {
			if (c.equals(cont)) {
				return i;
			}
			i++;
		}
		return -1;
	}

	// 3.4
	public boolean existeContacto(Contacto c) {
		for (int i = 0; i < contactos.size(); i++) {
			if (contactos.get(i).getTelefono() == c.getTelefono()) {
				return true;
			}
		}
		return false;
	}

	public void agregaContacto(Contacto c) {
		if (!existeContacto(c)) {
			contactos.add(c);
		}
	}

	// 3.5
	public void eliminaTodos() {
		contactos.clear();
	}

	// 3.6
	public String toString() {
		String datos = "";
		for (Contacto c : contactos) {
			datos = datos + c;
			datos = datos + " - ";
		}
		return datos;
	}

	// 3.7
	public void presentaFichero(String nombreFichero) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(nombreFichero);
		for (Contacto c : contactos) {
			pw.println(c);
		}
		pw.close();
	}

}
