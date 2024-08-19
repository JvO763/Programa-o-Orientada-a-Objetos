class EntradaTeclado:
    @staticmethod
    def leString():
        x = input()
        return x

    @staticmethod
    def leInt():
        x = EntradaTeclado.leString()
        return int(x)

    @staticmethod
    def leDouble():
        x = EntradaTeclado.leString()
        return float(x)