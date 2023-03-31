// a - Clase Ingreso y constructor
public class Ingreso {
	private Hora horaIngreso;
	private Hora horaAlta;
	private String SeguridadSocial;
	private String codigoMedico;
	private String gradoUrgencia;

	public Ingreso(Hora horaIngreso, Hora horaAlta, String SS, String medico, String grado) {
		String grados;
		String gradoUrgencia = grados[3];
		int numero = Integer.valueOf(gradoUrgencia);
		switch (numero) {
		case 0:
			gradoUrgencia = "LEVE";
			break;
		case 1:
			gradoUrgencia = "MODERADO";
			break;
		case 2:
			gradoUrgencia = "GRAVE";
			break;
		}

		this.horaIngreso = horaIngreso;
		this.horaAlta = horaAlta;
		this.SeguridadSocial = SS;
		this.codigoMedico = medico;
		this.gradoUrgencia = grado;
	}

	// b - M�todos de consulta
	public Hora getHoraIngreso() {
		return horaIngreso;
	}

	public Hora getHoraAlta() {
		return horaAlta;
	}

	public String getSeguridadSocial() {
		return SeguridadSocial;
	}

	public String getCodigoMedico() {
		return codigoMedico;
	}

	public String getGradoUrgencia() {
		return gradoUrgencia;
	}

	// c - Criterio de igualdad
	public boolean equals(Object o) {
		boolean res = o instanceof Ingreso;
		Ingreso obj = res ? (Ingreso) o : null;
		return res && horaIngreso.equals(obj.horaIngreso) && SeguridadSocial.equals(obj.SeguridadSocial);
	}

	public int hashCode() {
		return horaIngreso.hashCode() + SeguridadSocial.hashCode();
	}

	// d - Criterio de ordenaci�n
	public class IngresoTest implements Comparable<IngresoTest> {
		private Hora horaIngreso;
		private Hora horaAlta;
		private String SeguridadSocial;
		private String codigoMedico;
		private String gradoUrgencia;

		public IngresoTest(Hora horaIngreso, Hora horaAlta, String SS, String medico, String grado) {
			this.horaIngreso = horaIngreso;
			this.horaAlta = horaAlta;
			this.SeguridadSocial = SS;
			this.codigoMedico = medico;
			this.gradoUrgencia = grado;
		}

		public int compareTo(IngresoTest o) {
			int resu = horaIngreso.compareTo(o.horaIngreso);
			if (resu == 0) {
				resu = SeguridadSocial.compareTo(o.SeguridadSocial);
			}
			return resu;
		}

	}

	// e - Representaci�n
	public String toString() {
		return "{" + horaIngreso + " - " + SeguridadSocial + "}";
	}

}
