package conflictos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

        Billetera miBilletera = new Billetera(100.0, "Juan Perez");
        miBilletera.mostrarSaldo();

        System.out.print("¿Cuánto desea transferir? ");
        double monto = scanner.nextDouble();

        miBilletera.transferir(monto);
        miBilletera.mostrarSaldo();

        scanner.close();
    }

	}
