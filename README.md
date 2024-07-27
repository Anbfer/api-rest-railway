# Construção de API RESTful com deploy em nuvem com Railway

O projeto faz um mock da tela inicial do App do banco Santander, exibindo as informações sobre saldo, nome do cliente, entre outros detalhes da conta.

- Abstração inicial do domínio com Figma - [Referência](https://www.figma.com/design/0ZsjwjsYlYd3timxqMWlbj/SANTANDER---Projeto-Web%2FMobile)
- Diagrama de classes feito com ChatGPT e Mermaid - [Referência](https://github.com/falvojr/santander-dev-week-2023?tab=readme-ov-file#diagrama-de-classes-dom%C3%ADnio-da-api)
```mermaid
classDiagram
  class User {
    -String name
    -Account account
    -Feature[] features
    -Card card
    -News[] news
  }

  class Account {
    -String number
    -String agency
    -Number balance
    -Number limit
  }

  class Feature {
    -String icon
    -String description
  }

  class Card {
    -String number
    -Number limit
  }

  class News {
    -String icon
    -String description
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card
  User "1" *-- "N" News
```


- Provisionamento do PostgreSQL (Railway) e criação do perfil de PRD
- Deploy da API na Nuvem(Railway)