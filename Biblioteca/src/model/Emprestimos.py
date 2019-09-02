# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
from Usuarios_biblioteca import Usuarios_biblioteca
from livros import livros

class emprestimos:

    def __init__(self, usuario, livro):
        livro1 = livros(livro)
        user = Usuarios_biblioteca(usuario)
        
        
    def emprestar(self):
        if(self.livro1.get_status == "livre"):
            print("Emprestimo realizado")
        elif(self.livro1.get_status == "reservado"):
            print("O livro esta reservado")
        else:
            print("Livro indisponivel")
        

    def reservar_livro(self):
        livro1.alterar_status("reservado")
        
    
    def devolver_livro(self):
       
        livro1.alterar_status("livre")
        
    def calcular_multa(self, dias):
        return ("A multa é de :", dias * 1.50)
    
    