//Git knkdk
package conflictos;

public class BilleteraVirtual {
	double balanceTotal;
	String titular;
	String moneda = "USD";
	

	public Billetera(double balanceTotal, String titular) {
		super();
		this.balanceTotal = balanceTotal;
		this.titular = titular;
	}
	public void transferir(double monto) {
		if (monto>balanceTotal){
			System.out.println("Saldo de"+titular+":$"+balanceTotal);
			return;
		}
		balanceTotal=balanceTotal-(monto*1.05);
	}
	public void mostrarSaldo() {
		System.out.println("Saldo de"+titular+":$"+balanceTotal);
	}
}  
