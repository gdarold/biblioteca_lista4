#!/usr/bin/env python2
#encoding: windows-1252

# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
from Pessoa import pessoa
from Usuarios_biblioteca import Usuarios_biblioteca
from Emprestimos import emprestimos

from livros import livros


if __name__ == "__main__":
   
   pessoa1 = pessoa("pedro", "05090980040", "pedro@pedro.com")
   
   pessoa1.listar_pessoa()
   
   
   user = Usuarios_biblioteca(pessoa1, "aluno",True )
   
   livro1 = livros("A volta dos que não foram", "pedrinho luz", "emprestado")
   
   livro2 = livros("A ida dos que não voltaram", "pedrinho luz", "livre")
   
   print(livro1.nome)
   emprestimo1 = emprestimos(user, livro1)
   
   print (emprestimo1)
   #emprestimo1.emprestar()
   
   
   
   

    
