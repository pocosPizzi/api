/**
 * 
 */
package com.pocos.artesianos.pizzi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cleomar
 *
 */
@RestController
@RequestMapping("api/up")
public class UpController {

	@GetMapping
	public String up() {
		return "up";
	}
}
