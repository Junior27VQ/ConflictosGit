package conflictos;

public class Main {

	public static void main(String[] args) {
		Billetera miBilletera=new Billetera(100.0, "Juan Perez");
		miBilletera.mostrarSaldo();
		miBilletera.transferir(20.0);
		miBilletera.transferir(25.0);
		miBilletera.transferir(30.0);
		miBilletera.mostrarSaldo();

	}

}
