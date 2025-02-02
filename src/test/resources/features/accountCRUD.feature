 #language:pt

 @CRUD
 Funcionalidade: Account CRUD

   @cadastroConta
   Cenario: Cadastro nova conta
     Dado que a pagina esteja sendo exibida
     Quando os campos estiverem preenchidos com
       | username | chronosChrys       |
       | password | Senha123           |
       | email    | chrys@email.com.br |
       | country  | Brazil             |

     Entao deve ser possivel logar no sistema apos o cadastro

   @loginCRUD
   Cenario: Realizar login crud
     Dado que a modal esteja sendo exibida
     Quando os campos de login sejam preenchidos da seguinte forma
       | username | chronosChrys |
       | password | Senha123     |
       | Remember | false        |
     Quando clicar no botao sign in
     Entao deve ser possivel logar no sistema

   @alteracaoCRUD
   Cenario: Realizar alteração na conta
     Dado que esteja logado no sistema com
       | username | chronosChrys |
       | password | Senha123     |
       | Remember | false        |
     Dado que esteja na pagina de alteracao da conta
     Quando altero os valores do seguintes campos:
       | firstname | Chronos |
       | lastname  | Teste   |
     Quando for realizado o clique no botao salvar
     Entao a alteracao foi exibida na pagina myAccount

     @exclusaoCRUD
     Cenario: Realizar exclusao da conta
       Dado que esteja logado no sistema com
         | username | chronosChrys |
         | password | Senha123     |
         | Remember | false        |
       Dado que esteja na pagina myAccount
       Quando for efetuado a acao do clique delete e em yes
       Entao o usuario deve ser deletado