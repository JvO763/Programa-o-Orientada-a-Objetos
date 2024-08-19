from TestaCPF import TestaCPF
from EntradaTeclado import EntradaTeclado
from Gerente import Gerente
from Vendedor import Vendedor
from Assistente import Assistente
from Funcionarios import Funcionarios


class Funcs:
    def __init__(self):
        @staticmethod
        def main(args):
            op = 0
            iteracoes = -1
            salario = 0
            salario_base = 1000
            salario_total = 0
            nome = None
            CPF = None

            nomes = "a"
            nomes.clear()
            CPFs = "a"
            CPFs.clear()
            salarios = 0
            salarios.clear()



    def leopcao(self):
        print("1) Adicionar Gerente\n2) Adicionar Assistente\n3) Adicionar Vendedor\n4) Mostrar Funcionarios\n"
              "5) Sair")
        while (True):
            k = int(input('Digite a opção desejada ===> '))
            if k > 0 and k < 8:
                return k

fncio = Funcs()
teste = TestaCPF()
EntradaTeclado = EntradaTeclado()
op=0
iteracoes = 0
salario_base = 1000
salario=0
salario_total=0
nomes = ["a"]
nomes.clear()
CPFs = ["a"]
CPFs.clear()
salarios = [0]
salarios.clear()
while op != 5:
    op = fncio.leopcao()
    if op == 1:
        iteracoes += 1
        salario = int(2 * salario_base)
        print("Digite o nome do funcionário: ")
        nome = EntradaTeclado.leString()

        ger = Gerente(nome, iteracoes, salario)
        ger.setSalario_base(salario)
        a = ger.getSalario()

        k = False
        while not k:
            print("Digite o CPF: ")
            CPF = EntradaTeclado.leString()
            k = teste.TestaCPF(CPF)

        ger.setCPF(CPF)
        CPF = ger.getCPF()

        nomes.append(nome)
        salarios.append(salario)
        CPFs.append(CPF)
        salario_total += salario

        op = -1

    if op == 2:
        iteracoes += 1
        salario = int(salario_base)
        print("Digite o nome do funcionário: ")
        nome = EntradaTeclado.leString()

        assis = Assistente(nome, iteracoes, salario)
        assis.setSalario_base(salario)
        a = assis.getSalario()

        k = False
        while not k:
            print("Digite o CPF: ")
            CPF = EntradaTeclado.leString()
            k = teste.TestaCPF(CPF)

        assis.setCPF(CPF)
        CPF = assis.getCPF()

        nomes.append(nome)
        salarios.append(salario)
        CPFs.append(CPF)
        salario_total += salario

        op = -1

    if op == 3:
        iteracoes += 1
        print("Digite o nome do funcionário: ")
        nome = EntradaTeclado.leString()
        print("Digite o bônus do salário dele: ")
        salario = EntradaTeclado.leInt()
        salario = salario + int(salario_base)

        vend = Vendedor(nome, iteracoes, salario)
        vend.setSalario_base(salario)
        a = vend.getSalario()

        k = False
        while not k:
            print("Digite o CPF: ")
            CPF = EntradaTeclado.leString()
            k = teste.TestaCPF(CPF)

        vend.setCPF(CPF)
        CPF = vend.getCPF()

        nomes.append(nome)
        salarios.append(salario)
        CPFs.append(CPF)
        salario_total += salario

        op = -1

    if op == 4:
        print("O valor total gasto em salários pela empresa é: ")
        print(salario_total)
        print("E o nome dos funcionários, seus salários e os seus respectivos CPF's estão aqui: ")
        for i in range(iteracoes):
            nm = nomes[i]
            CP = CPFs[i]
            sa = salarios[i]
            str1 = nm + " // R$ " + str(sa) + " // " + CP
            print(str1)

    if op == 5:
        print("Terminando o programa....")
        break

    print("Digite ENTER para continuar")
    EntradaTeclado.leString()
    print("\n\n")