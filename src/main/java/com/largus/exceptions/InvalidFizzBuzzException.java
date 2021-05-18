package com.largus.exceptions;

/**
 * une exception personalisée, pour un objet FizzBuzz invalide
 * 
 * @author rabii
 *
 */
public class InvalidFizzBuzzException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidFizzBuzzException(String message) {
		super(message);
	}
}
