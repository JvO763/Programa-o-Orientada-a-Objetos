public class Funcionarios {

	private String nome;
	private String CPF;
	private double salario_base;
	private double cargo;

	/**
	 * 1:vendedor; 2:assistente; 3:gerente
	 **/

	public Funcionarios(String name, int num) {
		nome = name;
	}

	public String getNome() {
		return nome;
	}

	public void setNomeCliente(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public double getSalario_base() {
		return salario_base;
	}

	public void setSalario_base(double s) {
		this.salario_base = s;
	}

	public double getCargo() {
		return cargo;
	}

	public void setCargo(double c) {
		this.cargo = c;
	}
}
