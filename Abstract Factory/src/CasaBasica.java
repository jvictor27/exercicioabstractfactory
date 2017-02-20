public class FabricaCasaBasica implements FabricaDeCasa {
	
	
 
    @Override
    public Comodo criaComodo(int qtdPiso = 1, int qtdParede = 4, int ptdPortas = 1, int qydTinta = 1, int qtdMetais, int qtdLoucas) {
        return new Comodo();
    }
 
    
 
}