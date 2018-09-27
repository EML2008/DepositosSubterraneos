package pa;

public class Deposito {
	private int superficie;
	private int profundidad;
	double capacidadEnM3;
	double capacidadEnM3Actual;

	public Deposito(int superficie, int profundidad) {
		this.superficie = superficie;
		this.profundidad = profundidad;
		this.capacidadEnM3 = superficie * profundidad;
		this.capacidadEnM3Actual = capacidadEnM3;
	}

	public int getProfundidad() {
		return profundidad;
	}

	public void agregarNivelDeLiquido() {
		this.capacidadEnM3Actual -= this.superficie;
	}

	public boolean liquidoEnProfundidadMinima(int nivelActual) {
		return profundidad >= nivelActual;
	}

	public double combustibleEnDeposito() {
		return this.capacidadEnM3 - this.capacidadEnM3Actual;
	}
}
