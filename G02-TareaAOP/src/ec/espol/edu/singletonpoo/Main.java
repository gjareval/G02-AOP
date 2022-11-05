package ec.espol.edu.singletonpoo;

public class Main {
	public static void main(String[] args) {
		Empleado santiago = new Empleado("Santiago","Desarrollador","Mantenimiento de recursos informaticos");
		Empleado guillermo = new Empleado("Guillermo","Desarrollador","Mantenimiento de recursos informaticos");
		Empleado jordan = new Empleado("Jordan","Desarrollador", "Mantenimiento de recursos informaticos");
		
		santiago.printCurrent();
		guillermo.printCurrent();
		jordan.printCurrent();
	}
}
