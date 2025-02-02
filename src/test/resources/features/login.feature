#language:pt

Funcionalidade: Login

  Contexto:
    Dado que a modal esteja sendo exibida

  @fecharModalIcone
  Cenario: Fechar modal ao clicar no icone fechar
    Quando for realizado um clique no icone de fechar da modal
    Entao a janela da modal deve ser fechada

  @fecharModal
  Cenario: Fechar modal ao clicar fora da mesma
    Quando for realizado um clique fora da modal
    Entao a janela de modal deve ser fechada

  @createNewAccount
  Cenario: Link create new account
    Quando for realizado um clique no link do Create new Account
    Entao a pagina do create new account deve ser exibida

  @loginComSucesso
  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login sejam preenchidos da seguinte forma
      | username | <username> |
      | password | <password> |
      | Remember | <remember> |
    Quando clicar no botao sign in
    Entao deve ser possivel logar no sistema
    Exemplos:
      | identificacao       | username     | password | remember |
      | campos obrigatorios | chronosChrys | Senha123 | false    |
      | todos os campos     | chronosChrys | Senha123 | true     |

  @loginInvalido
  Esquema do Cenario: Realizar login invalido com <identificacao>
    Quando os campos de login sejam preenchidos da seguinte forma
      | username | <username> |
      | password | <password> |
      | Remember | <remember> |
    Quando for realizado o clique no botao sign in
    Entao o sistema deve exibir uma mensagem de erro
    Exemplos:
      | identificacao    | username     | password | remember |
      | usuario invalido | invalido     | Senha123 | false    |
      | senha invalida   | chronosChrys | invalida | false    |

  @dadosEmBranco
  Esquema do Cenario: Realizar login em branco com <identificao>
    Quando os campos de login sejam preenchidos da seguinte forma
      | username | <username> |
      | password | <password> |
      | Remember | <remember> |
    Entao o botao sign in deve permanecer desabilitado
    Exemplos:
      | identificao       | username     | password | remember |
      | usuario em branco |              | Senha123 | false    |
      | senha em branco   | chronosChrys |          | false    |

