package com.graymatter.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.graymatter.dao.PostDao;
import com.graymatter.model.Employee;
import com.graymatter.model.Post;

@Service
public class PostService {

	private PostDao pdao;
	public List<Post> getAllPost(){
		return pdao.addPost(null);
		
	}
}
