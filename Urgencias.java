import java.io.PrintWriter;
import java.util.*;

// a - Constructor
public class Urgencias {
	private int dia;
	private int mes;
	Set<Ingreso> ingresos = new HashSet<Ingreso>();

	public Urgencias(int d, int m) {
		this.dia = d;
		this.mes = m;
	}

	// b - Colecci�n de ingresos
	public void agregaServicio(Collection<Ingreso> ingresos) {
		ArrayList<Ingreso> coleccion;
	}

	// c - Servicios realizados
	public int urgenciasAtendidas() {
		return 0;

	}

	// d - Pacientes atendidos por ese m�dico
	Collection<String> pacientesPorMedico(String codigoMedico) {
		return null;

	}

	// e - No puntuable

	// f - No puntuable. Lee por l�nea
	public void agregaServicio(String nombreFichero) {

	}

	// g - Flujo o fichero de salida
	public void presentaIngresos(PrintWriter flujoSalida) {

	}

	public void presentaIngresos(String nombreFichero) {

	}
}
