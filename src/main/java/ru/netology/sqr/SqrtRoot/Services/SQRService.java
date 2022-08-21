package ru.netology.sqr.SqrtRoot.Services;

public class SQRService {

    public int calculated (int min, int max) {
        int number = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min) {
                if (i * i <max) {
                    number++;
                }
            }
        }
        return number;
    }
}