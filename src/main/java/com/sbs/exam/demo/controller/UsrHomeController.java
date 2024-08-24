package com.sbs.exam.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Controller
public class UsrHomeController {
	private int count;
	public UsrHomeController() {
		count =-1;		
	}
		
	@RequestMapping("/usr/home/getCount")
	@ResponseBody
	public int getCount() {		
		return count;
	}
	
	@RequestMapping("/usr/home/doSetCount")
	@ResponseBody
	public String doSetCount(int count) {
		this.count = count;
		return "Count의 값이 " + this.count + "으로  초기화 되었습니다." ;
	}
	
	@RequestMapping("/usr/home/getMap")
	@ResponseBody
	public Map getMap() {
		Map<String, Object> map = new HashMap<>();
		map.put("철수나이", 22);
		map.put("영희나이", 21);
		map.put("순신나이", 23);
		return map;
	}
	@RequestMapping("/usr/home/getList")
	@ResponseBody
	public List<String> getList() {
		List<String>  list = new ArrayList<>();
		list.add("철수나이");
		list.add("영희나이");
		list.add("순신나이");
		return list;
	}
	
	@RequestMapping("/usr/home/getArticle")
	@ResponseBody
	public Article getArticle() {
		Article article  = new Article(1,"제목1");		
		return article;
	}
	
	@RequestMapping("/usr/home/getArticles")   //{} 객체 or map / array, list []
	@ResponseBody
	public List<Article> getArticles() {
		Article article1  = new Article(1,"제목1");		
		Article article2  = new Article(2,"제목2");		
		
		List<Article>  list = new ArrayList<>();
		list.add(article1);
		list.add(article2);
		return list;
	}
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Article {
	private int id;
	private String title;	
}
