# SauceDemo Selenium

| ID         | Cenário de Teste                  | Prioridade | Risco   | Impacto do Risco                                                |
|:-----------|:----------------------------------|:-----------|:--------|:----------------------------------------------------------------|
| **CT-001** | Login Válido                      | Alta       | Crítico | Bloqueio total de uso da plataforma por clientes legítimos.     |
| **CT-002** | Login Usuário Bloqueado           | Alta       | Alto    | Usuários restritos acessando o sistema e realizando compras.    |
| **CT-002** | Login sem Senha                   | Média      | Baixo   | Mensagem de erro ausente, mas o acesso continua restrito.       |
| **CT-002** | Login Usuário Inválido            | Média      | Baixo   | Tentativas de invasão (brute force) sem barreira de erro.       |
| **CT-003** | Compra de um Item                 | Alta       | Crítico | Principal fluxo de receita. Falha impede a venda.               |
| **CT-004** | Compra de dois Itens              | Alta       | Crítico | Erro no cálculo de múltiplos itens gera prejuízo financeiro.    |
| **CT-005** | Compra de todos os Itens          | Alta       | Crítico | Sobrecarga do carrinho ou erro no processamento de massa.       |
| **CT-006** | Checkout sem First Name           | Média      | Médio   | Dados de entrega incompletos gerando falha logística.           |
| **CT-006** | Checkout sem Last Name            | Média      | Médio   | Dados de entrega incompletos gerando falha logística.           |
| **CT-006** | Checkout sem Postal Code          | Alta       | Alto    | Impossibilidade de calcular frete ou entregar o produto.        |
| **CT-007** | Compra via Página de Descrição    | Média      | Médio   | Quebra de fluxo de navegação alternativo.                       |
| **CT-008** | Realizar Logout                   | Média      | Médio   | Sessões abertas em dispositivos públicos (falha de segurança).  |
