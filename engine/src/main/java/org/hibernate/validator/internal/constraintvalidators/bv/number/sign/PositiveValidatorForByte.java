/*
 * Hibernate Validator, declare and validate application constraints
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
package org.hibernate.validator.internal.constraintvalidators.bv.number.sign;

/**
 * Check that the number being validated is positive.
 *
 * @author Hardy Ferentschik
 * @author Xavier Sosnovsky
 * @author Guillaume Smet
 * @author Marko Bekhta
 */
public class PositiveValidatorForByte extends AbstractPositiveValidator<Byte> {

	@Override
	protected int compare(Byte number) {
		return NumberSignHelper.signum( number );
	}
}
