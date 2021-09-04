package ejercicio2;

public class ProductoFresco extends Producto {
	
	private String fecha_envasado; 
	private String país_origen;
	
	
	//Constructores
	ProductoFresco(){
		super();
		this.fecha_envasado = "0/0/0";
	}
	ProductoFresco(String Nombre, String FechaCaducidad, String Lote ,String fecha, String pais){
		
		super(Nombre, FechaCaducidad, Lote);
		setFecha_envasado(fecha);
		setPaís_origen(pais);
	}
	
	//gets y sets
	public String getFecha_envasado() {
		return fecha_envasado;
	}
	public void setFecha_envasado(String fecha_envasado) {
		this.fecha_envasado = fecha_envasado;
	}
	public String getPaís_origen() {
		return país_origen;
	}
	public void setPaís_origen(String país_origen) {
		this.país_origen = país_origen;
	}
	@Override
	public String toString() {
		return "El Producto Fresco: " + getNombre() + "Tiene fecha de caducidad" + getFecha_Caducidad() +
		"Su lote es" + getNumero_lote() + "la fecha de envasado es " + fecha_envasado + "y su país de origen " + país_origen;
	}
	
}
