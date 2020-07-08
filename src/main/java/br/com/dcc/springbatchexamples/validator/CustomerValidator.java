package br.com.dcc.springbatchexamples.validator;

import org.springframework.batch.item.validator.ValidationException;
import org.springframework.batch.item.validator.Validator;

import br.com.dcc.springbatchexamples.domain.Customer;

public class CustomerValidator implements Validator<Customer> {

	@Override
	public void validate(Customer value) throws ValidationException {
		if (value.getFirstName().startsWith("A")) {
			throw new ValidationException("First names that begin with A are invalid: " + value);
		}

	}

}
