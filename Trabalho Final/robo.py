import heapq  # Adicionar esta linha no início do arquivo
from estado import estado  # Importar a classe Estado

class Robo(estado):  # Herdar da classe Estado
    def __init__(self, num_sujeiras):
        super().__init__(num_sujeiras)

    def run(self, matriz, x, y):
        """
        Define a estratégia de movimentação do robô.
        """
        print(f"Total de sujeiras: {self.get_num_sujeiras()}")
        print(f"Sujeiras limpas: {self.get_sujeiras_limpas()}")

        # Encontrar a sujeira mais próxima
        sujeira_x, sujeira_y = self.encontrar_sujeira_mais_proxima(matriz, x, y)
        if sujeira_x is None or sujeira_y is None:
            return 'Q'  # Não há mais sujeiras para limpar

        # Calcular o caminho mais curto usando A*
        caminho = self.a_star(matriz, (x, y), (sujeira_x, sujeira_y))
        if caminho:
            # Mover na direção do próximo passo no caminho
            next_x, next_y = caminho[1]
            if next_x < x:
                return 'W'
            elif next_x > x:
                return 'S'
            elif next_y < y:
                return 'A'
            elif next_y > y:
                return 'D'
        return 'Q'  # Se não houver caminho, encerrar

    def a_star(self, matriz, inicio, objetivo):
        """
        Implementa o algoritmo A* para encontrar o caminho mais curto.
        """
        def heuristic(a, b):
            return abs(a[0] - b[0]) + abs(a[1] - b[1])

        vizinhos = [(0, 1), (1, 0), (0, -1), (-1, 0)]
        fronteira = []
        heapq.heappush(fronteira, (0, inicio))  # Usando heapq
        veio_de = {}
        custo_ate_agora = {}
        veio_de[inicio] = None
        custo_ate_agora[inicio] = 0

        while fronteira:
            _, atual = heapq.heappop(fronteira)  # Usando heapq

            if atual == objetivo:
                break

            for dx, dy in vizinhos:
                proximo = (atual[0] + dx, atual[1] + dy)
                novo_custo = custo_ate_agora[atual] + 1

                if 0 <= proximo[0] < len(matriz) and 0 <= proximo[1] < len(matriz[0]):
                    if matriz[proximo[0]][proximo[1]] != -1:
                        if proximo not in custo_ate_agora or novo_custo < custo_ate_agora[proximo]:
                            custo_ate_agora[proximo] = novo_custo
                            prioridade = novo_custo + heuristic(objetivo, proximo)
                            heapq.heappush(fronteira, (prioridade, proximo))  # Usando heapq
                            veio_de[proximo] = atual

        caminho = []
        atual = objetivo
        while atual != inicio:
            caminho.append(atual)
            atual = veio_de[atual]
        caminho.append(inicio)
        caminho.reverse()
        return caminho