package ec.espol.edu.singletonpoo;

public class Impresora {
	private static Impresora impresora;
	private int NumeroPaginas;
	
	private Impresora() {
	}
	
	public synchronized static Impresora getInstance() {
		if(impresora == null) {
			impresora = new Impresora();
		}
		return impresora;
	}
	
	public void print(String text){
		System.out.println(text +
				"\n" + "número de páginas impresas hoy: " + (++ NumeroPaginas) +
				"\n" + "---------");
	}
}
