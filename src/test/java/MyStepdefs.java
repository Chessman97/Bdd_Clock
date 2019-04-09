import clock.Clock;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import timed.Timed;


public class MyStepdefs {
    private static Clock clock;
    private static Timed time;
    @Given("Создаем экземпляр объекта будильник")
    public void создаемЭкземплярОбъектаБудильник() { clock = new Clock(new Timed());
    }

    @Given("Создаем экземпляр объекта время")
    public void создаемЭкземплярОбъектаВремя() { time = new Timed();
    }

    @When("Задали будильник с точным временем")
    public void задалиБудильникСТочнымВременем() {
        clock = new Clock(new Timed(5, 10));
    }

    @Then("У будильника задано наше время")
    public void уБудильникаЗаданоНашеВремя() {
        Assert.assertEquals(new Timed(5,10), clock.getTime());
    }
}
