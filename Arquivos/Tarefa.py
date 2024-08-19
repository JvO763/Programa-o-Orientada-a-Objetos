# -*- coding: utf-8 -*-
"""
Created on Thu Apr 27 11:17:46 2023

@author: jv0vi
"""

import sys
n=49;
		
while True: 
    try :
        print("\nDigite o valor máximo do intervalo:")
        n=int(input())
        break
    except ValueError:
        print("O valor que vc digitou não é válido")

h=n
g=n//2
i=1
j=1

while(j==1):
    print("O número {} em relação ao seu número é: \n1.Maior \n2.Menor \n3.Igual".format(g))
    n=int(input())
    if(n==3):
        print("Número acertado após {} tentativas.".format(i))
        sys.exit("")
        j=0
    if(n==2):
        g=g+1
        i=i+1
    if(n==1):
        g=g-1
        i=i+1
        
	
	
        
				