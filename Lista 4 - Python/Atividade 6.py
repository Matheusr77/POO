class Pessoa:
    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade

    def apresentar(self):
        return f"Meu nome é {self.nome} e tenho {self.idade} anos"

class Empregado:
    def __init__(self, cargo, salario):
        self.cargo = cargo
        self.salario = salario

    def exibir_dados(self):
        return f"Cargo: {self.cargo}, Salário: {self.salario}"

class PessoaEmpregado(Pessoa, Empregado):
    def __init__(self, nome, idade, cargo, salario):
        Pessoa.__init__(self, nome, idade)
        Empregado.__init__(self, cargo, salario)