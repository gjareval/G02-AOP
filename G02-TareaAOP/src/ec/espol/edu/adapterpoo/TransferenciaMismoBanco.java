package ec.espol.edu.adapterpoo;

public class TransferenciaMismoBanco implements TransferenciaBancaria {
	
	@Override
	public void seleccionarCuentaDestino() {
		System.out.println("Cuenta seleccionada");		
	}

	@Override
	public void seleccionarCantidadDeposito() {
		System.out.println("Cantidad ingresada");	
	}

	@Override
	public void confirmarTransaccion() {
		System.out.println("Transaccion confirmada");	
	}
	
	
	

}
