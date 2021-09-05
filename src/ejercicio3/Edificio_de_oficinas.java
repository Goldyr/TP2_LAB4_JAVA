package ejercicio3;

public class Edificio_de_oficinas implements IEdificio {

	private int cant_oficinas;
	private double SuperficieEdificio;
	
	Edificio_de_oficinas(){
		
	}

	Edificio_de_oficinas(double SuperficieEdificio, int cant_oficinas){
		
		this.cant_oficinas = cant_oficinas;
		this.SuperficieEdificio= SuperficieEdificio;
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

	@Override
	public double getSuperficieEdificio() {
		return this.SuperficieEdificio;
	}

	@Override
	public void setSuperficieEdificio(double SuperficieEdificio) {
		this.SuperficieEdificio= SuperficieEdificio;
		
	}
	
	
}
