package com.graymatter;

import com.graymatter.dao.PostDao;
import com.graymatter.model.Post;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostDao pd= new PostDao();
		pd.addPost(new Post(2,"kashmir","The destination for many","naman"));
}

}
