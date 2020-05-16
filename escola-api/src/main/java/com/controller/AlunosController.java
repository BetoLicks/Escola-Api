package com.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.Alunos;
import com.repository.AlunosRepository;

@RestController
@RequestMapping("/api")
public class AlunosController {

	@Autowired
	private AlunosRepository alunosRep;
	
	@RequestMapping(value = "/lista", method = RequestMethod.GET)
	public List<Alunos> listaAlunos(){
		return alunosRep.findAll();
	}
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public Alunos salvaAluno(@Valid @RequestBody Alunos aluno) {
		return alunosRep.save(aluno);
	}	
	
	
	
	
}
