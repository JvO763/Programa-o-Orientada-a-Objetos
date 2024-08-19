
public class Funcs {

	private int nFuncs = 0;
	
	public static void main(String[] args) throws Exception {
		int op = 0;
		int iteracoes = -1;
		int salario = 0;
		double salario_base=1000;
		int salario_total=0;
		String nome = null;
		String CPF =null;

		String[] nomes=new String[100];
		String[] CPFs = new String[100];
		int[] salarios = new int[100];

		Funcs fncio = new Funcs();
		TestaCPF teste = new TestaCPF();
		EntradaTeclado EntradaTeclado = new EntradaTeclado();

		while (op != 5) {
			op = fncio.leOpcao();
			if(op==1){
				iteracoes = iteracoes + 1;
				salario = (int)(2*salario_base);
				System.out.println("Digite o nome do funcionário: ");
				nome = EntradaTeclado.leString();

				Gerente ger = new Gerente(nome, iteracoes, salario);
				ger.setSalario_base(salario);
				int a = ger.getSalario();

				boolean k = false;
				while(k==false) {
					System.out.println("Digite o CPF: ");
					CPF = EntradaTeclado.leString();
					k=teste.TestaCPF(CPF);
				}

				ger.setCPF(CPF);
				CPF = ger.getCPF();

				nomes[iteracoes]=nome;
				salarios[iteracoes]=salario;
				CPFs[iteracoes]=CPF;
				salario_total=salario_total+salario;

				op= -1;
			};
			if(op==2){
				iteracoes = iteracoes + 1;
				salario = (int)(salario_base);
				System.out.println("Digite o nome do funcionário: ");
				nome = EntradaTeclado.leString();

				Assistente assis = new Assistente(nome, iteracoes, salario);
				assis.setSalario_base(salario);
				int a = assis.getSalario();

				boolean k = false;
				while(k==false) {
					System.out.println("Digite o CPF: ");
					CPF = EntradaTeclado.leString();
					k=teste.TestaCPF(CPF);
				}

				assis.setCPF(CPF);
				CPF = assis.getCPF();

				nomes[iteracoes]=nome;
				salarios[iteracoes]=salario;
				CPFs[iteracoes]=CPF;
				salario_total=salario_total+salario;

				op= -1;
			};
			if(op==3){
				iteracoes = iteracoes + 1;
				System.out.println("Digite o nome do funcionário: ");
				nome = EntradaTeclado.leString();
				System.out.println("Digite o bônus do salário dele: ");
				salario = EntradaTeclado.leInt();
				salario = salario + (int)(salario_base);

				Vendedor vend = new Vendedor(nome, iteracoes, salario);
				vend.setSalario_base(salario);
				int a = vend.getSalario();

				boolean k = false;
				while(k==false) {
					System.out.println("Digite o CPF: ");
					CPF = EntradaTeclado.leString();
					k=teste.TestaCPF(CPF);
				}

				vend.setCPF(CPF);
				CPF = vend.getCPF();

				nomes[iteracoes]=nome;
				salarios[iteracoes]=salario;
				CPFs[iteracoes]=CPF;
				salario_total=salario_total+salario;

				op= -1;
			};
			if(op==4){
				System.out.println("O valor total gasto em salários pela empresa é: ");
				System.out.println(salario_total);
				System.out.println("E nome dos funcionários e os seus respectivos CPF's estão aqui: ");
				for(int i=0; i<=iteracoes; i++){
					System.out.print(nomes[i]);
					System.out.print(" // ");
					System.out.print(CPFs[i]);
					System.out.print(" // R$ ");
					System.out.print(salarios[i]);
					System.out.println("\n");
				}


			};
			if(op==5){
				System.out.println("Terminando o programa....");
				return;
			};

			System.out.println("Digite ENTER para continuar");
			EntradaTeclado.leString();
			System.out.println("\n\n");
		}
	}

	private static int leOpcao() {
        System.out.println("1) Adicionar Gerente\n2) Adicionar Assistente\n3) Adicionar Vendedor\n4) Mostrar Funcionarios\n"
        		+ "5) Sair");
        int k = -1;
        while (true)
        {
        	System.out.println("Digite a opção desejada ===> ");
        	try {
        		k = EntradaTeclado.leInt();
        		if ( k > 0 && k < 8 )
        			return k;
        	}
        	catch (Exception e) {
        		;
        	}
        }
	}

}
