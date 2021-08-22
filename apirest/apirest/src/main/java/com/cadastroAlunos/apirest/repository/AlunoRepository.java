package com.cadastroAlunos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastroAlunos.apirest.Models.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno,Long>{

	Aluno findById(long id);
		
	
	
}
