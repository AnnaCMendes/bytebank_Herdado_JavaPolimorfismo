package bytebank_Herdado_JavaPolimorfismo;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario anna = new Funcionario();
		anna.setNome("Anna Carolina de Oliveira Vale Mendes");
		anna.setCpf("13460622776");
		anna.setSalario(2500.00);
		
		System.out.println("Nome: " + anna.getNome());
		System.out.println("CPF:  " + anna.getCpf());
		System.out.println("Salário do funcionário: " + anna.getSalario());
		System.out.println("Bonificação: " + anna.getBonificacao());
		
		

	}

}
