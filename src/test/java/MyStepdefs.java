import clock.Clock;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import timed.Timed;


public class MyStepdefs {
    @Given("Создаем экземпляр объекта будильник")
    public void создаемЭкземплярОбъектаБудильник() {
        Clock clock = new Clock();
    }

    @Given("Создаем экземпляр объекта время")
    public void создаемЭкземплярОбъектаВремя() {
        Timed time = new Timed();
    }

    @When("Задали будильник с точным временем")
    public void задалиБудильникСТочнымВременем() {

    }

    @Then("У будильника задано наше время")
    public void уБудильникаЗаданоНашеВремя() {
    }
}
