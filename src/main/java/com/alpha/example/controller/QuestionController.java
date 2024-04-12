package com.alpha.example.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.example.dto.QuestionDto;
import com.alpha.example.entity.Question;
import com.alpha.example.repository.QuestionRepository;
import com.alpha.example.service.DocumentService;

@RestController
@RequestMapping("/api/{version}/questions")
public class QuestionController {
	@Autowired
	private QuestionRepository questionRepository;
	@Autowired
	private DocumentService documentService;

	@PostMapping
	public Question saveCkEditorFile(@ModelAttribute QuestionDto model) {
		Question question = new Question();
		question.setDescription(model.getDescription());
		question.setExaples(model.getExaples());
		try {
			question.setFile(model.getFile().getBytes());
			System.err.println(documentService.saveImage("HTML", model.getFile()));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return questionRepository.save(question);
	}
}
