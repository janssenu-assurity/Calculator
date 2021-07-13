package Calculator;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class CalculaorSteps {
    private int sum;
    @When("I calculate {int} + {int}")
    public int iAdd(int arg0, int arg1) {
        sum = arg0;
        while (arg1 > 0) {
            sum = sum + 1;
            arg1 = arg1 - 1;
        }

        return(sum);
    }

    @Then("the answer is {int}")
    public void theAnswerIs(int arg0) {
        assertEquals(arg0, sum);
    }

    @When("I calculate {int} - {int}")
    public int iSubtract(int arg0, int arg1) {
        sum = arg0;

        while (arg1 > 0) {
            sum = sum -1;
            arg1 = arg1 - 1;
        }

        return(sum);

    }

    @When("I calculate {int} x {int}")
    public int iMultiply(int arg0, int arg1) {
        sum = 0;

        while (arg1 > 0) {
            sum = sum + arg0;
            arg1 = arg1 -1;
        }

        return(sum);
    }

    @When("I calculate {int} over {int}")
    public int iDivide(int arg0, int arg1) {
        sum = arg0/arg1;
        return (sum);
    }
}
