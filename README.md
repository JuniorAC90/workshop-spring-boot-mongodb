# Projeto MongoDB com Spring Boot
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/JuniorAC90/workshop-spring-boot-mongodb/blob/main/LICENSE) 

# Sobre o projeto

É uma aplicação back end construída durante o [curso](https://www.udemy.com/course/java-curso-completo) **Java Completo Programação Orientada a Objetos + Projetos** organizado pelo professor Nélio Alves no site da Udemy.

A aplicação consiste no registro de usuários juntamente com os seus posts e comentários.

## Modelo conceitual
![Modelo Conceitual](https://github.com/JuniorAC90/workshop-spring-boot-mongodb/blob/main/assets/modelo-conceitual.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
## Implantação em ambiente teste
- Banco de dados: MongoDB 4.4.3

## Instalação e execução do MongoDB via Docker
```bash
# criando o container
docker run -d -p 27017:27017 -v /data/db --name mongo1 mongo:4.4.3-bionic

# executando o container
docker exec -it mongo1 bash
```

# Como executar o projeto

## Back end
Pré-requisitos: Java 17

```bash
# clonar repositório
git clone https://github.com/JuniorAC90/workshop-spring-boot-mongodb.git

# entrar na pasta do projeto 
cd workshop-spring-boot-mongodb

# executar o projeto
./mvnw spring-boot:run
```
## Rotas
Exemplos:

- GET - "/users" - Lista todas os clientes cadastrados 
- GET - "/users/{id}" - Lista o cliente de Id passado como parâmetro
  
![Clientes](https://github.com/JuniorAC90/workshop-spring-boot-mongodb/blob/main/assets/clientes.png)

- POST - "/users" - Cadastra um novo cliente.
- PUT - "/users/{id}" - Atualiza o cliente com o Id passado por parâmetro.
  
![Cadastro de Cliente](https://github.com/JuniorAC90/workshop-spring-boot-mongodb/blob/main/assets/json-cadastro-cliente.png)
  
- DELETE - "/users/{id}" - Deleta o cliente com o Id passado por parâmetro.


- GET - "/users/{id}/posts" - Lista os posts do cliente de Id passado como parâmetro
- GET - "/posts/{id}" - Lista os posts com o Id passado como parâmetro
- GET - "/posts/{id}/fullsearch?text=aproveite&minDate=2018-03-22&maxDate=2018-03-30" - Lista os posts do cliente de Id passado como parâmetro, que contenha o trecho "aproveite"(em posts ou comentários) e tenha sido postado dentro da faixa das datas enviadas na URL
- GET - "/posts/{id}//posts/titlesearch?text=aproveite" - Lista os posts com o nome do título que conhtenha a palavra "aproveite" passado como parâmetro
  
![Posts](https://github.com/JuniorAC90/workshop-spring-boot-mongodb/blob/main/assets/posts.png)

# Autor

Aloizio da Costa Junior

https://www.linkedin.com/in/JuniorAC90
