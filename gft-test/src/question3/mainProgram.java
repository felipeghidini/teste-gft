package question3;

public class mainProgram {

	public static void main(String[] args) {

		Conta a = new ContaCorrente();
		
		Conta b = new ContaPoupanca();

	a.setNumero(1L);
	a.setTitular("Titular 1");
	a.setSaldo(null);
	
	System.out.println(a.toString() + "rendimento" + a.rendimento());	
	
	}

}
