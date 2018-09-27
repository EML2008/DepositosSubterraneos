package pa;

import java.io.FileNotFoundException;

public class App {
	public static void main(String[] args)
	{
		try {
			SistemaDeDepositos sistema = ArchivoDepositosSubterraneos.leerArchivo("resource\\entrada\\depositos2.in");
			ArchivoDepositosSubterraneos.escribirArchivo("resource\\salida\\depositos2.out",sistema.vertidoDeCombustible());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
