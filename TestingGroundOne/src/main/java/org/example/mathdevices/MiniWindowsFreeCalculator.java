package org.example.mathdevices;

import org.example.mathdevices.AbstractCalculator;
import org.example.mathdevices.BasicMathOperationResolvable;
import org.example.mathdevices.exceptions.DivideByZeroError;

public class MiniWindowsFreeCalculator extends AbstractCalculator implements BasicMathOperationResolvable {

    public MiniWindowsFreeCalculator() { };
    public MiniWindowsFreeCalculator(Float initialValue) {this.storedValue = initialValue;};

    @Override
    public Float addValue(Float valueToAdd) {
        return this.storedValue += valueToAdd;
    }

    @Override
    public Float substractValue(Float valueToSubstract) {
        return this.storedValue -= valueToSubstract;
    }

    @Override
    public Float multiplyBy(Float multiplier) {
        return this.storedValue *= multiplier;
    }

    @Override
    public Float divideBy(Float divider) {
        if (divider == 0)
            hasError = true;
            //throw new DivideByZeroError("Can not divide by zero!");
        return this.storedValue /= divider;
    }
}
