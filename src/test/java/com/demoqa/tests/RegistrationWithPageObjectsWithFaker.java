package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;

import org.junit.jupiter.api.Test;

import static com.demoqa.utils.RandomUtils.*;

public class RegistrationWithPageObjectsWithFaker extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void succesfullfillRegistrationFormTest() {
       registrationPage
               .openPage()
               .removeBanners()
               .setFirstName(firstName)
               .setLastName(lastName)
               .setUserEmail(userEmail)
               .setGender(userGender)
               .setUserNumber(userNumber)
               .setBirthDate(birthDay, birthdayMonth,birthdayYear)
               .setSubject(subject)
               .setHobby(hobby)
               .uploadPicture(fileName)
               .setAddress(mainAddress)
               .setState(state)
               .setCity(city)
               .submitButtonClick();

        registrationPage
                .checkResult(firstName + " " + lastName)
                .checkResult(userEmail)
                .checkResult(userGender)
                .checkResult(userNumber)
                .checkResult(birthDay + " " + birthdayMonth + "," + birthdayYear)
                .checkResult(subject)
                .checkResult(hobby)
                .checkResult(fileName)
                .checkResult(mainAddress)
                .checkResult(state + " " + city);
    }
}