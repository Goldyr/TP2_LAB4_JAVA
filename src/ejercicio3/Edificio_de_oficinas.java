package ejercicio3;

public class Edificio_de_oficinas extends Edificio {

	private int cant_oficinas;
	
	Edificio_de_oficinas(){
		super();
		this.cant_oficinas = 0;
	}

	Edificio_de_oficinas(double SuperficieEdificio, int cant_oficinas){
		
		super(SuperficieEdificio);
		this.cant_oficinas = cant_oficinas;
	}
	
	public int getCant_oficinas() {
		return cant_oficinas;
	}

	public void setCant_oficinas(int cant_oficinas) {
		this.cant_oficinas = cant_oficinas;
	}

	@Override
	public String toString() {
		return "Superficie del edificio: " + getSuperficieEdificio() +". Cantidad de oficinas: " + this.cant_oficinas ;
	}

	
	
}
