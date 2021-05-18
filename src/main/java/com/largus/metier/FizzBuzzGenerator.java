package com.largus.metier;

import java.util.List;

import com.largus.dto.FizzBuzzDto;
import com.largus.exceptions.InvalidFizzBuzzException;

/**
 * ceci permet de génerer une liste à partir d'un objet JSON FizzBuzz
 * 
 * @author rabii
 *
 */
public interface FizzBuzzGenerator {

	/**
	 * dans l'énoncé de test, cette méthode prend 5 params, dans mon cas j'ai
	 * regroupé tous ses params dans un seul objet FizzBuzzPOJO
	 * 
	 * @param fiBuzz
	 * @return liste de string
	 * @throws InvalidFizzBuzzException
	 */
	public List<String> generate(FizzBuzzDto fiBuzz) throws InvalidFizzBuzzException;
}
