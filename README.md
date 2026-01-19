# Automação SauceDemo Selenium & Cucumber

<p align="center"> <img src="saucedemo-logo.png" width="500px"> </p>

## Cenários Desenvolvidos

Mapeamento de prioridade e risco para garantir a qualidade do fluxo principal de e-commerce.

| ID         | Cenário de Teste                  | Prioridade | Risco   | Impacto do Risco                                                |
|:-----------|:----------------------------------|:-----------|:--------|:----------------------------------------------------------------|
| **CT-001** | Login Válido                      | Alta       | Crítico | Bloqueio total de uso da plataforma por clientes legítimos.     |
| **CT-002** | Login Usuário Bloqueado           | Alta       | Alto    | Usuários restritos acessando o sistema e realizando compras.    |
| **CT-002** | Login sem Senha                   | Média      | Baixo   | Mensagem de erro ausente, mas o acesso continua restrito.       |
| **CT-002** | Login Usuário Inválido            | Média      | Baixo   | Tentativas de invasão (brute force) sem barreira de erro.       |
| **CT-003** | Compra de um Item                 | Alta       | Crítico | Principal fluxo de receita. Falha impede a venda.               |
| **CT-004** | Compra de dois Itens              | Alta       | Crítico | Erro no cálculo de múltiplos itens gera prejuízo financeiro.    |
| **CT-005** | Checkout sem First Name           | Média      | Médio   | Dados de entrega incompletos gerando falha logística.           |
| **CT-005** | Checkout sem Last Name            | Média      | Médio   | Dados de entrega incompletos gerando falha logística.           |
| **CT-005** | Checkout sem Postal Code          | Alta       | Alto    | Impossibilidade de calcular frete ou entregar o produto.        |
| **CT-006** | Compra via Página de Descrição    | Média      | Médio   | Quebra de fluxo de navegação alternativo.                       |
| **CT-007** | Realizar Logout                   | Média      | Médio   | Sessões abertas em dispositivos públicos (falha de segurança).  |

## Tecnologias Utilizadas

Este projeto utiliza a stack de automação Java com as seguintes tecnologias:

    - Java 21: Linguagem base do projeto.
    - Selenium WebDriver (4.38.0): Manipulação e interação com o navegador.
    - Cucumber (7.18.0): Escrita de cenários em BDD (Gherkin).
    - JUnit 5: Framework de execução de testes.
    - Maven: Gerenciador de dependências e automação de build.
    - ExtentReports: Relatórios detalhados com dashboards (HTML).
    - DataFaker: Geração de massa de dados aleatória.

## Para rodar o Projeto na sua Máquina

### Pré-requisitos
Você precisa ter instalado na sua máquina:

[JDK 21](https://www.oracle.com/java/technologies/downloads/#java21)
[Maven](https://maven.apache.org/download.cgi)
[IntelliJ Idea](https://www.jetbrains.com/idea/download/?section=windows) (Recomendado)

### Clonar projeto
- Para realizar o clone do projeto, clique em clone, escolha a forma que deseja fazer a clonagem (se por SSH ou HTTPS), no seu ambiente local de trabalho, abra o terminal, cole o seguinte código e execute o comando: `git clone [cole-o-link-copiado-aqui]`

### Como executar projeto
- Após o clone do projeto, acesse o diretório recém clonado;

#### Executar via terminal
- Para rodar todos os testes e gerar relatório digite o seguinte comando no terminal: `mvn clean test`

#### Executar via Runner
- No IntelliJ (ou na sua IDE de preferência), navegue até a pasta src/test/java/runners e execute a classe Runner.
- Para executar cenários específicos, altere a anotação `@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@CT002")` com o valor de value igual ao teste que deseja executar (no exemplo, o CT002) e clique na setinha de run ao lado do da chamada da classe Runner.

## Relatórios

Após a execução dos testes, os relatórios são gerados automaticamente na pasta: `Report/`

O arquivo principal está dentro da pasta `Report_[Data]` como `Report_[Data].html.` Ele contém o log de cada passo executado e o status de sucesso/falha.
Além disso, caso haja falhas, haverá uma pasta chamada `Screenshot` com as imagens capturadas do momento da falha.

## Estrutura do projeto

O projeto segue o padrão Page Object Model (POM) para facilitar a manutenção:

  features: Arquivos .feature (BDD).
  steps: Implementação dos passos do Cucumber.
  pages: Localização de elementos e ações da página.
  validations: Asserts e verificações de tela.
  utils: Classes de suporte (Datas, criação de pastas, etc).

Projeto desenvolvido por [Amanda Kopper Hammes](https://github.com/amandahammes) em janeiro/2026.
