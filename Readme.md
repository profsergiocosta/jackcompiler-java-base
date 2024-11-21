# Compilador para a Linguagem de Programação Jack

Este repositório contém o projeto de um **compilador para a linguagem de programação Jack**, desenvolvido como parte de um trabalho em grupo. O compilador foi implementado em **Java**, e abrange todas as etapas do processo de compilação, incluindo análise léxica, análise sintática, geração de código intermediário e tradução final.

## 📚 Sobre o Projeto

A linguagem **Jack** é uma linguagem de programação de alto nível educacional, utilizada como parte do curso de sistemas computacionais do livro *"The Elements of Computing Systems"* (também conhecido como o projeto NAND-to-Tetris). O objetivo do compilador é traduzir programas Jack para código intermediário (VM code) que pode ser executado na Máquina Virtual descrita no livro.

O projeto foi desenvolvido em equipe para aplicar conceitos fundamentais de compiladores, incluindo:
- Análise léxica e tokens.
- Análise sintática baseada em gramáticas contextuais.
- Construção de árvore sintática abstrata (AST).
- Geração de código intermediário.

---

## 🛠️ Funcionalidades

1. **Analisador Léxico:**
   - Tokeniza o código Jack, identificando palavras-chave, identificadores, símbolos e constantes.
   
2. **Analisador Sintático:**
   - Verifica a estrutura gramatical do código de entrada com base na gramática da linguagem Jack.
   - Gera uma **AST (Abstract Syntax Tree)** para representar o programa.

3. **Geração de Código Intermediário:**
   - Traduz a AST para **VM code**, um código intermediário que pode ser interpretado pela Máquina Virtual Hack.

4. **Suporte Completo à Linguagem Jack:**
   - Classes, métodos, funções, construtores.
   - Estruturas de controle: `if`, `else`, `while`.
   - Operações aritméticas e lógicas.
   - Manipulação de arrays e variáveis.

---

## 🚀 Como Executar

### Pré-requisitos
- **Java 11** ou superior instalado no sistema.
- Ambiente configurado para compilar e executar programas Java (ex.: IDE como IntelliJ ou Eclipse, ou apenas o terminal).

### Passos
1. Clone este repositório:
   ```bash
   git clone https://github.com/TonyMPCastro/jack-compiler.git

## ✒️ Autores

* **AMPC** - *ANTONIO MARCOS PATRICIO CASTRO* - [AMPC](https://github.com/TonyMPCastro)
* **ANTONIO FIALHO** - *ANTONIO FIALHO DA SILVA NETO* - [PERFIL](https://github.com/AntonioFialhoSN)
* **NILTON MANGUEIRA** - *NILTON MACIEL MANGUEIRA* - [PERFIL](https://github.com/e-Mangueira)
