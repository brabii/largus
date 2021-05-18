package com.largus.services;

import java.util.List;

import com.largus.dto.FizzBuzzDto;
import com.largus.exceptions.InvalidFizzBuzzException;

/**
 * le service qui va interoger la couche métier
 * 
 * @author rabii
 *
 */

public interface FizzBuzzService {

	public List<String> getFizzBuzzListFromDto(FizzBuzzDto dto) throws InvalidFizzBuzzException;

}
