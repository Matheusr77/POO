contatos = []

# Adicionar novos contatos

def adicionar_contato():
    nome = input("Digite o nome do contato: ")
    telefone = input("Digite o telefone do contato: ")
    email = input("Digite o e-mail do contato: ")

    # Colocar o contato na lista
    contato = {"nome": nome, "telefone": telefone, "email": email}
    contatos.append(contato)
    print(f"\nContato {nome} foi adicionado com sucesso!\n")

# Apagar um contato

def apagar_contato():
    nome = input("Digite o nome do contato: ")

    for contato in contatos:
        if contato["nome"].lower() == nome.lower():
            contatos.remove(contato)
            print(f"Contato {nome} apagado! \n")
            return
    print(f"Contato {nome} não encontrado. \n")

# Procurar um contato

def procurar_contato():
    nome = input("Digite o nome do contato: ")

    for contato in contatos:
        if contato["nome"].lower() == nome.lower():
            print(f"\nNome: {contato['nome']}")
            print(f"Telefone: {contato['telefone']}")
            print(f"E-mail: {contato['email']}\n")
            return
    print(f"Contato {nome} não encontrado. \n")

#Exibir o menu

def menu():
    print("Menu de opções:")
    print("1. Inserir novo contato")
    print("2. Apagar contato")
    print("3. Procurar contato")
    print("4. Sair")

def controlar_menu():
    while True:
        menu()
        opcao = input("Escolha uma opção: ")

        if opcao == "1":
            adicionar_contato()
        elif opcao == "2":
            apagar_contato()
        elif opcao == "3":
            procurar_contato()
        elif opcao == "4":
            print("Saindo do programa")
            break
        else: 
            print("Opção inválida.\n")

#Iniciar o programa
controlar_menu()

