package stepdefs;
import io.cucumber.java.en.*;
import helpers.BillCalculationHelper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ScenarioOutlineSteps {

    int InitialBillAmount;
    double TaxRate;

    @Given("I have a customer")
    public void i_have_a_customer() {

    }

    @Given("user enters initial bill amount as {int}")
    public void user_enters_initial_bill_amount_as(Integer initialBillAmount) {
        this.InitialBillAmount = initialBillAmount;
        System.out.println("initialBillAmount: " + initialBillAmount);
    }

    /*@Given("Sales Tax Rate is {int} Percent")
    public void sales_tax_rate_is_percent(Integer taxRate) {
        this.TaxRate = taxRate;
        System.out.println("taxRate: " + taxRate);
    }*/

    /*@Then("final bill amount calculate is {int}")
    public void final_bill_amount_calculate_is(Integer expectedValue) {
        double SystemCalculatedValue = BillCalculationHelper.CalculateBillForCustomer(this.InitialBillAmount, this.TaxRate);
        System.out.println("expectedValue: " + expectedValue);
        System.out.println("SystemCalculatedValue: " + SystemCalculatedValue);
        assertTrue(expectedValue == SystemCalculatedValue);
    }*/

    @Given("Sales Tax Rate is {double} Percent")
    public void sales_tax_rate_is_percent(Double taxRate) {
        this.TaxRate = taxRate;
        System.out.println("taxRate: " + taxRate);
    }

    @Then("final bill amount calculate is {double}")
    public void final_bill_amount_calculate_is(Double expectedValue) {
        double SystemCalculatedValue = BillCalculationHelper.CalculateBillForCustomer(this.InitialBillAmount, this.TaxRate);
        System.out.println("expectedValue: " + expectedValue);
        System.out.println("SystemCalculatedValue: " + SystemCalculatedValue);
        assertEquals(expectedValue, SystemCalculatedValue, 0.0);
    }
}
