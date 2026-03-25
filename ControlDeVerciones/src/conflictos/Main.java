package conflictos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BilleteraVirtual miBilletera = new BilleteraVirtual(100.0, "Juan Perez");
		BilleteraVirtual miBilletera2 = new BilleteraVirtual(500.0, "Maria Lopez");

        System.out.print("¿Cuánto desea transferir? ");
        double monto = scanner.nextDouble();


        miBilletera.transferir(monto);
		miBilletera.mostrarSaldo();

		miBilletera.transferir(20.0);
		miBilletera.transferir(25.0);
		miBilletera.transferir(30.0);

		miBilletera.mostrarSaldo();
		miBilletera2.mostrarSaldo();

		scanner.close();
	}
}
