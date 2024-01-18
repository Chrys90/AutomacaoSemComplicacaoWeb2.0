#language:pt

Funcionalidade: Login
  Contexto:
    Dado que a modal esteja sendo exibida

@fecharModal
  Cenario: Fechar modal ao clicar no icone fechar
    Quando for realizado um clique no icone de fechar da modal
    Entao a janela da modal deve ser fechada

  Cenario: Fechar modal ao clicar fora da mesma
    Quando for realizado um clique fora da modal
    Entao a janela de modal deve ser fechada

  Cenario: Link create new account
    Quando for realizado um clique no link do Create new Account
    Entao a pagina do create new account deve ser exibida

  Esquema do Cenario: Realizar login com <identificacao>
    Quando informar os campos de login e senha
      | login | <login> |
      | senha | <senha> |
      | Remember | <remember> |
    Quando clicar no botao sign in
    Entao deve ser possivel logar no sistema
    Exemplos:
     |identificacao | login | senha | remember |
     |campos obrigatorios | chronos | senha | false |
     |todos os campos | chronos | senha | true |

  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login sejam preenchidos da seguinte forma
      | login | <login> |
      | senha | <senha> |
      | Remember | <remember> |
    Quando for realizado o clique no botao sign in
    Entao o sistema deve exibir uma mensagem de erro
    Exemplos:
    |identificacao  | login | senha | remember |
    |usuario invalido  | invalido | senha | false |
    |senha invalida  | chronos | invalida | false |


  Esquema do Cenario: Realizar login com <identificao>
    Quando os campos de login sejam preenchidos da seguinte forma
      | login |  <login>       |
      | senha | <senha>	  |
      | Remember | <remember> |
   Entao o botao sign in deve permanecer desabilitado
    Exemplos:
   |identificao   | login | senha | remember |
   |usuario em branco   |  | senha | false |
   |senha em branco   | chronos |  | false |

