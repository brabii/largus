package com.largus.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ceci l'objet JSON FizzBuzz
 * 
 * @author rabii
 *
 */
public class FizzBuzzDto {

	@JsonProperty("firstVal")
	private int firstValue;
	@JsonProperty("secondVal")
	private int secondValue;
	@JsonProperty("limit")
	private int limit;
	@JsonProperty("firstStr")
	private String firstString;
	@JsonProperty("secondStr")
	private String secondString;

	public FizzBuzzDto() {
	}

	public FizzBuzzDto(int firstValue, int secondValue, int limit, String firstString, String secondString) {
		this.firstValue = firstValue;
		this.secondValue = secondValue;
		this.limit = limit;
		this.firstString = firstString;
		this.secondString = secondString;
	}

	public int getFirstValue() {
		return firstValue;
	}

	public void setFirstValue(int firstValue) {
		this.firstValue = firstValue;
	}

	public int getSecondValue() {
		return secondValue;
	}

	public void setSecondValue(int secondValue) {
		this.secondValue = secondValue;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public String getFirstString() {
		return firstString;
	}

	public void setFirstString(String firstString) {
		this.firstString = firstString;
	}

	public String getSecondString() {
		return secondString;
	}

	public void setSecondString(String secondString) {
		this.secondString = secondString;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstString == null) ? 0 : firstString.hashCode());
		result = prime * result + firstValue;
		result = prime * result + limit;
		result = prime * result + ((secondString == null) ? 0 : secondString.hashCode());
		result = prime * result + secondValue;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FizzBuzzDto other = (FizzBuzzDto) obj;
		if (firstString == null) {
			if (other.firstString != null)
				return false;
		} else if (!firstString.equals(other.firstString))
			return false;
		if (firstValue != other.firstValue)
			return false;
		if (limit != other.limit)
			return false;
		if (secondString == null) {
			if (other.secondString != null)
				return false;
		} else if (!secondString.equals(other.secondString))
			return false;
		if (secondValue != other.secondValue)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FizzBuzzDto [firstValue=" + firstValue + ", secondValue=" + secondValue + ", limit=" + limit
				+ ", firstString=" + firstString + ", secondString=" + secondString + "]";
	}

}
