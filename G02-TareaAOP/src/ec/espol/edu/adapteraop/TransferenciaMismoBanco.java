package ec.espol.edu.adapteraop;

public class TransferenciaMismoBanco implements TransferenciaBancaria {

	@Override
	public void seleccionarCantidadDeposito() {
		System.out.println("Cantidad ingresada");	
	}

	@Override
	public void confirmarTransaccion() {
		System.out.println("Transaccion confirmada");	
	}
	
	
	

}
