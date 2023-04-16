# Microsserviço que consome a api do chat-GPT3 | 2023
 

# Sobre o Projeto apresentado

Esse microsserviço realiza uma chamada a api do chat-GPT3 enviando o prompt informado a api e devolvendo a reposta recebida da api. Considere que deverá criar e utilizar sua própria chave de API da Open AI, a chave que está hardcoded no código já foi desativada.

# Sobre a execução do projeto
  - clonar o projeto
  - na pasta raiz do projeto executar o comando abaixo, para dar permissão de execução para o script, esse script builda a imagem do container e roda uma instância do container.

    ```bash
      $ chmod +x start.sh
    ```
  - executar o script 
    ```bash
      $ ./start.sh
    ```
    
 

# Sobre a integração com outros microsserviços

 - [busca os certificados na plataforma da DIO](https://github.com/P3d50/certificates)
 - [envia as informações para o chat-GPT3 via api](https://github.com/P3d50/chatgtp)
 - [API que consome as duas aplicações acima](https://github.com/P3d50/dio-bio)
 
 - considerar que esses projetos estão em fase inicial e não foram pensadas questões como privacidade e segurança, existem algumas coisas hardcoded que serão melhoradas posteriormente, utilize com cautela.
 - as urls dos serviços estão em hardcoded, chaves de api, etc.. considere isso antes de subir esses projetos para alguma núvem pública.
 
 


# Autor

P3d50

https://www.linkedin.com/in/pedro-ramos-3b35aaa0/
