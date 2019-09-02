# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

class livros:
    """
    
    """

    def __init__(self, nome, autor, status):
        self.nome = nome
        self.autor = autor
        self.status = status
        
        
    def alterar_status(self, status):
               
       
        
        self.status = status
        
        
    def get_status(self):
        return self.status
    
        
