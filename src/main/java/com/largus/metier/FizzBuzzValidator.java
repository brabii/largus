package com.largus.metier;

import com.largus.dto.FizzBuzzDto;

/**
 * une classe qui permet de valider un objet fizzBuzz
 * 
 * un fizzBuzz valide si:
 *  + fizzBuzz n'est pas null 
 *  + 1 <= firstValue <=secondValue<=limit 
 *  + firstString et secondString ne sont pas null
 * 
 * @author rabii
 *
 */
public class FizzBuzzValidator {

	/**
	 * une méthode simple de classe qui permet de verifier si on objet dto est
	 * valide
	 * 
	 * @param dto
	 * @return boolean
	 */
	public static boolean isFizzBuzzObjectIsValid(FizzBuzzDto dto) {
		if (dto == null || dto.getFirstValue() < 1 || dto.getFirstValue() > dto.getLimit() || dto.getSecondValue() < 1
				|| dto.getSecondValue() > dto.getLimit() || dto.getFirstString() == null
				|| dto.getSecondString() == null) {
			return false;
		}
		return true;
	}
}
