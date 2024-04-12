package com.alpha.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.alpha.example.repository.DocumentRepository;

@Service
public class DocumentService {
	@Autowired
	private DocumentRepository documentRepository;
	@Autowired
	private CloudinaryService cloudinaryService;

	public String saveImage(String folderName, MultipartFile file) {
		return cloudinaryService.uploadFile(file, folderName);
	}
}
