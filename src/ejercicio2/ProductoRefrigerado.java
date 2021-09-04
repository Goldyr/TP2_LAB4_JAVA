package ejercicio2;

public class ProductoRefrigerado extends Producto{

	private String CodigoOrganismo;
	
	ProductoRefrigerado(){
		
		this.CodigoOrganismo="Codigo no asignado";
		
	}
	ProductoRefrigerado(String Nombre,String FechaCaducidad, String Lote, String cod){
		
		super(Nombre,FechaCaducidad,Lote);
		this.CodigoOrganismo=cod;
	}
	
	public String getCodigoOrganismo() {
		return CodigoOrganismo;
	}
	@Override
	public String toString() {
		return "El Producto Refrigerado: " + getNombre() + "Tiene fecha de caducidad" + getFecha_Caducidad() + 
				"Su lote es" + getNumero_lote() + "y su codigo de organismo es" + getCodigoOrganismo();
	}
	
	
}
