package com.jxtpro.controller.blog;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;
import com.jxtpro.model.Blog;
import com.jxtpro.service.blog.BlogService;

public class BlogController extends Controller{

	public void index(){
		Page<Blog> blogPage = BlogService.paginate(getParaToInt(0, 1), 3);	
		setAttr("blogPage", blogPage);
		render("blog.jsp");
	}
	
	public void add(){
		
	}
	
	public void save(){
		Blog blog = this.getModel(Blog.class);
		BlogService.me.save(blog);
		forwardAction("/blog");
	}
	
	public void edit(){
		setAttr("blog", BlogService.me.findById(getParaToInt()));
	}
	
	public void view(){
		setAttr("blog",Blog.dao.findById(getParaToInt()));
	}
	
	public void update(){
		Blog blog = this.getModel(Blog.class);
		BlogService.me.update(blog);
		forwardAction("/blog");
	}
	public void delete(){
		BlogService.me.deleteById(getParaToInt());
		forwardAction("/blog");
	}
}
