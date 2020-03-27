package exercicioVeiculos;

public class Moto {
	
	
	//atributos
	public int rodas;
	protected double velocidade;
	private String marca;
	
	public Moto(){
		this(" ");
	}
	
	public Moto(String marca){
		
		this.marca=marca;
		
	}
	
	public String getmarca() {
		return marca;
	}
	
	public void setmarca(String marca) {
		this.marca=marca;
	}
	
	

}
