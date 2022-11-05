package ec.espol.edu.adapteraop;

public class Cliente {
	
	public void realizarTransferencia(TransferenciaBancaria transferencia) {
		transferencia.seleccionarCantidadDeposito();
		transferencia.confirmarTransaccion();
	};

}
