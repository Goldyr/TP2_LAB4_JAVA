package ejercicio1;

public class Empleado {
	
	// Contador que genera el id automaticamente para la clase.
	private static int idContador = 1000;
	
	//Agregue el final para que el id no sea modificable
	private final int id;
	
	private String nombre;
	private int edad;
	

	public Empleado() {
		id = getProximoId();
		
		this.setNombre("sin nombre");
		this.setEdad(99);
	}
	
	public Empleado(String nombre, int edad) {
		id = getProximoId();	
		
		this.setNombre(nombre);
		this.setEdad(edad);
	}
	
	public static void devuelveProximoID() {
		System.out.println("El próximo ID será el "+ (idContador) + "\n");
	}
	
	//GETS 
	
	public int getId() {
		return this.id;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	private int getProximoId() {
		return idContador++;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	//SETS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "El Empleado "+getNombre()+" Tiene el ID "+ getId() +" y "+ getEdad() + " años de edad";
		
	}
	
	

}
