package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class testForm1 {

    @BeforeAll
    static void beforeAll() {

        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void fillRegistrationFormTest() {
        open("/automation-practice-form");

        $("#firstName").setValue("Nikolay");
        $("#lastName").setValue("Pronyushkin");
        $("#userEmail").setValue("knnn@ya.ru");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("9212341234");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").$(byText("1994")).click();
        $(".react-datepicker__month-select").$(byText("October")).click();
        $(".react-datepicker__month-container").$(byText("10")).click();
        $("#subjectsInput").setValue("Math").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();
        $("#uploadPicture").uploadFromClasspath("image.png");
        $("#currentAddress").setValue("Moscow");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("Rajasthan")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Jaiselmer")).click();
        $("#submit").click();

        $(".table-responsive").shouldHave(text("Nikolay Pronyushkin"));
        $(".table-responsive").shouldHave(text("knnn@ya.ru"));
        $(".table-responsive").shouldHave(text("Male"));
        $(".table-responsive").shouldHave(text("9212341234"));
        $(".table-responsive").shouldHave(text("10 October,1994"));
        $(".table-responsive").shouldHave(text("Sports, Music"));
        $(".table-responsive").shouldHave(text("image.png"));
        $(".table-responsive").shouldHave(text("Moscow"));
        $(".table-responsive").shouldHave(text("Rajasthan Jaiselmer"));

    }
}