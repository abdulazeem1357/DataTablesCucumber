package stepdefs;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.*;
import java.util.List;
import java.util.Map;

public class DataTableSteps {
    @Given("I placed an order for the following items")
    public void iPlacedAnOrderForTheFollowingItems(DataTable dataTable) {
        List<Map<String, String>> BillData = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> BillItems : BillData) {
            for (Map.Entry<String, String> BillItem: BillItems.entrySet()) {
                System.out.println("Key: " + BillItem.getKey());
                System.out.println("Value: " + BillItem.getValue());
            }
        }
    }

    @When("I generate the bill")
    public void iGenerateTheBill() {
    }

    @Then("a bill for ${int} should be generated")
    public void aBillFor$ShouldBeGenerated(int arg0) {
    }
}
