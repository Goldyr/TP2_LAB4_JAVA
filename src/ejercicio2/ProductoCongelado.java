package ejercicio2;

public class ProductoCongelado extends Producto {

	private int Temperatura;
	
	ProductoCongelado(){
		
		this.Temperatura = 0;
		
	}
	ProductoCongelado(String Nombre, String FechaCaducidad, String Lote, int temp){
		
		super(Nombre,FechaCaducidad,Lote);
		
		setTemperatura(temp);
		
	}
	
	public int getTemperatura() {
		return Temperatura;
	}
	
	public void setTemperatura(int Temp) {
		this.Temperatura = Temp;
	}
	
	@Override
	public String toString() {
		return "El Producto Congelado: " + getNombre() + "Tiene fecha de caducidad" + getFecha_Caducidad() + "Su lote es" 
				+ getNumero_lote()+ "y debe tener una temperatura de" + getTemperatura();
	}
	
}
