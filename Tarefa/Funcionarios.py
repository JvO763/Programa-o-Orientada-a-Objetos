class Funcionarios:
    def __init__(self, n, num, sal):
        name =""
        self.nome = name
        self.CPF = ""
        self.salario_base = 0.0
        self.cargo = 0.0

    def getNome(self):
        return self.nome

    def setNomeCliente(self, nome):
        self.nome = nome

    def getCPF(self):
        return self.CPF

    def setCPF(self, CPF):
        self.CPF = CPF

    def getSalario_base(self):
        return self.salario_base

    def setSalario_base(self, s):
        self.salario_base = s

    def getCargo(self):
        return self.cargo

    def setCargo(self, c):
        self.cargo = c

