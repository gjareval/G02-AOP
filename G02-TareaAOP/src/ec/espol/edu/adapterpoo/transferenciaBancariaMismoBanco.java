package ec.espol.edu.adapterpoo;

public class transferenciaBancariaMismoBanco implements transferenciaBancaria {
	
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
