package com.largus.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.largus.dto.FizzBuzzDto;
import com.largus.exceptions.InvalidFizzBuzzException;
import com.largus.metier.FizzBuzzGenerator;

@Service
public class FizzBuzzServiceImpl implements FizzBuzzService {

	private FizzBuzzGenerator fizzBuzzGen;

	public FizzBuzzServiceImpl() {
	}

	@Autowired
	public FizzBuzzServiceImpl(FizzBuzzGenerator fizzBuzzGen) {
		this.fizzBuzzGen = fizzBuzzGen;
	}

	@Override
	public List<String> getFizzBuzzListFromDto(FizzBuzzDto dto) throws InvalidFizzBuzzException {
		return fizzBuzzGen.generate(dto);
	}

}
