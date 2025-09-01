# Atividade-C14 - Informações Pokémon

### Alunos: Felipe Silva Loschi & Pedro Henrique Ribeiro Dias  
### Matrículas: 601 e 529  
### Cursos: GES e GES  

Atividade avaliativa C14

## 1. Descrição

O projeto se trata de uma espécie de chat bot em que o usuário poderá enviar nomes de Pokemons, questionando informações sobre os mesmos e,
a partir da integração com a Poke API, informações serão devolvidas. Esse projeto tem como objetivo criar, manipular e salvar informações de Pokémon em arquivos JSON, utilizando a biblioteca Gson para serialização e desserialização de objetos em Java.

Um projeto da disciplina de C14 do Inatel.

O projeto é desenvolvido em Java 21, com o auxílio do Maven para gerenciamento de dependências.

## 2. Clonando o Projeto Para Sua Máquina

Para contribuir neste projeto basta clicar no botão Fork localizado no canto superior direito desta página (web), e depois rodar no terminal:

``` bash
git clone https://github.com/<seu-usuario>/<nome-repositorio-forkado>.git
```

Depois, crie uma branch para trabalhar em uma nova feature:

```bash
git checkout -b <nome-da-feature>
```

Quando terminar, envie suas alterações:

```bash
git push origin <nome-da-feature>
```

## Dependências:
- Java 21

- Maven (para build e gerenciamento das bibliotecas)

A principal biblioteca utilizada é:

- Gson – para conversão de objetos Java em JSON e vice-versa.

## Como executar:
1. Compile o projeto usando o Maven:
```bash
mvn clean install
```

2. Rode o programa gerado no diretório target/:
```bash
java -jar target/AtividadeAvaliativaC14-1.0-SNAPSHOT.jar
```

## Estrutura do Projeto:

- App.java → Classe principal que inicializa o programa.

- Pokemon.java → Classe que define os atributos e métodos dos Pokémons.

- saida.json → Arquivo gerado pelo programa contendo os Pokémons criados em formato JSON.

## Resolvendo Conflitos

Durante merges, podem ocorrer conflitos entre arquivos. O ideal é resolvê-los localmente:

```bash
git checkout -b <nome-branch-resolvendo-conflito>
git clone <link-repositorio>
```

Edite os arquivos manualmente escolhendo a versão correta, depois:

```bash
git commit -m "resolvendo conflito"
git checkout <branch-que-houve-o-conflito>
git merge --no-ff <nome-branch-resolvendo-conflito>
git push origin <branch-que-houve-o-conflito>
```

## Exemplo de Saída em JSON

```json
{
  "nome": "Pikachu",
  "tipo": "Elétrico",
  "nivel": 25
}
```

---
⚡ Projeto acadêmico desenvolvido no Inatel para a disciplina C14.

---
