package com.demoqa.tests;

import com.demoqa.utils.RandomVariables;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.logevents.SelenideLogger.step;


public class RegistrationPage extends TestBaseMain {
    com.demoqa.pages.RegistrationPage registrationPage = new com.demoqa.pages.RegistrationPage();
    RandomVariables randomVariables = new RandomVariables();

    @Tag("main")
    @Test
    void  succesfullfillRegistrationFormTest () {
        step("Open page", () -> {
            registrationPage
                    .openPage()
                    .removeBanners();
        });


        step("Fill form", () -> {
            registrationPage
               .setFirstName(randomVariables.firstName)
               .setLastName(randomVariables.lastName)
               .setUserEmail(randomVariables.userEmail)
               .setGender(randomVariables.userGender)
               .setUserNumber(randomVariables.userNumber)
               .setBirthDate(randomVariables.birthDay, randomVariables.birthdayMonth,randomVariables.birthdayYear)
               .setSubject(randomVariables.subject)
               .setHobby(randomVariables.hobby)
               .uploadPicture(randomVariables.fileName)
               .setAddress(randomVariables.mainAddress)
               .setState(randomVariables.state)
               .setCity(randomVariables.city)
               .submitButtonClick();
        });


        step("Check results", () -> {
        registrationPage
                .checkResult(randomVariables.firstName + " " + randomVariables.lastName)
                .checkResult(randomVariables.userEmail)
                .checkResult(randomVariables.userGender)
                .checkResult(randomVariables.userNumber)
                .checkResult(randomVariables.birthDay + " " + randomVariables.birthdayMonth + "," + randomVariables.birthdayYear)
                .checkResult(randomVariables.subject)
                .checkResult(randomVariables.hobby)
                .checkResult(randomVariables.fileName)
                .checkResult(randomVariables.mainAddress)
                .checkResult(randomVariables.state + " " + randomVariables.city);
        });
    }
}