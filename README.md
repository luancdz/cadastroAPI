# Projeto Spring Boot para Controle de Versão

## Pré-requisitos

- **Java 17**: Certifique-se de ter o Java 17 instalado na sua máquina.
- **Maven**: Necessário para gerenciar as dependências do projeto.
- **Podman ou Docker**: Necessário para subir o banco de dados MySQL.

## Configuração do Banco de Dados

Este projeto utiliza um banco de dados MySQL que será iniciado com Podman, Docker ou Docker Compose. A URL de conexão, usuário e senha são os seguintes:

- **URL**: `jdbc:mysql://localhost:3306/cadastro`
- **Usuário**: `admin`
- **Senha**: `admin`

## Flyway para Migracoes

Este projeto utiliza o Flyway para gerenciar migrações de banco de dados. As migrações estão localizadas no diretório src/main/resources/db/migration.

### Exemplo 

Crie um arquivo de migração no diretório src/main/resources/db/migration com o nome V1__create_pessoa_table.sql

Para cada versão, crie um arquivo de migração com o prefixo V seguido de um número, dois underlines e um nome descritivo.


## Passos para Configuração

1. **Clone o repositório**:
   ```sh
   git clone https://github.com/luancdz/cadastroAPI.git
   cd cadastroAPI
   
2. **Contruir o projeto**:
   ```sh
   mvn clean install
   ```
3. **Subir o Banco de Dados**:
   ```sh
   docker-compose up -d
   ```
   
4. **Iniciar a aplicação**:
   ```sh
   mav spring-boot:run
   ```

## Uso

Após seguir os passos acima, o projeto estará configurado e pronto para uso. Você pode acessar a aplicação em `http://localhost:8080`.

## Exemplos de Chamadas `curl`

### Obter Pessoa por Documento

Para obter informações de uma pessoa pelo documento, use a seguinte chamada `curl`:

```sh
curl --request GET \
  --url http://localhost:8080/pessoas/documento/12345678900 \
  --cookie JSESSIONID=0938F72562F36A8DB23DA2DB73FCCEED
```

### Explicação:

--request GET: Especifica que a requisição é do tipo GET.

--url http://localhost:8080/pessoas/documento/12345678900: URL da API para obter a pessoa pelo documento.

--cookie JSESSIONID=0938F72562F36A8DB23DA2DB73FCCEED: Inclui o cookie de sessão para autenticação.

### Criar Pessoa

Para criar uma nova pessoa, use a seguinte chamada `curl`:

```sh
curl --request POST \
  --url http://localhost:8080/pessoas \
  --header 'Content-Type: application/json' \
  --cookie JSESSIONID=0938F72562F36A8DB23DA2DB73FCCEED \
  --data '{
    "nome": "João",
    "sobrenome": "Silva",
    "telefone": "123456789",
    "documento": "12345678900",
    "email": "joao.silva@icloud.com"
}     
```





   
