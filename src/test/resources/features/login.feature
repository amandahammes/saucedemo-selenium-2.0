#language: pt
Funcionalidade: Realizar login
  Como um usuário do SauceDemo
  Quero realizar a autenticação no sistema
  Para acessar a lista de produtos e realizar compras

  @CT001
  Esquema do Cenario: Realizar login com sucesso
    Dado que estou na página de login do SauceDemo
    Quando insiro o usuário <user> e a senha <password>
    E clico no botão de login
    Então devo ser redirecionado para a página de produtos

    Exemplos:
      |     user      |   password   |
      |"standard_user"|"secret_sauce"|

