import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Mochila {
	private Integer capacidad;
	private Integer valorObtenido = 0;
	private ArrayList<Objeto> solucion = new ArrayList<Objeto>();
	
	public Mochila(int c){
		capacidad = c;
	}
	public Integer getValorObtenido(){
		return valorObtenido;
	}	
	
	public ArrayList<Objeto> getSolucion(ArrayList<Objeto> candidatos){
		
		// ordenamos la lista en base al beneficio de cada objeto
		
		Collections.sort(candidatos, new Comparator<Objeto>(){
			@Override
			public int compare(Objeto o1, Objeto o2) {
				return  o2.getBeneficio().compareTo(o1.getBeneficio());
			}
		});
		
		//consideramos el ultimo elemento de la lista como el mejor posible, 
		//si entra en la mochila lo agregamos y lo removemos, si no solo lo removemos.
		
		while(!candidatos.isEmpty()){
			if(candidatos.get(candidatos.size()-1).getPeso() < capacidad){
				capacidad -= candidatos.get(candidatos.size()-1).getPeso();
				valorObtenido += candidatos.get(candidatos.size()-1).getValor();
				solucion.add(candidatos.get(candidatos.size()-1));
			}
			candidatos.remove(candidatos.size()-1);
		}
		return solucion; 
	}
}
