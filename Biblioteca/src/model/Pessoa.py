# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

class pessoa:
    
    def __init__(self, nome, cpf, email):
        self.nome = nome
        self.cpf = cpf
        self.email  = email
        
    
    
    def listar_pessoa(self):
        print(self.nome, self.cpf, self.email)
        
        
        
