
public class Assistente extends Funcionarios {
	private int salario;

	public Assistente(String n, int num, int sal) {
		super(n, num);
		salario = sal;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

}
