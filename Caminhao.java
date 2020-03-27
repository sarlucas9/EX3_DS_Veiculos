package exercicioVeiculos;

public class Caminhao {
	
	
	//atributos
		public int rodas;
		protected double velocidade;
		private String marca;
		
		public Caminhao(){
			this(" ");
		}
		
		public Caminhao(String marca){
			
			this.marca=marca;
			
		}
		
		public String getmarca() {
			return marca;
		}
		
		public void setmarca(String marca) {
			this.marca=marca;
		}

}
