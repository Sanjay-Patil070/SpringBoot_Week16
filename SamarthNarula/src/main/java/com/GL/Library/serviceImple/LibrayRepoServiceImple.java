package com.GL.Library.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GL.Library.entity.Library;
import com.GL.Library.repository.LibraryRepository;

@Service
public class LibrayRepoServiceImple {
	@Autowired
	LibraryRepository readRepository;

	public List<Library> getAllLibrary() {
		return readRepository.findAll();
	}
}
