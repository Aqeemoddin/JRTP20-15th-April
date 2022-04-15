package com.example.demo.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Model.ModelDemo;

@Controller
public class ControlerTest {
	
	@GetMapping("/test")
	public ModelAndView view1()
	{
		ModelAndView mv=new ModelAndView();
		System.out.println("in for controler");
		mv.addObject("product", new ModelDemo());
		
		mv.setViewName("NewFile");
		return mv;
	}

	@PostMapping("/test")
	public ModelAndView view2(ModelDemo product)
	{
		ModelAndView mv= new ModelAndView();
		System.out.println(product);
		mv.addObject("msg", "Record Inserted Succeefully!!!!!!!");
		mv.addObject("product", new ModelDemo());
		mv.setViewName("success");
		
		return mv;
	}
}
