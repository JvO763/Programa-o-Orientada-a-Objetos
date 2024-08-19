
public class Vendedor extends Funcionarios {
    private int salario;

    public Vendedor(String n, int num, int sal) {
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
