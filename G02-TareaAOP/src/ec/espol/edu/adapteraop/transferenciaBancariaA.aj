package ec.espol.edu.adapteraop;

public aspect transferenciaBancariaA {
	
	public pointcut adaptadorInterbancaria(): initialization(public transferenciaInterbancaria.new(..));
	after(): adaptadorInterbancaria(){
		
		//Ejecución ingresar numero cuenta
		System.out.println("Numero cuenta seleccionada");
		
		//Ingresar cédula
		System.out.println("Cedula ingresada");
		
		//Ingresar teléfono
		System.out.println("Telefono ingresado");
			
	}
	
	public pointcut adaptadorMismoBanco(): initialization(public transferenciaBancariaMismoBanco.new(..));
	after(): adaptadorMismoBanco(){
		
		//Seleccionar cuenta
		System.out.println("Cuenta seleccionada");
		
			
	}
	
}
