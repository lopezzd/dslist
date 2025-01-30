## 🏆 DSlist - Gerenciamento de Listas de Carros

Este projeto é uma API REST desenvolvida em Java com Spring Boot para gerenciar listas de carros, iniciado com intensivo DevSuperior ->  [Link do Projeto](https://github.com/devsuperior/dslist-backend). O projeto permite listar carros, organizar listas e recuperar informações detalhadas dos veículos.

### 🚀 Tecnologias Utilizadas
- Java 23 (Não LTS)
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 | Banco de Dados H2 (MySQL e/ou PostgreSQL não implantados)
- Maven

### 💂️ Estrutura do Projeto
```
src
 ├── main
 │   ├── java
 │   │   └── com.example.dlsit
 │   │       ├── controllers  # Camada de controle (API REST)
 │   │       ├── dto          # Objetos de Transferência de Dados
 │   │       ├── entities     # Entidades JPA
 │   │       ├── projections  # Projeções de banco de dados
 │   │       ├── repositories # Repositórios para acesso ao banco
 │   │       └── services     # Camada de serviços
```

### 📌 Endpoints Principais
#### 🔹 Listar todas os carros
```
GET /carros
```
#### 🔹 Listar carro com ID
```
GET /carros/{id}
```
#### 🔹 Obter uma lista de carros
```
GET /listas/carros
```
#### 🔹 Obter uma lista de carros por ID
```
GET /listas/{listId}/carros
```

### 🛠️ Como Rodar o Projeto
1. Clone este repositório:
   ```sh
   git clone https://github.com/lopezzd/dslit.git
   cd dslit
   ```
2. Instale as dependências:
   ```sh
   mvn clean install
   ```
3. Execute a aplicação:
   ```sh
   mvn spring-boot:run
   ```
4. Acesse a API via:
   ```
   http://localhost:8080
   ```

### 🐝 Licença
Este projeto está sob a licença MIT.

