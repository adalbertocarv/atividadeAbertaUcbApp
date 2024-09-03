# Cadastro de Produtos

Este é um projeto de aplicativo Android para a faculdade, desenvolvido para demonstrar a implementação de uma tela de cadastro de produtos. O aplicativo permite que o usuário insira o nome e o preço de um produto, marque se o produto é importado, e exibe essas informações usando um `Toast` personalizado.

## Funcionalidades

- Entrada de nome do produto.
- Entrada de preço do produto.
- Opção de marcar o produto como importado.
- Botão para salvar que valida as entradas e exibe os dados em um `Toast` centralizado na tela.

## Estrutura do Projeto

- **MainActivity.java**: Contém a lógica para tratar o clique no botão salvar, validar as entradas e exibir o `Toast` personalizado.
- **activity_main.xml**: Layout principal do aplicativo, incluindo campos de texto para nome e preço do produto, um checkbox para produto importado e um botão salvar.
- **custom_toast.xml**: Layout do `Toast` personalizado, que permite exibir mensagens no centro da tela com um estilo próprio.

## Requisitos

- Android Studio
- JDK 11 ou superior
- Gradle 7.0 ou superior
- Dispositivo ou Emulador rodando Android API nível 21 (Lollipop) ou superior

## Como Executar o Projeto

1. **Clonar o Repositório**: Clone este repositório em sua máquina local usando o comando:

   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
