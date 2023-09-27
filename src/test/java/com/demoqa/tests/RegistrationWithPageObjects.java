package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

public class RegistrationWithPageObjects extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void succesfullfillRegistrationFormTest() {
       registrationPage
               .openPage()
               .removeBanners()
               .setFirstName("Nikolay")
               .setLastName("Pronyushkin")
               .setUserEmail("knnn@ya.ru")
               .setGender("Male")
               .setUserNumber("9212341234")
               .setBirthDate("20", "October","1994")
               .setSubject("Math")
               .setHobby("Sports")
               .uploadPicture("image.png")
               .setAddress("Moscow")
               .setState("Rajasthan")
               .setCity("Jaiselmer")
               .submitButtonClick();

        registrationPage.checkResult("Nikolay Pronyushkin")
                .checkResult("knnn@ya.ru")
                .checkResult("Male")
                .checkResult("9212341234")
                .checkResult("20 October,1994")
                .checkResult("Maths")
                .checkResult("Sports")
                .checkResult("Moscow")
                .checkResult("image.png")
                .checkResult("Rajasthan Jaiselmer");
    }
}