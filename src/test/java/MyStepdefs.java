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
    public void создаемЭкземплярОбъектаВремя() { time = new Timed(5, 10);
    }

    @When("Задали будильник с точным временем")
    public void задалиБудильникСТочнымВременем() {
        clock = new Clock(time);
    }

    @Then("У будильника задано наше время")
    public void уБудильникаЗаданоНашеВремя() {
        Assert.assertEquals(time, clock.getTime());
    }

    @Given("^Создаем экземляр объекта время$")
    public void создаемЭкземлярОбъектаВремя() {
        
    }

    @When("^Указали точное время$")
    public void указалиТочноеВремя() {
        
    }

    @Then("^Получили верное время в часах и минутах$")
    public void получилиВерноеВремяВЧасахИМинутах() {
    }
}
