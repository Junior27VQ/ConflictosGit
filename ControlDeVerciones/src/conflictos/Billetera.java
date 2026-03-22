package conflictos;

public class Billetera {
	double balanceTotal;
	String titular;
	boolean cuentaActiva=true;
	public Billetera(double balanceTotal, String titular) {
		super();
		this.balanceTotal = balanceTotal;
		this.titular = titular;
	}
	public void transferir(double monto) {
		if(monto>balanceTotal){
			System.out.println("fondo insuficiente");
			return ;
		}
		balanceTotal=balanceTotal-monto;
	}
	public void mostrarSaldo() {
		System.out.println("Saldo de"+titular+":$"+balanceTotal);
	}

}
