package pa;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArchivoDepositosSubterraneos {
	public static SistemaDeDepositos leerArchivo(String path) throws FileNotFoundException {
		File archivo = new File(path);
		Scanner entrada = new Scanner(archivo);
		List<Deposito> depositos = new ArrayList<>();
		int cantidadDeDepositos = entrada.nextInt();
		for (int i = 0; i < cantidadDeDepositos; i++) {
			depositos.add(new Deposito(entrada.nextInt(), entrada.nextInt()));
		}
		int volumenAIngresarEnM3 = entrada.nextInt();
		entrada.close();
		return new SistemaDeDepositos(volumenAIngresarEnM3, depositos);
	}
	
	public static void escribirArchivo(String path, Almacen resultado) throws FileNotFoundException
	{
		File archivo = new File(path);
		PrintWriter salida = new PrintWriter(archivo);
		if(resultado.getVolumenAIngresar() > resultado.getCantidadDeCombustibleVertido())
			salida.print("Rebasan: " + (int)(resultado.getVolumenAIngresar() - resultado.getCantidadDeCombustibleVertido()));
		else
		{
			salida.println(resultado.getCantidadDeDepositosUsados());
			salida.println(resultado.getNivelActual());
		}	
		salida.close();
	}

}
