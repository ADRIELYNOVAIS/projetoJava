# Projeto_Java

Objetivo do sistema: Desenvolver um sistema em Java para controlar o acervo de livros e empréstimos de livros aos alunos de uma biblioteca. O sistema deverá cadastrar os livros, registrar os empréstimos e ter a situação dos empréstimos.

RQN1- Cadastro dos livros. 
RFU1.1- Deve ser possível incluir, visualizar, alterar e excluir um livro no acervo da biblioteca. O livro possui um título, autor, código para identificação, edição e número de páginas. 
RFU1.2- Cada livro possui um ou mais autores e cada autor tem um cadastro prévio ou pode ser adicionado de acordo com o livro que for cadastrado na biblioteca. Um livro pode possuir ou não uma editora, mas se possuir, a editora será cadastrada na informação do livro. 
RGN1.1.1- Pode ser possível pesquisar um livro, um autor ou uma editora a partir do título do livro, do nome do autor ou do nome da editora. 

RQN2- Cadastro dos empréstimos. 
RFU2.1- Deve ser possível incluir, visualizar, alterar e excluir um empréstimo de um livro. No empréstimo de um livro deve conter as informações do livro tais como o título do livro e o código, edição, editora, o estado do livro: se está emprestado ou não, o nome, a matrícula e a turma do aluno para o qual foi feito o empréstimo, a data do empréstimo e a data de devolução. 
RGN2.1.1- Um aluno deve pegar apenas um livro por vez. 
RGN2.1.2- O aluno poderá renovar a data de devolução apenas uma vez. 

RQN3- Cadastro de alunos. 
RFU3.1- O Deve ser possível incluir, visualizar, alterar e excluir um aluno no cadastro da biblioteca. E para realizar o cadastro de um aluno, o aluno deve informar o seu nome completo, CPF, fone, data de nascimento, e-mail, endereço, turma, número de matrícula e senha. 
RGN3.1.1- Deve ser possível pesquisar um aluno através do seu nome ou de sua turma. 
RFU3.2.1- A O vínculo do aluno com a turma será feito a partir do número de matrícula, pois assim não precisará renovar o cadastro dele na biblioteca
