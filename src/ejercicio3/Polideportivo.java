package ejercicio3;

public class Polideportivo extends Edificio implements iInstalacionDeportiva{
	
	private int TipoDeInstalacion;
	private String Nombre;
	
	public Polideportivo() {
		super();
		TipoDeInstalacion = -1;
		this.Nombre = "null";
	}
	
	public Polideportivo(int TipoDeInstalacion, String Nombre, double SuperficieEdificio) {
		super(SuperficieEdificio);
		this.TipoDeInstalacion = TipoDeInstalacion;
		this.Nombre = Nombre;
	}
	
	@Override
	public int getTipoDeInstalacion() {
		return TipoDeInstalacion;
	}

	@Override
	public void setTipoDeInstalacion(int TipoDeInstalacion) {
		this.TipoDeInstalacion = TipoDeInstalacion;
	}
		
	@Override
	public String toString() {
		return "Superficie del edificio: " + getSuperficieEdificio() +". Tipo de instalacion: " + this.TipoDeInstalacion +
				". Nombre del polideportivo: " + this.Nombre;
	}

}
