package com.demoqa.utils;

import static com.demoqa.utils.RandomUtils.*;

public class RandomVariables {


    public String
            firstName = getRandomFirstName(),
            lastName = getRandomLastName(),
            userEmail = getRandomUserEmail(),
            userGender = getRandomGender(),
            userNumber = getRandomUserNumber(),
            birthdayYear = getRandomYear(),
            birthdayMonth = getRandomMonth(),
            birthDay = getRandomDay(),
            hobby = getRandomHobby(),
            subject = getRandomSubject(),
            fileName = "image.png",
            mainAddress = getRandomAddress(),
            state = getRandomState(),
            city = getRandomCity(state);


}