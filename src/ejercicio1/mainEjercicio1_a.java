package ejercicio1;

import java.util.ArrayList;
import java.util.ListIterator;

public class mainEjercicio1_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Profesor> Lista = new ArrayList <Profesor>(5);
		Lista.add(new Profesor("Sebastian", 23, "Tutor", 3));
		Lista.add(new Profesor("Matias", 20, "Tutor", 2));
		Lista.add(new Profesor("Enzo", 21, "Profesor", 4));
		Lista.add(new Profesor("Facundo", 20, "Profesor", 1));
		Lista.add(new Profesor("Sergio", 19, "Profesor", 2));
		
		ListIterator<Profesor> Lite = Lista.listIterator();
		
		while(Lite.hasNext()==true) {
			System.out.println(Lite.next());
		}

	}

}