class Jogar():
    def __init__(self):
        print("\nBora jogar!\n")
        k="1"
        creditos=200

        while k=="1" and creditos>0:
            print("Quanto quer apostar? Lembrando que você possui: ", creditos, " créditos")
            aposta=input()
            creditos=creditos-int(aposta)
            from cartas import Cartas
            carta1 = Cartas()
            vetor =[]
            vetor=carta1.virar(5)
            matriz = carta1.visual(vetor)
            carta1.trocar(matriz)
            matriz = carta1.visual(vetor)
            carta1.trocar(matriz)
            matriz = carta1.visual(vetor)
            vetor_bruto = []
            vetor_valor = []
            vetor_visual = []
            vetor_naipe = []
            vetor_bruto=matriz[3]
            vetor_valor = matriz[2]
            vetor_visual = matriz[1]
            vetor_naipe = matriz[0]
            #print(vetor_bruto)
            #print(vetor_valor)
            #print(vetor_visual)
            #print(vetor_naipe)
            from placar import Placar
            placar1 = Placar(aposta,creditos)
            bruto_ordenado = []
            valor_ordenado = []
            bruto_ordenado = placar1.ordenar(vetor_bruto)
            valor_ordenado = placar1.ordenar(vetor_valor)
            print(valor_ordenado)
            print(bruto_ordenado)
            ganho=0
            ganho1=placar1.dois_pares(valor_ordenado, aposta)
            ganho2=placar1.trinca(valor_ordenado, aposta)
            ganho3=placar1.straight(valor_ordenado, aposta)
            ganho4=placar1.flush(valor_ordenado, vetor_naipe, aposta)
            ganho5=placar1.full_hand(valor_ordenado, aposta)
            ganho6=placar1.quadra(valor_ordenado, aposta)
            ganho7=placar1.straight_flush(valor_ordenado, vetor_naipe, aposta)
            ganho8=placar1.royal_straight_flush(bruto_ordenado, aposta)
            ganho = max(ganho1, ganho2, ganho3, ganho4, ganho5, ganho6, ganho7, ganho8)

            creditos = creditos + ganho
            print("Deseja continuar, digite 1! caso queira sair, digite 0")
            k = input()

jogar1 = Jogar()
