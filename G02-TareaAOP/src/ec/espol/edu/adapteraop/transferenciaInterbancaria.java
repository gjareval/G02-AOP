package ec.espol.edu.adapteraop;

public class transferenciaInterbancaria implements transferenciaBancaria {
	
	public void seleccionarCantidadDeposito() {
		System.out.println("Cantidad ingresada");	
	}
	
	public void confirmarTransaccion() {
		System.out.println("Transaccion confirmada");	
	}

}
