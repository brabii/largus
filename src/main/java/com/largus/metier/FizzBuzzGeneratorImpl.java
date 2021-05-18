package com.largus.metier;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

import com.largus.dto.FizzBuzzDto;
import com.largus.exceptions.InvalidFizzBuzzException;

/**
 * l'implémentation de l'interface FizzBuzzGenerator
 * 
 * @author rabii
 *
 */
@Component
public class FizzBuzzGeneratorImpl implements FizzBuzzGenerator {

	@Override
	public List<String> generate(FizzBuzzDto fiBuzz) throws InvalidFizzBuzzException {
		/**
		 * test si fiBuzz est valide
		 */
		if (!FizzBuzzValidator.isFizzBuzzObjectIsValid(fiBuzz)) {
			throw new InvalidFizzBuzzException(String.format("l'objet n'est pas valide!", fiBuzz));
		}
		List<String> fizzBuzzList = new ArrayList<>();

		int firstValue = fiBuzz.getFirstValue();
		int secondValue = fiBuzz.getSecondValue();
		int limit = fiBuzz.getLimit();
		String firstString = fiBuzz.getFirstString();
		String secondString = fiBuzz.getSecondString();

		Stream.iterate(1, n -> n + 1).limit(limit).forEach(item -> {
			if ((item % firstValue == 0) && (item % secondValue == 0)) {
				fizzBuzzList.add(firstString + secondString);
			} else if (item % firstValue == 0) {
				fizzBuzzList.add(firstString);
			} else if (item % secondValue == 0) {
				fizzBuzzList.add(secondString);
			} else {
				fizzBuzzList.add(String.valueOf(item));
			}
		});

		return fizzBuzzList;
	}

}
