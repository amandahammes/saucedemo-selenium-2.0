#language: pt
Funcionalidade: Realizar login
  Como um usuário do SauceDemo
  Quero realizar a autenticação no sistema
  Para acessar a lista de produtos e realizar compras

  @CT001
  Esquema do Cenario: Realizar login com sucesso
    Dado que estou na página de login do SauceDemo
    Quando insiro o usuário e a senha do <user>
    E clico no botão de login
    Então devo ser redirecionado para a página de produtos

    Exemplos:
      |      user       |
      | "usuarioValido" |

  @CT002
  Esquema do Cenario: Impossibilidade de realizar login com credenciais inválidas
    Dado que estou na página de login do SauceDemo
    Quando insiro o usuário e a senha do <user>
    E clico no botão de login
    Então a mensagem de <erro> aparecerá em tela
    E o login não será realizado

    Exemplos:
      |         user         |                                     erro                                    |
      |   "senhaSemUsuario"  |                     "Epic sadface: Username is required"                    |
      |   "usuarioSemSenha"  |                     "Epic sadface: Password is required"                    |
      |    "usuarioErrado"   | "Epic sadface: Username and password do not match any user in this service" |
      | "usuarioSenhaErrada" | "Epic sadface: Username and password do not match any user in this service" |
      |  "usuarioBloqueado"  |             "Epic sadface: Sorry, this user has been locked out."           |