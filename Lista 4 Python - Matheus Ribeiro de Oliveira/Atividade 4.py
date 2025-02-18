class Produto:
    def __init__(self, nome, preco, estoque):
        self.nome = nome
        self.preco = preco
        self.estoque = estoque

produtos = []

def adicionar_produto(produto):
    produtos.append(produto)

def remover_produto(nome):
    global produtos
    produtos = [p for p in produtos if p.nome != nome]

def buscar_produto(nome):
    return next((p for p in produtos if p.nome == nome), "Produto não encontrado")