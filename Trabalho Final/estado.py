class estado:
    def __init__(self, num_sujeiras):
        self.num_sujeiras = num_sujeiras
        self.sujeiras_limpas = 0

    def get_num_sujeiras(self):
        return self.num_sujeiras

    def get_sujeiras_limpas(self):
        return self.sujeiras_limpas

    def set_sujeiras_limpas(self, valor):
        self.sujeiras_limpas = valor

    def encontrar_sujeira_mais_proxima(self, matriz, x, y):
        """
        Retorna a posição (x, y) da sujeira mais próxima do robô.
        """
        sujeiras = [(i, j) for i in range(len(matriz)) for j in range(len(matriz[i])) if matriz[i][j] == 1]
        if not sujeiras:
            return None, None
        return min(sujeiras, key=lambda p: self.calcular_distancia(x, y, p[0], p[1]))

    def calcular_distancia(self, x1, y1, x2, y2):
        """
        Retorna a distância de Manhattan entre duas coordenadas.
        """
        return abs(x1 - x2) + abs(y1 - y2)

    def verificar_caminho_livre(self, matriz, x, y):
        """
        Verifica se há um caminho sem obstáculos até a sujeira.
        """
        return 0 <= x < len(matriz) and 0 <= y < len(matriz[0]) and matriz[x][y] != -1