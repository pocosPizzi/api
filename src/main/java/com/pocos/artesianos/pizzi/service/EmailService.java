/**
 * 
 */
package com.pocos.artesianos.pizzi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.pocos.artesianos.pizzi.dto.BudgetReqDTO;

/**
 * @author cleomar
 *
 */
@Service
public class EmailService {
	@Autowired 
	private JavaMailSender mailSender;
	
	public String sendEmail(BudgetReqDTO dto) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setSubject("Você tem um novo orçamento para avaliar de: "
				.concat(dto.getName()+"."));
				
        message.setText("Menssage: ".concat(dto.getMessage()));
        message.setText("Email :".concat(dto.getEmail()));
        message.setText("Telefone :".concat(dto.getPhone()));
        message.setTo("pocosartesianospizzi@gmail.com");
        message.setFrom("pocosartesianospizzi@gmail.com");

        try {
            mailSender.send(message);
            return "Email enviado com sucesso!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao enviar email.";
        }
	}
}
