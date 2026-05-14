# Controle de Gastos Java

Projeto simples feito em Java para registrar e consultar gastos pelo terminal.

O objetivo principal deste projeto é praticar os fundamentos da linguagem Java em um programa pequeno, direto e funcional.

## Funcionalidades

- Adicionar gastos com descricao e valor
- Listar todos os gastos cadastrados
- Ver o total gasto
- Ver a media dos gastos
- Ver o maior gasto cadastrado
- Encerrar o programa pelo menu

## Conceitos praticados

- `Scanner`
- `ArrayList`
- `String`
- `double`
- `do while`
- `switch`
- `if` e `else`
- `for`
- `printf`

## Exemplo do menu

```text
Bem vindo ao gestor de gastos
By: Cavz
1. Adicionar gasto.
2. Listar gastos.
3. Ver total gasto.
4. Ver media de gastos.
5. Ver maior gasto.
6. Sair.
Escolha uma opcao:
```

## Como executar

Compile o arquivo Java:

```bash
javac App.java
```

Execute o programa:

```bash
java App
```

## Estrutura inicial

O projeto usa duas listas principais:

```java
ArrayList<String> descricoes = new ArrayList<>();
ArrayList<Double> valores = new ArrayList<>();
```

A lista `descricoes` guarda o nome de cada gasto.

A lista `valores` guarda o valor de cada gasto.

As duas listas se relacionam pelo mesmo indice. Por exemplo:

```text
descricoes[0] -> Mercado
valores[0]    -> 120.50
```

## Melhorias futuras

- Remover um gasto cadastrado
- Editar um gasto
- Criar uma classe `Gasto`
- Separar o codigo em metodos
- Salvar os gastos em arquivo
- Criar categorias para os gastos

## Status

Versao inicial finalizada.
