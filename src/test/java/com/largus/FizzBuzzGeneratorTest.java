package com.largus;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.largus.dto.FizzBuzzDto;
import com.largus.exceptions.InvalidFizzBuzzException;
import com.largus.metier.FizzBuzzBuilder;
import com.largus.services.FizzBuzzService;

/**
 * ceci la class qui imlémente l'ensemble des test
 * 
 * @author rabii
 *
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class FizzBuzzGeneratorTest {
	@Autowired
	private FizzBuzzService fizzBuzzService;

	/**
	 * c'est le test fourni dans l'enoncé de l'exercice
	 * 
	 * @throws Exception
	 */
	@Test
	public void testerJeuDonneeFournies() throws Exception {
		int firstValue = 3;
		int secondValue = 5;
		int limit = 10; // pour optimiser j'utilise 10 à la place de 100
		String firstString = "fizz";
		String secondString = "buzz";
		List<String> expectedList = Arrays.asList("1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz");
		FizzBuzzDto dto = new FizzBuzzBuilder(firstValue, secondValue, limit, firstString, secondString).build();

		assertTrue(expectedList.equals(fizzBuzzService.getFizzBuzzListFromDto(dto)));
	}

	/**
	 * tester si un dto n'est pas valide
	 * 
	 * @throws Exception
	 */
	@Test
	public void testerDtoNonValide() throws Exception {
		int firstValue = 23; // on ne pourras pas avoir le firstValue > limit
		int secondValue = 5;
		int limit = 10;
		String firstString = "fizz";
		String secondString = "buzz";
		FizzBuzzDto dto = new FizzBuzzBuilder(firstValue, secondValue, limit, firstString, secondString).build();
		
		Exception exception = assertThrows(InvalidFizzBuzzException.class, () -> {
			fizzBuzzService.getFizzBuzzListFromDto(dto);
		});
		
		String expectedMsg = "l'objet n'est pas valide!";
		String actualMsg = exception.getMessage();
		assertTrue(expectedMsg.equals(actualMsg));

	}
}
