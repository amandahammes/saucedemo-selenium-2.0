#language: pt
Funcionalidade: Realizar compras
  Como um usuário do SauceDemo
  Quero realizar a autenticação no sistema
  Para acessar a lista de produtos e realizar compras

  @CT003
  Esquema do Cenario: Realizar compra com sucesso
    Dado que estou na página de login do SauceDemo
    E insiro o usuário e a senha do <user>
    E clico no botão de login
    E seleciono item para compra
    Quando vou para o carrinho
    E vou para o checkout
    E faço checkout com <nome>, <sobrenome>, <cep>
    E clico no botao continue
    E finalizo compra
    Então devo visualizar mensagem de compra efetuada com sucesso

    Exemplos:
      |       user      |  nome | sobrenome |   cep    |
      | "usuarioValido" | "Ana" |  "Banana" | "123456" |

  @CT004
  Esquema do Cenario: Realizar compra de dois itens com sucesso
    Dado que estou na página de login do SauceDemo
    E insiro o usuário e a senha do <user>
    E clico no botão de login
    E seleciono dois itens para compra
    Quando vou para o carrinho
    #E valido dois itens no carrinho
    E vou para o checkout
    E faço checkout com <nome>, <sobrenome>, <cep>
    E clico no botao continue
    E finalizo compra
    Então devo visualizar mensagem de compra efetuada com sucesso

    Exemplos:
      |       user      |  nome | sobrenome |   cep    |
      | "usuarioValido" | "Ana" |  "Banana" | "123456" |


  @CT005
  Esquema do Cenario: Erro ao realizar Checkout sem informacoes obrigatorias
    Dado que estou na página de login do SauceDemo
    E insiro o usuário e a senha do <user>
    E clico no botão de login
    E seleciono item para compra
    Quando vou para o carrinho
    E vou para o checkout
    E faço checkout com <nome>, <sobrenome>, <cep>
    E clico no botao continue
    Então a mensagem de <erro> de checkout aparecerá em tela

    Exemplos:
      |       user      |  nome | sobrenome |   cep    |              erro                |
      | "usuarioValido" |   ""  |  "Banana" | "123456" | "Error: First Name is required"  |
      | "usuarioValido" | "Ana" |   ""      | "123456" | "Error: Last Name is required"   |
      | "usuarioValido" | "Ana" |  "Banana" |    ""    | "Error: Postal Code is required" |

  @CT006
  Esquema do Cenario: Comprar  selecionando pedido via página de descrição do item
    Dado que estou na página de login do SauceDemo
    E insiro o usuário e a senha do <user>
    E clico no botão de login
    E entro na tela de descricao do item
    E seleciono item para compra na tela de descricao de item
    Quando vou para o carrinho
    E vou para o checkout
    E faço checkout com <nome>, <sobrenome>, <cep>
    E clico no botao continue
    E finalizo compra
    Então devo visualizar mensagem de compra efetuada com sucesso

    Exemplos:
      |       user      |  nome | sobrenome |   cep    |
      | "usuarioValido" | "Ana" |  "Banana" | "123456" |

  @CT007
  Esquema do Cenario: Cenario: Realizar logout com sucesso
    Dado que estou logado com <user> na página SauceDemo
    Quando seleciono a opcao logout no menu
    Então devo ser direcionado para a página de login

    Exemplos:
    |       user      |
    | "usuarioValido" |