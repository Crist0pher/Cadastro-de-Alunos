package com.cadastroAlunos.apirest.AlunoResource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastroAlunos.apirest.Models.Aluno;
import com.cadastroAlunos.apirest.repository.AlunoRepository;


@RestController
@RequestMapping(value="/api")
public class AlunoResource {

	@Autowired
	AlunoRepository alunoRepository;
		
		
	@GetMapping("/alunos")
	public List<Aluno> listaAlunos(){
		return alunoRepository.findAll();
	}
		
	@GetMapping("/alunos/{id}")
	public Aluno listaAluno(@PathVariable(value="id")long id) {
		return alunoRepository.findById(id);
		
	}
	
	@PostMapping("/alunos")
	public Aluno registraAluno(@RequestBody Aluno aluno) {
		return alunoRepository.save(aluno);
	
	}
	@DeleteMapping("/alunos/{id}")
	public String deletaAluno(@PathVariable(value="id")long id) {
		Aluno verificaAluno = listaAluno(id);
		if(verificaAluno == null) {
			return "Aluno não existe";
		}else {
		 alunoRepository.deleteById(id);
		 return "Alundo deletado";
		}
	}
	@PutMapping("/alunos")
	public Aluno atualizaAluno(@RequestBody Aluno aluno) {
		 return alunoRepository.save(aluno);
	}
}
