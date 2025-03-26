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

## Passos para Configuração

1. **Clone o repositório**:
   ```sh
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio
   
