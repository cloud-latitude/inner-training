package idv.kuma;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SalaryCalculatorTest {

    @Test
    void full_attendance() {

        SalaryCalculator salaryCalculator = new SalaryCalculator();

        int actual = salaryCalculator.calculate(1L, 2024, 10);

        Assertions.assertThat(actual).isEqualTo(31_000);

    }
}
