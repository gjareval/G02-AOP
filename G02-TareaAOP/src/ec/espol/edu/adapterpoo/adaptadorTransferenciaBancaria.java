package ec.espol.edu.adapterpoo;


public class adaptadorTransferenciaBancaria implements transferenciaBancaria {
	
	private transferenciaInterbancaria transferenciaInterbancaria=new transferenciaInterbancaria();
	

	@Override
	public void seleccionarCuentaDestino() {
		transferenciaInterbancaria.ingresarNumeroCedulaIdentidadDestino();
		transferenciaInterbancaria.ingresarNumeroCuentaDestino();
		transferenciaInterbancaria.ingresarNumeroTelefonoDestino();
		
	}

	@Override
	public void seleccionarCantidadDeposito() {
		transferenciaInterbancaria.seleccionarCantidadDeposito();
		
	}

	@Override
	public void confirmarTransaccion() {
		transferenciaInterbancaria.confirmarTransaccion();
		
	}

	
}
