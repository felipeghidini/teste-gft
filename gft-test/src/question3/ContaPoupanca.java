package question3;

public class ContaPoupanca extends Conta implements Imposto{

	ContaPoupanca(){
		super();	
	}
	
	public Double rendimento() {
		return getSaldo() * 0.05;
	}
	
	public Double calcularImposto() {
		return this.rendimento() * 0.10;
	}
	
}
