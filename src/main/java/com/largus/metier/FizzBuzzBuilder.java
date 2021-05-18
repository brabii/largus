package com.largus.metier;

import com.largus.dto.FizzBuzzDto;

/**
 * implémentation de design pattern builder pour builder un objet FizzBuzzDto
 * 
 * @author rabii
 *
 */
public class FizzBuzzBuilder {
	private int firstVal;
	private int secondVal;
	private int limit;
	private String firstString;
	private String secondString;

	public FizzBuzzBuilder(int firstVal, int secondVal, int limit, String firstString, String secondString) {
		this.firstVal = firstVal;
		this.secondVal = secondVal;
		this.limit = limit;
		this.firstString = firstString;
		this.secondString = secondString;
	}

	/**
	 * @param firstVal the firstVal to set
	 */
	public FizzBuzzBuilder setFirstVal(int firstVal) {
		this.firstVal = firstVal;
		return this;
	}

	/**
	 * @param secondVal the secondVal to set
	 */
	public FizzBuzzBuilder setSecondVal(int secondVal) {
		this.secondVal = secondVal;
		return this;
	}

	/**
	 * @param limit the limit to set
	 */
	public FizzBuzzBuilder setLimit(int limit) {
		this.limit = limit;
		return this;
	}

	/**
	 * @param firstString the firstString to set
	 */
	public FizzBuzzBuilder setFirstString(String firstString) {
		this.firstString = firstString;
		return this;
	}

	/**
	 * @param secondString the secondString to set
	 */
	public FizzBuzzBuilder setSecondString(String secondString) {
		this.secondString = secondString;
		return this;
	}

	public FizzBuzzDto build() {
		return new FizzBuzzDto(firstVal, secondVal, limit, firstString, secondString);
	}

}
