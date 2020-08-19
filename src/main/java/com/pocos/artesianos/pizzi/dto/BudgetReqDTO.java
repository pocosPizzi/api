/**
 * 
 */
package com.pocos.artesianos.pizzi.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @author cleomar
 *
 */
@Data
@Builder
public class BudgetReqDTO {
	private String name;
	private String email;
	private String phone;
	private String message;
}
