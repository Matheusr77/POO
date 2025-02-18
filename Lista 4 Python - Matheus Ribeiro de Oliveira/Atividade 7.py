class MaterialBiblioteca:
    def __init__(self, titulo, ano):
        self.titulo = titulo
        self.ano = ano

    def exibir_info(self):
        return f"Título: {self.titulo}, Ano: {self.ano}"

class Livro(MaterialBiblioteca):
    def __init__(self, titulo, ano, autor, num_paginas):
        super().__init__(titulo, ano)
        self.autor = autor
        self.num_paginas = num_paginas

    def exibir_info(self):
        return f"Livro: {self.titulo}, Ano: {self.ano}, Autor: {self.autor}, Páginas: {self.num_paginas}"

class Revista(MaterialBiblioteca):
    def __init__(self, titulo, ano, volume, edicao):
        super().__init__(titulo, ano)
        self.volume = volume
        self.edicao = edicao

    def exibir_info(self):
        return f"Revista: {self.titulo}, Ano: {self.ano}, Volume: {self.volume}, Edição: {self.edicao}"

class DVD(MaterialBiblioteca):
    def __init__(self, titulo, ano, duracao):
        super().__init__(titulo, ano)
        self.duracao = duracao

    def exibir_info(self):
        return f"DVD: {self.titulo}, Ano: {self.ano}, Duração: {self.duracao} min"