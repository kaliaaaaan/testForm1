package com.demoqa.tests;


import com.demoqa.pages.TextBoxPage;
import org.junit.jupiter.api.Test;

public class TextBoxTests extends TestBase {

    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    void fillFormTestwitPage() {

        textBoxPage
                .openPage()
                .deleteBanners()
                .setUserName("Nikolay")
                .setUserEmail("knnn@ya.ru")
                .setCurrentAddress("Russia")
                .setPermanentAddress("Moscow")
                .clickSubmit();

        textBoxPage
                .checkResultName("Nikolay")
                .checkResultEmail("knnn@ya.ru")
                .checkResultCurrentAddress("Russia")
                .checkResultPermanentAddress("Moscow");

    }
}
