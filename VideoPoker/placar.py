class Placar():
    def __init__(self, aposta, creditos):
        a=0

    def ordenar(self, vetor_in):

        #print(vetor_in)
        vetor_out = []
        for i in range(5):

            #vetor_out = vetor_in
            a=min(vetor_in)
            vetor_out.insert(i,a)
            del vetor_in[vetor_in.index(min(vetor_in))]
            #print("in",vetor_in)
            #print(vetor_out)
       # print(vetor_out)


        return vetor_out

    def dois_pares(self, vetor_in, aposta): #tem que rever ja q n importa naipe
        ganho=0
        if(vetor_in[0]==vetor_in[1] and vetor_in[2]== vetor_in[3] or vetor_in[0]==vetor_in[1] and vetor_in[4]==vetor_in[3] or vetor_in[1]==vetor_in[2] and vetor_in[4]==vetor_in[3]):
            ganho = aposta
        return int(ganho)
    def trinca(self, vetor_in, aposta): #tem que rever ja q n importa naipe
        ganho = 0
        if(vetor_in[0]==vetor_in[1] and vetor_in[2]==vetor_in[1] or vetor_in[2]==vetor_in[1] and vetor_in[3]==vetor_in[2] or vetor_in[2]==vetor_in[3] and vetor_in[3]==vetor_in[4]):
            ganho = aposta*2
        return int(ganho)
    def straight(self, vetor_in, aposta):
        ganho = 0
        if (vetor_in[0] == vetor_in[1] - 1 and vetor_in[0] == vetor_in[1] - 2 and vetor_in[0] == vetor_in[1] - 3 and vetor_in[0] == vetor_in[1] - 4):
            ganho = aposta * 5
        return int(ganho)

    def flush(self, vetor_in, vetor_in2, aposta):
        ganho = 0
        if(vetor_in2[0]==vetor_in2[1] and vetor_in2[2]==vetor_in2[1] and vetor_in2[2]==vetor_in2[3] and vetor_in2[3]==vetor_in2[4]):
            if(vetor_in[0]!=vetor_in[1] or vetor_in[2]!=vetor_in[1] or vetor_in[2]!=vetor_in[3] or vetor_in[3]!=vetor_in[4]):
                ganho=aposta * 10
        return int(ganho)

    def full_hand(self, vetor_in, aposta): #tem que rever ja q n importa naipe
        ganho = 0
        if(vetor_in[0]==vetor_in[1] and vetor_in[1]==vetor_in[2] and vetor_in[3]==vetor_in[4] or vetor_in[0]==vetor_in[1] and vetor_in[3]==vetor_in[2] and vetor_in[3]==vetor_in[4]):
            ganho=aposta*20
        return int(ganho)

    def quadra(self, vetor_in, aposta): #tem que rever ja q n importa naipe
        ganho = 0
        if(vetor_in[0]==vetor_in[1]==vetor_in[2]==vetor_in[3] or vetor_in[1]==vetor_in[2]==vetor_in[3]==vetor_in[4]):
            ganho=aposta*50
        return int(ganho)
    def straight_flush(self, vetor_in, vetor_in2, aposta):
        ganho = 0
        if(vetor_in2[0]==vetor_in2[1] and vetor_in2[2]==vetor_in2[1] and vetor_in2[2]==vetor_in2[3] and vetor_in2[3]==vetor_in2[4]):
            if(vetor_in[0]==vetor_in[1]-1 and vetor_in[0]==vetor_in[1]-2 and vetor_in[0]==vetor_in[1]-3 and vetor_in[0]==vetor_in[1]-4):
                ganho=aposta*100
        return int(ganho)

    def royal_straight_flush(self, vetor_in, aposta):
        ganho = 0
        if (vetor_in[0] == 8 and vetor_in[1] == 9 and vetor_in[2] == 10 and vetor_in[3]==11 and vetor_in[4]==12 or vetor_in[0] == 21 and vetor_in[1] == 22 and vetor_in[2] == 23 and vetor_in[3]== 24 and vetor_in[4]==25 or vetor_in[0] == 34 and vetor_in[1] == 35 and vetor_in[2] == 36 and vetor_in[3]== 37 and vetor_in[4]==38 or vetor_in[0] == 47 and vetor_in[1] == 48 and vetor_in[2] == 49 and vetor_in[3]==50 and vetor_in[4]==51):
            ganho = aposta * 200
        return int(ganho)