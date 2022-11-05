package ec.espol.edu.adapteraop;

public class Cliente {
	
	public void realizarTransferencia(transferenciaBancaria transferencia) {
		transferencia.seleccionarCantidadDeposito();
		transferencia.confirmarTransaccion();
	};

}
