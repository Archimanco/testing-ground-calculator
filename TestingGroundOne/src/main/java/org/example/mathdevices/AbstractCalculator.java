package org.example.mathdevices;

public abstract class AbstractCalculator {

    protected Float initialDefaultValue = 0.0f;
    protected boolean hasError = false;
    protected Float storedValue = initialDefaultValue;

    public void resetStoredValue() {
        this.storedValue = initialDefaultValue;
        this.hasError = false;
    }

    public String getValueAsString() {
        if(hasError)
            return "Err";
        if(hasNoDecimals())
            return String.format("%.0f",storedValue);
        else
            return String.format("%s",storedValue);
    }

    private boolean hasNoDecimals () {
        return storedValue % 1 == 0;
    }
}
