package ejercicio2;

public abstract class Producto {

	private String Nombre;
	private String Fecha_Caducidad; 
	private String Numero_lote;
	
	
	Producto(){
		this.Nombre="sin nombre";
		this.Fecha_Caducidad = "0/0/0";
		this.Numero_lote = "Lote no asignado";
	}

	Producto(String nombre, String FechaCadu,String NumeroLote){
		
		this.Nombre=nombre;
		this.Fecha_Caducidad = FechaCadu;
		this.Numero_lote = NumeroLote;
	}
	
	public String getFecha_Caducidad() {
		return Fecha_Caducidad;
	}

	public void setFecha_Caducidad(String fecha_Caducidad) {
		Fecha_Caducidad = fecha_Caducidad;
	}

	public String getNumero_lote() {
		return Numero_lote;
	}

	public void setNumero_lote(String numero_lote) {
		Numero_lote = numero_lote;
	}
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	
}
