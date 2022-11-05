package ec.espol.edu.adapterpoo;


public class MainPOO {
	
	//Solucion Patron adapter

	public static void main(String args[]) {
		
		Cliente cliente1= new Cliente();
		
		
		System.out.println("Transferencia en el mismo banco");
		cliente1.realizarTransferencia(new TransferenciaMismoBanco());
		
		System.out.println("\nTransferencia a otro banco");
		cliente1.realizarTransferencia(new AdaptadorTransferenciaBancaria());
		
	}
}
