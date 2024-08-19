# -*- coding: utf-8 -*-
"""
Created on Thu May 18 10:26:43 2023

@author: jv0vi
"""
class Cartas():
    def __init__(self):
        self.vetor=self.virar(5)
        #print(self.vetor)
        #self.matriz=self.visual(self.vetor)
        #self.trocar(self.matriz)
        #self.matriz = self.visual(self.vetor)
        #self.trocar(self.matriz)
        #self.matriz = self.visual(self.vetor)



    def virar(self,qnts):
        vetor_cartas =[]
        k = 1
        while k==1:
            k = 1
            pnt = 0
            vetor_cartas.clear()
            for i in range(qnts):
                from random import Random
                random1 = Random()
                carta = random1.get_int_rand(52)
                vetor_cartas.append(carta)
                #print(vetor_cartas)
                for j in range(9999999):
                    a=1
            for i in range(qnts):
                for j in range(qnts-i-1):
                    #print(i)
                    #print(j)
                    if vetor_cartas[i]==vetor_cartas[i+j+1]:
                        pnt=pnt+1
            if pnt==0:
                k=0
        return vetor_cartas
    def visual(self, vetor_out):

        vetor_in = []
        naipe = []
        valor = []
        visual = []
        vetor_in = vetor_out
        for i in range(5):
            if vetor_in[i]<=12:
                naipe.insert(i,"♦")
                valor.insert(i,vetor_in[i]+2)
            if vetor_in[i]>12 and vetor_in[i]<=25:
                naipe.insert(i,"♠")
                valor.insert(i,vetor_in[i] + 2 - 13)
            if vetor_in[i]>25 and vetor_in[i]<=38:
                naipe.insert(i,"♥")
                valor.insert(i,vetor_in[i] + 2 - 26)
            if vetor_in[i]>38:
                naipe.insert(i,"♣")
                valor.insert(i,vetor_in[i] + 2 - 39)
        for i in range(5):
            if valor[i]==11:
                visual.insert(i,"J")
            elif valor[i]==12:
                visual.insert(i,"Q")
            elif valor[i] == 13:
                visual.insert(i, "K")
            elif valor[i]==14:
                visual.insert(i,"A")
            else:
                visual.insert(i,valor[i])

        matriz = []
        matriz.append(naipe)
        matriz.append(visual)
        matriz.append(valor)
        matriz.append(vetor_in)
        #print(matriz)
        for i in range(5):
            print("+-----+\n|", matriz[0][i], "  |\n| ", matriz[1][i], " |\n|  ", matriz[0][i], "|\n+-----+")
        return matriz

    def trocar(self, matriz):
        for i in range(5):
            print("Deseja trocar a carta ", i+1,"? 'Y' para mudar e 'N' para não mudar")
            teste=input()
            vetor=matriz[3]
            if teste=="y" or teste=="Y":
                #print(vetor)
                sai=1
                while sai == 1:
                    sai = 1
                    pnt = 0
                    from random import Random
                    random1 = Random()
                    vetor[i] = random1.get_int_rand(52)
                    for k in range(5):
                        for j in range(5 - k - 1):
                            if vetor[k] == vetor[k + j + 1]:
                                pnt = pnt + 1
                    if pnt == 0:
                        sai = 0
                #self.visual(vetor)
    def retornar(self,vet):
        return vet


#cartas1 = Cartas()







