package selenide;
import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class selenideTest {

    @Test
    public void automationTest() {

        open("https://explorecalifornia.org/contact.htm");

        //look if the page is loading successfully
        $("#name").should(appear);
        $("#comments").should(appear);

        //set the values
        $("#name").setValue("Azeem Baloch");
        $("#state").selectOptionContainingText("Texas");
        $("#backpack").click();
        $("#comments").setValue("A good boy");
        $(By.name("newsletter")).selectRadio("yes").click();

        //confirm the behaviour by assertion
        $("#name").shouldHave(value("Azeem Baloch"));
        String state = $("#state").getSelectedText();
        assert(state).equals("Texas");
        $("#backpack").shouldBe(selected);
        $("#comments").shouldHave(value("A good boy"));
        $(By.name("newsletter")).shouldHave(value("yes"));
    }
}
