package com.laptrinhjavaweb.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "homeControllerOfAdmin")
public class HomeController {

	@RequestMapping(value = "/admin/building", method = RequestMethod.GET)
	public ModelAndView buildingList() {
		ModelAndView mav = new ModelAndView("admin/building/list");
		return mav;
	}
	//tao 2 hàm
	@RequestMapping(value = "/admin/building-edit", method = RequestMethod.GET)
	public ModelAndView buildingEdit() {
		ModelAndView mav = new ModelAndView("admin/building/edit");
		return mav;
	}
	// vi springsecurity no phan biet thong qua URL nen phai tach ra 2 ham
	@RequestMapping(value = "/admin/building-edit-{id}", method = RequestMethod.GET)
	public ModelAndView buildingEdit(@PathVariable(value = "id") Long id) {
		ModelAndView mav = new ModelAndView("admin/building/edit");
		return mav;
	}
}
