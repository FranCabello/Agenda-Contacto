//a - Clase Hora y constructor
public class Hora {
	private int hora;
	private int minuto;

	public Hora(int h, int min) {
		if (h >= 0 && h <= 23 && min >= 0 && min <= 59) {
			this.hora = h;
			this.minuto = min;
		}
	}

	// b - M�todos de consulta
	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	// c - Noci�n de igualdad
	public boolean equals(Object o) {
		boolean res = o instanceof Hora;
		Hora obj = res ? (Hora) o : null;
		return res && hora == obj.hora && minuto == obj.minuto;
	}

	public int hashCode() {
		return hora + minuto;
	}

	// d - Criterio de ordenaci�n
	public class HoraTest implements Comparable<HoraTest> {
		private int hora;
		private int minuto;

		public HoraTest(int h, int min) {
			this.hora = h;
			this.minuto = min;
		}

		public int compareTo(HoraTest o) {
			int resu = Integer.compare(hora, o.hora);

			if (resu == 0) {
				resu = Integer.compare(minuto, o.minuto);
			}
			return resu;
		}

	}

	// e - Diferencia de minutos
	public int diferenciaMinutos(Hora hora) {
		Hora h1 = null;
		Hora h2 = null;

		int dif = (h2.getHora() * 60 + h2.getMinuto()) - (h1.getHora() * 60 + h1.getMinuto());
		return dif;
	}

	// f - Representaci�n [hora:minuto]
	public String toString() {
		return "[" + hora + ":" + minuto + "]";
	}

}
