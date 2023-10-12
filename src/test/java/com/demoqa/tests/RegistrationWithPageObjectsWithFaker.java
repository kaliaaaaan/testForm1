package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;

import com.demoqa.utils.RandomVariables;
import org.junit.jupiter.api.Test;

public class RegistrationWithPageObjectsWithFaker extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    RandomVariables randomVariables = new RandomVariables();

    @Test
    void succesfullfillRegistrationFormTest() {
       registrationPage
               .openPage()
               .removeBanners()
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
    }
}