package singletonAOP;

public class Conexion {
	
	private static Conexion instancia;
	
	private Conexion() {
		instancia=this;
	}
	public static Conexion getInstancia() {
		return instancia;
	}
	
	public void conectar() {
		System.out.println("Base de dato contectada");
	}
	public void desconectar() {
		System.out.println("Base de dato descontectada");
	}
}
