package conflictos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.print("=== BIENVENIDO AL SISTEMA BANCARIO ===");
        Scanner scanner = new Scanner(System.in);
        Billetera miBilletera = new Billetera(100.0, "Juan Perez");

        System.out.print("¿Cuánto desea transferir? ");
        double monto = scanner.nextDouble();


        miBilletera.transferir(monto);
		miBilletera.mostrarSaldo();

		miBilletera.transferir(20.0);
		miBilletera.transferir(25.0);
		miBilletera.transferir(30.0);

		miBilletera.mostrarSaldo();

		scanner.close();
	}
}
