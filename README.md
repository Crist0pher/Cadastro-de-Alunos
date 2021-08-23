# Cadastro-de-Alunos
API REST desenvolvida em Spring Boot e Mysql.


Acesso as funções da API

Include:
Method:Post
Url: http://localhost:8080/api/alunos
JSON: 

{ 

    "nomeCompleto": "Aluno da Silva",
    "primeiroNome": "Nome",
    "email": "aluno@aluno.com",
    "sexo": "M" ou  "F",
    "cpf": "000.000.000-00",
    "matricula": "000000",
    "date": "01/01/1990,
    "telefone1": "00000-0000"

}

*****************************************************

ListAll

Method:Get
Url: http://localhost:8080/api/alunos
Retorno: Uma lista Json com o formato abaixo:
[
  { 

    "nomeCompleto": "Aluno da Silva",
    "primeiroNome": "Nome",
    "email": "aluno@aluno.com",
    "sexo": "M" ou  "F",
    "cpf": "000.000.000-00",
    "matricula": "000000",
    "date": "01/01/1990,
    "telefone1": "00000-0000"

},
{ 

    "nomeCompleto": "Aluno da Silva",
    "primeiroNome": "Nome",
    "email": "aluno@aluno.com",
    "sexo": "M" ou  "F",
    "cpf": "000.000.000-00",
    "matricula": "000000",
    "date": "01/01/1990,
    "telefone1": "00000-0000"
  }
]

*****************************************************

Update

Method:Put
Url: http://localhost:8080/api/alunos
Enviar um JSON com o preenchendo dessa vez o campo "alunoId" para identificar o registro a ser alterado.

{ 
    "alunoId": 1,
    "nomeCompleto": "Aluno da Silva",
    "primeiroNome": "Nome",
    "email": "aluno@aluno.com",
    "sexo": "M" ou  "F",
    "cpf": "000.000.000-00",
    "matricula": "000000",
    "date": "01/01/1990,
    "telefone1": "00000-0000"
  }

*****************************************************

Delete

Method: Delete
Enviar a requisição para a URL abaixo, substituido o {idAluno} pelo número do ID do Aluno.
http://localhost:8080/api/alunos/{idAluno}
Retorno: Mensagem confirmando a exclusão ou informando que o Id é inválido. 
