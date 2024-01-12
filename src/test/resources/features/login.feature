#language:pt

Funcionalidade: Login
  Contexto: Dado que a modal esteja aberta


  Cenario: Fechar modal ao clicar no icone fechar

    Quando clicar no icone fechar da modal
    Entao a modal de login deve ser fechada

  Cenario: Fechar modal ao clicar fora da modal

    Quando clicar no fora da modal
    Entao a modal de login deve ser fechada

  Cenario: Efetuar validacao do link create new account

    Quando clicar em Create new Account
    Entao deve ser apresentada a tela para cadastro de novo login

  Cenario: Realizar login com todos os campos

    Quando informar os campos de login e senha
      | login | chronos |
      | senha | senha |
      | Remember | true |
    E clicar no botao sign in
    Entao deve ser apresentado a pagina do usuario logado no sistema

  Cenario: Realizar login com campos obrigatorios

    Quando informar os campos de login e senha
      | login | chronos |
      | senha | senha |
      | Remember | false |
    E clicar no botao sign in
    Entao deve ser apresentado a pagina do usuario logado no sistema

  Cenario: Realizar login com usuario invalido

    Quando informar usuario invalido
      | login | invalido |
      | senha | senha |
      | Remember | false |
    E clicar no botao sign in
    Entao deve ser apresentado mensagem de erro informando que o usuario ou senha esta incorreto

  Cenario: Realizar login com senha invalida

    Quando informar senha invalida
      | login | chronos |
      | senha | invalida |
      | Remember | false |
    E clicar no botao sign in
    Entao deve ser apresentado mensagem de erro informando que o usuario ou senha esta incorreto

  Cenario: Realizar login com campo senha em branco

    Quando informar senha em branco
      | login | chronos |
      | senha | 		  |
      | Remember | false |
    Entao o botao sign in deve permanecer desabilitado

  Cenario: Realizar login com campo usuario em branco

    Quando informar senha em branco
      | login |         |
      | senha | senha	  |
      | Remember | false |
    Entao o botao sign in deve permanecer desabilitado