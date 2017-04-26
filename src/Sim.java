import java.util.ArrayList;

public class Sim {
	public static void main(String[] args) {
		
		Mochila m = new Mochila(50);
		Objeto laptop = new Objeto("Laptop", 10, 700);
		Objeto telefono = new Objeto("Telefono", 4, 300);
		Objeto reloj = new Objeto("Reloj", 3, 150);
		Objeto libro = new Objeto("Libro", 5, 50);
		
		ArrayList<Objeto> candidatos = new ArrayList<Objeto>();
		candidatos.add(telefono);
		candidatos.add(laptop);
		candidatos.add(telefono);
		candidatos.add(telefono);
		candidatos.add(laptop);
		candidatos.add(laptop);
		candidatos.add(reloj);
		candidatos.add(telefono);
		candidatos.add(libro);
		candidatos.add(telefono);
		candidatos.add(reloj);
		candidatos.add(telefono);
		candidatos.add(laptop);
		candidatos.add(reloj);
		candidatos.add(laptop);
		candidatos.add(reloj);
		System.out.println("Elementos en la mochila:");
		System.out.println(m.getSolucion(candidatos));
		System.out.println("Por un valor total de: " + m.getValorObtenido());
		
		//Podemos ver como con el metodo Greedy podemos llegar a una solucion buena aproximada(pero no la mejor siempre) 
		//ya que no recorremos todos las posibles combinaciones de objetos.
			
	}
}
