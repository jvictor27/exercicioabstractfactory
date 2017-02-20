
public abstract class FabricaDeComodo {
	private int piso = 1;
	private int parede;
	private int porta = 1;
	private int tinta = 1;
	private int metal;
	private int loucas;
	private String componente = null;
	private int qtdComponente;
	
	public FabricaDeComodo(){
		
	}
	
	public void getPiso(int qtdPiso){
		if(qtdPiso > 1){
			this.piso = qtdPiso;
		}
	}
}
