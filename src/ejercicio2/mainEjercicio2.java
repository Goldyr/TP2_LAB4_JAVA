package ejercicio2;

public class mainEjercicio2 {
	
	public static void main(String[] args) {
	
		ProductoCongelado Pro_congelado = new ProductoCongelado("Medallones de carne", "12/9/2021", "P001", -18);
		ProductoRefrigerado Pro_Refrigerado = new  ProductoRefrigerado("yogur", "6/9/2021", "P002", "Y001");
		ProductoFresco Pro_Fresco = new ProductoFresco("Leche", "2/10/2021", "P003", "1/9/2021", "Argentina");
		
		System.out.println(Pro_congelado.toString());
		System.out.println(Pro_Refrigerado.toString());
		System.out.println(Pro_Fresco.toString());
	}
}
