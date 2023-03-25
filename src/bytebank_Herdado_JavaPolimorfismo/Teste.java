package bytebank_Herdado_JavaPolimorfismo;

public class Teste {
	public static void main(String[] args) {
		FuncionarioTeste f1 = new FuncionarioTeste();
		f1.setSalario(3000.0);
		System.out.println("Tipo de funcionário: " + f1.getTipo());
		System.out.println("Total de Bonificação: " +f1.getBonificacao());
		
		FuncionarioTeste f2 = new FuncionarioTeste();
		f2.setTipo(1);
		f2.setSalario(8000.0);
		System.out.println("Tipo de funcionário: " + f2.getTipo());
		System.out.println("Total de Bonificação: " +f2.getBonificacao());
		
		FuncionarioTeste f3 = new FuncionarioTeste();
		f3.setTipo(2);
		f3.setSalario(8000.0);
		System.out.println("Tipo de funcionário: " + f3.getTipo());
		System.out.println("Total de Bonificação: " +f3.getBonificacao());
		
	}
}

