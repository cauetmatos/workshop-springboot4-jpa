Workshop Spring Boot 3 + JPA
Este projeto é uma API REST desenvolvida durante um workshop para praticar o desenvolvimento com Java e o ecossistema Spring Boot. O foco principal é a persistência de dados utilizando JPA/Hibernate e o gerenciamento de usuários.

🚀 Tecnologias Utilizadas
Java 17/21 (conforme configurado no ambiente).

Spring Boot 3.

JPA / Hibernate para mapeamento objeto-relacional.

H2 Database: Banco de dados em memória para testes e desenvolvimento.

Maven: Gerenciador de dependências.

Git/GitHub: Controle de versão e hospedagem.

📦 Funcionalidades Implementadas
Modelo de Domínio: Criação da entidade User com atributos como id, name, email, phone e password.

Persistência de Dados: Configuração completa do banco de dados H2 e mapeamento das entidades.

Estrutura de Camadas: Organização do projeto em pacotes como entities, repositories e config.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

🛠️ Como Executar o Projeto
Para rodar este projeto localmente, siga os passos abaixo:

Clone o repositório:

Bash

git clone https://github.com/cauetmatos/workshop-springboot3-jpa.git
Entre na pasta do projeto:

Bash

cd course
Execute a aplicação: Você pode rodar através da sua IDE (IntelliJ, NetBeans ou Eclipse) ou via terminal com o Maven:

Bash

./mvnw spring-boot:run
Acesse o Console do H2: Com a aplicação rodando, acesse http://localhost:8080/h2-console para visualizar o banco de dados.

📝 Histórico de Commits
O projeto segue um fluxo de versionamento organizado, incluindo:

Configuração da estrutura do projeto.

Criação da entidade User e integração com banco de dados H2.

Desenvolvido por: Cauet de Souza.
