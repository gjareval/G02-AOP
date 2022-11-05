package ec.espol.edu.adapterpoo;

public class Cliente {
	
	public void realizarTransferencia(transferenciaBancaria transferencia) {
		transferencia.seleccionarCuentaDestino();
		transferencia.seleccionarCantidadDeposito();
		transferencia.confirmarTransaccion();
	};

}
