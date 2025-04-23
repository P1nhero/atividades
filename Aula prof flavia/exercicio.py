import sqlite3
con = sqlite3.connect("funcionario.db")



funcionario1 = 5

for i in range (funcionario1):
    print("----------")
    SalarioInicial = int(input("digite seu salario atual "))
    Aumento= (SalarioInicial*15/100 + SalarioInicial)
    Desconto =(Aumento * 8/100)
    SalarioAtual=(Aumento-Desconto)
    print(SalarioAtual)

