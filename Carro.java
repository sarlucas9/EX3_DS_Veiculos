package exercicioVeiculos;

public class Carro {
	
	//atributos
		public int rodas;
		protected double velocidade;
		private String marca;
		
		public Carro(){
			this(" ");
		}
		
		public Carro(String marca){
			
			this.marca=marca;
			
		}
		
		public String getmarca() {
			return marca;
		}
		
		public void setmarca(String marca) {
			this.marca=marca;
		}

}
