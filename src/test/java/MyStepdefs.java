import clock.Clock;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import timed.Timed;


public class MyStepdefs {
    private static Clock clock;
    private static Timed time;
    @Given("Создаем экземпляр объекта будильник")
    public void создаемЭкземплярОбъектаБудильник() { clock = new Clock(new Timed(5, 10));
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
        time = new Timed();
    }

    @When("^Указали точное время$")
    public void указалиТочноеВремя() {
        time.setTime(5, 10);
    }

    @Then("^Получили верное время в часах и минутах$")
    public void получилиВерноеВремяВЧасахИМинутах() {
        Assert.assertEquals(5, time.getHour());
        Assert.assertEquals(10, time.getMinute());
    }

    @When("^Задаем время сигнала будильника '(\\d+)' '(\\d+)'$")
    public void задаемВремяСигналаБудильника(int arg0, int arg1) {
        Timed time1 = new Timed(arg0, arg1);
        clock.setSignal(time1);
    }

    @And("^Задаем продолжительность сигнала будильника '(\\d+)'$")
    public void задаемПродолжительностьСигналаБудильника(int arg0) {
        clock.setAlarm(arg0);
        time.setTime(5,10);
        Timed time1 = new Timed(5, 13);
        Assert.assertEquals(3, time1.sub(time));
    }

    @Then("^Будильник звучит заданное количество минут$")
    public void будильникЗвучитЗаданноеКоличествоМинут() {
        Assert.assertEquals(true, clock.signalAlarm());
        time.setTime(5,11);
        clock.setTime(time);
        Assert.assertEquals(true, clock.signalAlarm());
        time.setTime(5,12);
        clock.setTime(time);
        Assert.assertEquals(true, clock.signalAlarm());
        time.setTime(5,13);
        clock.setTime(time);
        Assert.assertEquals(false, clock.signalAlarm());
    }
}
