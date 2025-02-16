from robo_limpeza import RoboLimpeza

if __name__ == "__main__":
    jogo = RoboLimpeza(tamanho=5, num_obstaculos=3, num_sujeiras=4)
    jogo.iniciar_limpeza()