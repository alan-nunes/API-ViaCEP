# Consulta de Endereço por CEP

Este projeto foi desenvolvido como parte de um desafio, com o objetivo de criar uma aplicação que consulta um endereço a partir de um CEP e salva as informações em um arquivo JSON.

## Objetivos do Projeto

1. **Classe de Endereço:**
   - Criar uma classe que representa um endereço com os seguintes atributos:
     - cep
     - uf
     - cidade
     - bairro
     - logradouro
     - complemento

2. **Consulta à API ViaCEP:**
   - Criar uma classe que consulta a API ViaCEP para buscar um endereço a partir de um CEP.
   - Exemplo de URL da API: `https://viacep.com.br/ws/04101300/json`.

3. **Salvar Dados em Arquivo JSON:**
   - Criar uma classe que cria um arquivo JSON contendo os dados de um objeto `Endereco`.
   - O arquivo deve ter como nome o CEP informado (exemplo: `04101300.json`).

4. **Interação com o Usuário:**
   - Criar uma classe com o método `main` que deve solicitar ao usuário que informe um CEP.
   - Utilizar as classes desenvolvidas para consultar a API ViaCEP e salvar os dados do endereço em um arquivo JSON.

## Tecnologias Utilizadas

- Java
- Biblioteca para manipulação de JSON: Gson
- Biblioteca para solicitações HTTP: HttpClient / OkHttp
- IDE: IntelliJ IDEA / Eclipse

## Estrutura do Projeto

1. **Classe Endereco**
   ```java
   public class Endereco {
       private String cep;
       private String uf;
       private String cidade;
       private String bairro;
       private String logradouro;
       private String complemento;

       // Getters e Setters
   }
