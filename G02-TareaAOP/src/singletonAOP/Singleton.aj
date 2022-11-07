package singletonAOP;

privileged public aspect Singleton {
	
	pointcut unicaConexion():
		execution(Conexion Conexion.getInstancia());
	
	Conexion around(): unicaConexion(){
		Conexion instancia=Conexion.instancia;
		if(instancia==null) {
			instancia=new Conexion();
		}
		return instancia;
	}
	
	
	
}
