/**
 * 
 */
package com.ecommerce.model;

/**
 * @author Guruprasad.Todur
 *
 */
public class JwtResponse {
	private final String jwttoken;

	public JwtResponse(String jwttoken) {
		this.jwttoken = jwttoken;
	}

	public String getToken() {
		return this.jwttoken;
	}
}
