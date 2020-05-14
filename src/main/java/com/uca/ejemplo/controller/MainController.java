package com.uca.ejemplo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.ejemplo.dao.EstudianteDAO;
import com.uca.ejemplo.domain.Estudiante;

@Controller
public class MainController {
	@Autowired
	private EstudianteDAO estudianteDAO;
	
	
	@RequestMapping("/inicio")
	public ModelAndView initInicio() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("estudiante", new Estudiante());
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping("/insertar")
	public ModelAndView insertar(@Valid @ModelAttribute Estudiante est, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) {
			//
			mav.setViewName("index");
			
			
		}else {
			try {
				estudianteDAO.insert(est);
			} catch(Exception e ) {
				e.printStackTrace();
				}
			mav.addObject("estudiante", new Estudiante());
			}
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping("/listado")
	public ModelAndView mostrar() {
		ModelAndView mav = new ModelAndView();
		List<Estudiante> estudiantes = null;
		try {
			estudiantes = estudianteDAO.findAll();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		mav.addObject("estudiantes", estudiantes);
		mav.setViewName("listado");
		return mav;
	}
	


}
