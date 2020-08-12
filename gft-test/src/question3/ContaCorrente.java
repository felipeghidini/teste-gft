package question3;

public class ContaCorrente extends Conta implements Imposto{
	
	ContaCorrente(){
		super();	
	}
	
	public Double rendimento() {
		return getSaldo() * 0.03;
	}
	

	public Double calcularImposto() {
		return this.rendimento() * 0.25;
	}
	
}
