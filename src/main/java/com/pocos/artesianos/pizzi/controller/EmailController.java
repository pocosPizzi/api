/**
 * 
 */
package com.pocos.artesianos.pizzi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pocos.artesianos.pizzi.dto.BudgetReqDTO;
import com.pocos.artesianos.pizzi.service.EmailService;

/**
 * @author cleomar
 *
 */
@RestController
@RequestMapping("api/email")
public class EmailController {
	@Autowired
	private EmailService service;
	
	@PostMapping
	public String sendEmail(@RequestBody BudgetReqDTO dto){
		return service.sendEmail(dto);
		}
}
