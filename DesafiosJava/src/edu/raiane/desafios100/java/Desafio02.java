package edu.raiane.desafios100.java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class Desafio02{
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        String formatedDateTime = currentDateTime.format(FORMATTER);
        System.out.println(formatedDateTime);
    }

}