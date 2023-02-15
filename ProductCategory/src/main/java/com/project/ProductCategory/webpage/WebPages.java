package com.project.ProductCategory.webpage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.ProductCategory.ProductController;
import com.project.ProductCategory.ProductDao;

@Controller
public class WebPages {
	@Autowired
	ProductController productDao;
	
	@RequestMapping("test")
	public String test() {
		return "test";
	}

	@RequestMapping("index")
	public String index () {
		return "index";
	}
	
	@RequestMapping("get")
	public ModelAndView demo() {
		List<Object[]> list = productDao.getAllProdData();
		ModelAndView modelAndView = new ModelAndView("get", "data", list);
		return modelAndView;
	}
	
	@RequestMapping("APICALL")
	public String added() {
		return "APICALL";
	}
}
