package ejercicio1;

public class Profesor extends Empleado {
	
	private String cargo;
	private int antiguedadDocente;
	
	Profesor(){
		//Constructor default que usa el constructor de empleado 
		super();
		setCargo("Sin determinar");
		setAntiguedadDocente(-1);
	}
	
	@Override
	public String toString() {
		return "El profesor con el ID "+ super.getId() +" tiene "+ super.getEdad() + " a�os de edad ," + getAntiguedadDocente() + " anios trabajando como docente y su cargo es de " + getCargo();
		
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public int getAntiguedadDocente() {
		return antiguedadDocente;
	}


	public void setAntiguedadDocente(int antiguedadDocente) {
		this.antiguedadDocente = antiguedadDocente;
	}
}
