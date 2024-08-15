package com.graymatter.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.graymatter.model.Post;

@Component

public class PostDao {
	
@Autowired
public JdbcTemplate jdbcTemplate;

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate=jdbcTemplate;
}

//crud operations

//insert a blogPost

public int addPost(Post p) {
	String query="Insert into blogPost values("+p.getId()+",'"+p.getTitle()+"','"+p.getContent()+"','"+p.getAuthor()+"');";
	return jdbcTemplate.update(query);
}

//updating a blogPost
public int updatePost(Post p) {
	String query= "update blogPost set content= "+p.getContent()+"where id = "+p.getTitle()+");";
	return jdbcTemplate.update(query);
} 

//get all post
public List<Post> getAllPost(){
	String query= "Select * from blogPost";
	List<Post> postList= jdbcTemplate.query(query, new PostRowMapper());
	return postList;
}

}
