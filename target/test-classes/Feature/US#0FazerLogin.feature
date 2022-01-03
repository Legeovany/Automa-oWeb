#Language: en


Feature: Fazer Login com Sucesso


  @CT001 @acesso
  Scenario: Validar login realizado com sucesso
    Given   que o usuario acesse a tela de login
    When    o usuario realizar login
    Then    sera realizado o login bem sucedido
    
  
  @CT002 @acesso
  Scenario: Validar acesso ao menu lateral
    Given   que o usuario acesse a home da Swaglabs
    When    o usuario acessar o menu lateral
    Then    sera aberto o menu lateral
  
  
  @CT003
  Scenario: Validar filtro menor para maior
    Given   que o usuario acesse a home da Swaglabs
    When    o usuario filtrar menor para maior
    Then    sera realizado filtro nos produtos
   
   
  @CT004
  Scenario: Validar login realizado no youtube
    Given   que o usuario acesse a home do Youtube
    When    o usuario realizar login youtube
    Then    sera realizado login com sucesso
  