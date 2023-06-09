package bytebank_Herdado_JavaPolimorfismo;

public class FuncionarioTeste {

	private String nome;
	private String Cpf;
	private double salario;
	private int tipo = 0; // 0 - Funcionário comum, 1 - Gerente, 2 - Diretor
	private int senha;
	
	public boolean autentica(int senha) {
	    if(this.senha == senha) {
	        return true;
	    } else {
	            return false;
	    }
	}
	
	public FuncionarioTeste() {

	}

	public double getBonificacao() {
			if(this.tipo == 0 ) { // funcionario comum
				return this.salario *0.1;
			} else if(this.tipo == 1) { // Gerente
				return this.salario;
		    } else { //Diretor
		    	return this.salario + 1000.0;
		    }
		}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String Cpf) {
		this.Cpf = Cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
