package com.tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

class LeapYear {
    static String is_year_leap(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0))) {
            return "Високосный";
        } else {
            return "Не вискосный";
        }
    }
}

public class YearStepDefinition {
    String actualAnswer;
    int year;

    @Given("Пользователь вводит год {string}")
    public void year_is(String year)  {
        try {
            this.year = Integer.parseInt(year);
        }
        catch (NumberFormatException exp){
            this.year = 0;
        }
    }

    @When("Мы определяем високосность года")
    public void i_ask_is_year_leap() {
        actualAnswer = LeapYear.is_year_leap(this.year);
    }

    @Then("Должны получить ответ {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}
