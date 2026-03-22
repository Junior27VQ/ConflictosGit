package conflictos;

public class Billetera {
	double balanceTotal;
	String titular;
	public Billetera(double balanceTotal, String titular) {
		super();
		this.balanceTotal = balanceTotal;
		this.titular = titular;
	}
	public void transferir(double monto) {
		balanceTotal=balanceTotal-monto;
	}
	public void mostrarSaldo() {
		System.out.println("Saldo de"+titular+":$"+balanceTotal);
	}

}
