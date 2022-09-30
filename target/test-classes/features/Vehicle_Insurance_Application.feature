#language: pt
#/**
#* Autor: Monaliza Leitner Corsi
#* Data: 27/09/2022
#*/

@SeguroAutomotivo
Funcionalidade: Seguro Automotivo
  
  Eu como desenvolvedor quero validar as ações da

  @CriarCotacaoSeguroAutomotivo
  Esquema do Cenario: Criar cotação de seguro automotivo
    Dado que estou no site "<url_site>"
    Quando preencho o formulário na aba Enter Vehicle Data
    E pressiono o botão Next para a aba Insurant Data
    Quando preencho o formulário na aba Enter Insurant Data
    E pressiono o botão Next para a aba Product Data
    Quando preencho o formulário na aba Enter Product Data
    E pressiono o botão Next para a aba Price Data Option
    Quando preencho o formulário na aba Enter Price Data Option
    E pressiono o botão Next para a aba Send Quote
    Quando preencho o formulário na aba Send Quote
    E pressiono o botão Send
    Entao valido se a mensagem "<msg_success>" foi apresentada

    Exemplos: 
      | url_site                                   | msg_success             |
      | http://sampleapp.tricentis.com/101/app.php | Sending e-mail success! |
