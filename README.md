# Spring Boot Java API

Projeto desenvolvido como parte do curso **“Curso mais didático e completo de Java e OO, UML, JDBC, JavaFX, Spring Boot, JPA, Hibernate, MySQL, MongoDB e muito mais”**, ministrado por **Nélio Alves na Udemy**.

Esta aplicação representa a etapa de desenvolvimento de uma API REST com Spring Boot, aplicando conceitos de orientação a objetos, modelo de domínio, persistência com JPA/Hibernate, camadas de serviço e repositório, tratamento de exceções e integração com banco de dados.

## Tecnologias

- Java 25
- Spring Boot 4.1.2
- Spring Web MVC
- Spring Data JPA
- Hibernate
- PostgreSQL
- H2 Database
- Maven

## Funcionalidades

- Consulta de usuários, categorias, produtos e pedidos
- Cadastro, atualização e exclusão de usuários
- Persistência de entidades relacionadas
- Mapeamento de relacionamentos com JPA
- Tratamento padronizado de erros da API
- Perfil de desenvolvimento com PostgreSQL
- Perfil de testes com banco H2 em memória

## Estrutura do projeto

```text
src/
├── main/
│   ├── java/com/cursoudemy/web/
│   │   ├── config/          # Configurações e carga inicial de dados
│   │   ├── entities/        # Entidades e enums do domínio
│   │   ├── repositories/    # Interfaces de acesso a dados
│   │   ├── resources/       # Controladores REST e tratamento de erros
│   │   └── services/        # Regras de negócio
│   └── resources/           # Configurações da aplicação
└── test/                    # Testes automatizados
```

## Pré-requisitos

- JDK 25 ou superior
- PostgreSQL instalado e em execução
- Maven, ou uso do Maven Wrapper incluído no projeto

## Configuração do banco

Por padrão, a aplicação utiliza o perfil `dev`:

```properties
spring.profiles.active=dev
```

Crie um banco PostgreSQL chamado `springboot_course` e ajuste as credenciais em:

```text
src/main/resources/application-dev.properties
```

O arquivo atualmente está configurado para:

```text
Host: localhost
Porta: 5432
Banco: springboot_course
Usuário: postgres
```

Altere a senha no arquivo de configuração conforme o seu ambiente. Não utilize credenciais reais versionadas no repositório.

## Executando o projeto

No Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

No Linux ou macOS:

```bash
./mvnw spring-boot:run
```

A API ficará disponível em:

```text
http://localhost:8080
```

## Endpoints principais

| Método | Endpoint | Descrição |
|---|---|---|
| GET | `/users` | Lista todos os usuários |
| GET | `/users/{id}` | Busca um usuário por ID |
| POST | `/users` | Cadastra um usuário |
| PUT | `/users/{id}` | Atualiza um usuário |
| DELETE | `/users/{id}` | Exclui um usuário |
| GET | `/categories` | Lista todas as categorias |
| GET | `/categories/{id}` | Busca uma categoria por ID |
| GET | `/products` | Lista todos os produtos |
| GET | `/products/{id}` | Busca um produto por ID |
| GET | `/orders` | Lista todos os pedidos |
| GET | `/orders/{id}` | Busca um pedido por ID |

## Executando os testes

Os testes utilizam o perfil `test` e o banco H2 em memória:

```powershell
.\mvnw.cmd test
```

## Objetivo educacional

Este repositório faz parte dos meus estudos práticos acompanhando o curso do **Nélio Alves**, servindo como exercício para consolidar a construção de APIs REST em Java e o uso de Spring Boot, JPA, Hibernate e bancos de dados relacionais.

