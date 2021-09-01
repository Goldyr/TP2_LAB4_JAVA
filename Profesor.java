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
	
	Profesor(String Nombre, int Edad,String cargo, int antiguedad){
		//Constructor default que usa el constructor de empleado 
		super(Nombre, Edad);
		setCargo(cargo);
		setAntiguedadDocente(antiguedad);
	}
	
	@Override
	public String toString() {
		return "El profesor "+ super.getNombre() + ", ID "+ super.getId() +" tiene "+ super.getEdad() + " años de edad, " + getAntiguedadDocente() + " años trabajando como docente y su cargo es de " + getCargo();
		
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
