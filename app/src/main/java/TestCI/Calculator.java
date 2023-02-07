package TestCI;

public class Calculator {

    private int value;

    public Calculator() {
        this.value = 0;
    }

    public void add(int number) {
        this.value = this.value + number;
    }

    public void subtract(int number) {
        this.value = this.value - number;
    }

    public void multiplication(int number) {
        this.value = this.value*number;
        // hety
    }

    public int getValue() {
        return this.value;
    }
}
