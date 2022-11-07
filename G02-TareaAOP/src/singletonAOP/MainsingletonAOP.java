package singletonAOP;

public class MainsingletonAOP {

	public static void main(String args[]) {
		
		//Una primera referencia a la base de datos//
		Conexion c=Conexion.getInstancia();
		
		//Se realiza las acciones permitida con la misma
		c.conectar();
		c.desconectar();
		
		//Ahora si se desea volver a usar aquella BD, aunque se "instancie" con otro nombre, será siempre referencia al mismo objeto"
		Conexion c1=Conexion.getInstancia();
		System.out.println("El objecto c1 es instancia de clase Conexion: "+(c1 instanceof Conexion));
		
		//Se comprueba que sea la misma refencia en la memoria
		System.out.println("El objecto c es igual a c1? "+(c.hashCode()==(c1.hashCode())));
					
	}
}
