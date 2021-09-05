package ejercicio3;

import java.util.ArrayList;
import java.util.ListIterator;


public class MainEjercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Edificio> Lista = new ArrayList<Edificio>(5);
		
		Lista.add(new Polideportivo(1, "Poli Pacheco 1", 20.01));
		Lista.add(new Polideportivo(2, "Poli Pacheco 2", 30.03 ));
		Lista.add(new Polideportivo(3, "Poli Tigre 1", 40.50));
		Lista.add(new Edificio_de_oficinas(40.05, 20));
		Lista.add(new Edificio_de_oficinas(45.97, 40));
		
		ListIterator<Edificio> Iterator = Lista.listIterator();
		
		while(Iterator.hasNext()==true) {
			System.out.println(Iterator.next());
		}
		
	}

}
