package ec.espol.edu.adapterpoo;


public class AdaptadorTransferenciaBancaria implements TransferenciaBancaria {
	
	private TransferenciaInterbancaria transferenciaInterbancaria=new TransferenciaInterbancaria();
	

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
