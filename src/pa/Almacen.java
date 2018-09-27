package pa;

public class Almacen {
	private int nivelActual;
	private int volumenAIngresar;
	private double CantidadDeCombustibleVertido;
	int cantidadDeDepositosUsados;

	public Almacen(int nivelActual, int volumenAIngresar, double cantidadDeCombustibleVertido,
			int cantidadDeDepositosUsados) {
		this.nivelActual = nivelActual;
		this.volumenAIngresar = volumenAIngresar;
		CantidadDeCombustibleVertido = cantidadDeCombustibleVertido;
		this.cantidadDeDepositosUsados = cantidadDeDepositosUsados;
	}

	public int getNivelActual() {
		return nivelActual;
	}

	public int getVolumenAIngresar() {
		return volumenAIngresar;
	}

	public double getCantidadDeCombustibleVertido() {
		return CantidadDeCombustibleVertido;
	}

	public int getCantidadDeDepositosUsados() {
		return cantidadDeDepositosUsados;
	}

}
