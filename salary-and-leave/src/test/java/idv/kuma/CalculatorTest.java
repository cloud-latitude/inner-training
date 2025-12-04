package idv.kuma;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    @Test
    void should_return_2_when_adding_1_and_1() {
        Calculator calculator = new Calculator();

        int result = calculator.add(1, 1);

        assertThat(result).isEqualTo(2);
    }
}
