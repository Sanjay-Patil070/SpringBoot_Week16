/*package com.GL.Library.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GL.Library.entity.Library;
import com.GL.Library.repository.LibraryRepository;

@Service
public class GetAllLibraryWithNoBooks {
	@Autowired
	LibraryRepository readRepository;

	public List<Library> getAllLibrary() {
		return readRepository.findAll();
	}
	public void getAllLibrariesWithNoBooks() {
		Library librarywithNoBooks =new Library();
		librarywithNoBooks.setCommaSeparatedBookNames("");
		System.out.println("just to show you how this object will look like"+librarywithNoBooks);
	}
}*/
