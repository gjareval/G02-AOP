package ec.espol.edu.adapterpoo;

public class Cliente {
	
	public void realizarTransferencia(TransferenciaBancaria transferencia) {
		transferencia.seleccionarCuentaDestino();
		transferencia.seleccionarCantidadDeposito();
		transferencia.confirmarTransaccion();
	};

}
