package com.largus.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.largus.dto.FizzBuzzDto;
import com.largus.exceptions.InvalidFizzBuzzException;
import com.largus.metier.FizzBuzzBuilder;
import com.largus.metier.FizzBuzzValidator;
import com.largus.services.FizzBuzzService;

/**
 * 
 * @author rabii
 *
 */
@RestController
@RequestMapping("api/v1")
public class FizzBuzzController {
	private static final Logger LOGGER = LoggerFactory.getLogger(FizzBuzzController.class);

	private final FizzBuzzService fizzBuzzService;

	@Autowired
	public FizzBuzzController(FizzBuzzService fizzBuzzService) {
		this.fizzBuzzService = fizzBuzzService;
		LOGGER.info("fizzbuzzcontroller bean crée");
	}

	/**
	 * ceci est la premier méthode
	 * 
	 * @param firstValue
	 * @param secondValue
	 * @param limit
	 * @param firstString
	 * @param secondString
	 * @return une liste fizzBuzz
	 * @throws InvalidFizzBuzzException
	 */
	@GetMapping(path = "/fizzbuzz", produces = "application/json")
	public ResponseEntity<List<String>> getListFizzBuzzWithGet(@RequestParam(name = "firstVal") Integer firstValue,
			@RequestParam(name = "secondVal") Integer secondValue, @RequestParam(name = "limit") Integer limit,
			@RequestParam(name = "firstStr") String firstString, @RequestParam(name = "secondStr") String secondString)
			throws InvalidFizzBuzzException {

		FizzBuzzDto dto = new FizzBuzzBuilder(firstValue, secondValue, limit, firstString, secondString).build();

		LOGGER.debug("l'objet dto est : " + dto);

		return new ResponseEntity<List<String>>(this.fizzBuzzService.getFizzBuzzListFromDto(dto), HttpStatus.OK);
	}

	/**
	 * une deuxieme méthode
	 * 
	 * @param dto
	 * @return une liste fizzbuzz
	 * @throws InvalidFizzBuzzException
	 */
	@PostMapping(path = "/fizzbuzz", consumes = "application/json", produces = "application/json")
	public ResponseEntity<List<String>> getListFizzBuzzWithPost(@RequestBody FizzBuzzDto dto)
			throws InvalidFizzBuzzException {
		if (!FizzBuzzValidator.isFizzBuzzObjectIsValid(dto)) {
			throw new InvalidFizzBuzzException(String.format("l'objet json %s n'est pas valide", dto));
		}

		LOGGER.debug("l'objet dto est : " + dto);

		return new ResponseEntity<List<String>>(this.fizzBuzzService.getFizzBuzzListFromDto(dto), HttpStatus.OK);
	}
}
