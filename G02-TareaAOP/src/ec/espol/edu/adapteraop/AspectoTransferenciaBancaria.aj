package ec.espol.edu.adapteraop;

public aspect AspectoTransferenciaBancaria{
	
	public pointcut adaptadorInterbancaria(): initialization(public TransferenciaInterbancaria.new());
	after(): adaptadorInterbancaria(){
		
		//Ejecución ingresar numero cuenta
		System.out.println("Numero cuenta seleccionada");
		
		//Ingresar cédula
		System.out.println("Cedula ingresada");
		
		//Ingresar teléfono
		System.out.println("Telefono ingresado");
			
	}
	
	public pointcut adaptadorMismoBanco(): initialization(public TransferenciaMismoBanco.new());
	after(): adaptadorMismoBanco(){
		
		//Seleccionar cuenta
		System.out.println("Cuenta seleccionada");
		
			
	}
	
}
