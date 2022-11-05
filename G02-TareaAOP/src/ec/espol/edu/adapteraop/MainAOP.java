package ec.espol.edu.adapteraop;


public class MainAOP {
	
	//Solución con Aspectos

	public static void main(String args[]) {
		
		Cliente cliente1= new Cliente();
		
		System.out.println("\nTransferencia a otro banco");
		cliente1.realizarTransferencia(new transferenciaInterbancaria());
		
		System.out.println("Transferencia en el mismo banco");
		cliente1.realizarTransferencia(new transferenciaBancariaMismoBanco());
		
	}
}
