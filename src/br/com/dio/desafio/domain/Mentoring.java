package br.com.dio.desafio.domain;

import java.time.LocalDate;

public class Mentoring extends Content{
    LocalDate date;

    @Override
    public double calculateXp() {
        return DEFAULT_XP + 20;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }
}
