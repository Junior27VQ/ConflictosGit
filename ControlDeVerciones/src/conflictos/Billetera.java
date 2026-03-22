package conflictos;

public class Billetera {
	double balanceTotal;
	String titular;
	String moneda="USD";
	public Billetera(double balanceTotal, String titular) {
		super();
		this.balanceTotal = balanceTotal;
		this.titular = titular;
	}
	public void transferir(double monto) {
		balanceTotal=balanceTotal-(monto*1.05);
	}
	public void mostrarSaldo() {
		System.out.println("Saldo de"+titular+":$"+balanceTotal);
	}

}
