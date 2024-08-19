class Assistente():
    def __init__(self, n, num, sal):

        super().__init__()
        self.salario = sal

    def getSalario(self):
        return self.salario

    def setSalario(self, salario):
        self.salario = salario

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