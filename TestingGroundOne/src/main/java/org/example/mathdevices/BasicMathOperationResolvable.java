package org.example.mathdevices;

import org.example.mathdevices.exceptions.DivideByZeroError;

// TODO refactor name
public interface BasicMathOperationResolvable {

    Float addValue(Float valueToAdd);
    Float substractValue(Float valueToSubstract);
    Float multiplyBy(Float multiplier);
    Float divideBy(Float divider);
}
