
public class Objeto {
	private Integer peso;
	private Integer valor;
	private String nombre;
	private Float beneficio;

	public Objeto(String n, int p, int v){
		peso = p;
		valor = v;
		beneficio = (float) peso/valor;
		nombre = n;
	}
	
	public Float getBeneficio() {
		return beneficio;
	}
	public Integer getPeso() {
		return peso;
	}
	public Integer getValor() {
		return valor;
	}
	@Override
	public String toString() {
		return nombre;
	}
	
}
