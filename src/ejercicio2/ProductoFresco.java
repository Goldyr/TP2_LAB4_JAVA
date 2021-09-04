package ejercicio2;

public class ProductoFresco extends Producto {
	
	private String fecha_envasado; 
	private String pa�s_origen;
	
	
	//Constructores
	ProductoFresco(){
		super();
		this.fecha_envasado = "0/0/0";
	}
	ProductoFresco(String Nombre, String FechaCaducidad, String Lote ,String fecha, String pais){
		
		super(Nombre, FechaCaducidad, Lote);
		setFecha_envasado(fecha);
		setPa�s_origen(pais);
	}
	
	//gets y sets
	public String getFecha_envasado() {
		return fecha_envasado;
	}
	public void setFecha_envasado(String fecha_envasado) {
		this.fecha_envasado = fecha_envasado;
	}
	public String getPa�s_origen() {
		return pa�s_origen;
	}
	public void setPa�s_origen(String pa�s_origen) {
		this.pa�s_origen = pa�s_origen;
	}
	@Override
	public String toString() {
		return "El Producto Fresco: " + getNombre() + "Tiene fecha de caducidad" + getFecha_Caducidad() +
		"Su lote es" + getNumero_lote() + "la fecha de envasado es " + fecha_envasado + "y su pa�s de origen " + pa�s_origen;
	}
	
}
