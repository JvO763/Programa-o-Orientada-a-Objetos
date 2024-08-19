class TestaCPF:
    @staticmethod
    def TestaCPF(strCPF):
        Soma = 0
        Resto = 0
        i = 0
        Soma = 0

        if strCPF == "00000000000":
            print("CPF inválido!")
            return False

        for i in range(1, 10):
            Soma += int(strCPF[i - 1]) * (11 - i)

        Resto = (Soma * 10) % 11

        if Resto == 10 or Resto == 11:
            Resto = 0

        if Resto != int(strCPF[9]):
            print("CPF inválido!")
            return False

        Soma = 0

        for i in range(1, 11):
            Soma += int(strCPF[i - 1]) * (12 - i)

        Resto = (Soma * 10) % 11

        if Resto == 10 or Resto == 11:
            Resto = 0

        if Resto != int(strCPF[10]):
            print("CPF inválido!")
            return False

        print("CPF válido!")
        return True