package pa;

import java.util.List;

public class SistemaDeDepositos {
	private int volumenAIngresarEnM3;
	private List<Deposito> depositos;

	public SistemaDeDepositos(int vol, List<Deposito> depositos) {
		this.volumenAIngresarEnM3 = vol;
		this.depositos = depositos;
	}

	public Almacen vertidoDeCombustible() {
		int nivelActualDelFluido = this.depositos.get(0).getProfundidad();
		while (nivelActualDelFluido > 0 && cantidadDeCombustibleVertido() < this.volumenAIngresarEnM3) {
			for (int i = 0; i < this.depositos.size(); i++) {
				if (depositos.get(i).liquidoEnProfundidadMinima(nivelActualDelFluido))
					depositos.get(i).agregarNivelDeLiquido();
			}
			nivelActualDelFluido--;
		}
		return new Almacen(nivelActualDelFluido,this.volumenAIngresarEnM3,cantidadDeCombustibleVertido(),cantidadDeDepositosUsados());
	}
	
	public int cantidadDeDepositosUsados()
	{
		int contador = 0;
		for(Deposito x: this.depositos)
			if(x.capacidadEnM3 != x.capacidadEnM3Actual)
				contador++;
		return contador;
	}

	public double cantidadDeCombustibleVertido() {
		double totalCombustibleVertido = 0;
		for (Deposito x : this.depositos)
			totalCombustibleVertido += x.combustibleEnDeposito();
		return totalCombustibleVertido;
	}
}
