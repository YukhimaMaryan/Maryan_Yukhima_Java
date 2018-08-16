package Practice3.practice321;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//1. Create 6 simple unit tests for calculator(+, -, /, *).
//• 3 failure and 3 success
//• Create 2 groups
//• Add some pre- and post- condition
//• Use separate test class for your tests
//• You don’t need main function in tests (entry point)
//2. Create testng.xml which should execute your test class
//3. Create testng2.xml which should execute your group
//4. Create test with parameters from testng.xml suite
//5. Create data driven test: function sum(int a, int b) which reads input
//data from an array

    public class TestNG {
        @Parameters({ "number1", "number2", "sum",  "global_count"})
        @Test
        public void testAdd(int number1, int number2, int sum, int global_count) {
            Calculator calculator = new Calculator();
            for (int i = 0; i < global_count; i++) {
                Assert.assertEquals(calculator.add(number1, number2), sum);
            }
        }
        @Parameters({ "number1", "number2", "difference" })
        @Test
        public void testSubtract(int number1, int number2, int difference) {
            Calculator calculator = new Calculator();
            Assert.assertEquals(calculator.subtract(number1, number2), difference);
        }
        @Parameters({ "number1", "number2", "multiplication" })
        @Test
        public void testMultiply(int number1, int number2, int multiplication) {
            Calculator calculator = new Calculator();
                Assert.assertEquals(calculator.multiply(number1, number2), multiplication);
            }

        @Parameters({ "number1", "number2", "division" })
        @Test
        public void testDivide(int number1, int number2, int division) {
            Calculator calculator = new Calculator();
            Assert.assertEquals(calculator.divide(number1, number2), division);
        }

        }


