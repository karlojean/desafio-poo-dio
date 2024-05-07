package br.com.dio.desafio.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate initDate = LocalDate.now();
    private final LocalDate finalDate = initDate.plusDays(45);
    private Set<Developer> devsRegistered = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Bootcamp bootcamp)) return false;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(initDate, bootcamp.initDate) && Objects.equals(finalDate, bootcamp.finalDate) && Objects.equals(devsRegistered, bootcamp.devsRegistered) && Objects.equals(contents, bootcamp.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, initDate, finalDate, devsRegistered, contents);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getInitDate() {
        return initDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public Set<Developer> getDevsRegistered() {
        return devsRegistered;
    }

    public void setDevsRegistered(Set<Developer> devsRegistered) {
        this.devsRegistered = devsRegistered;
    }

    public Set<Content> getContents() {
        return contents;
    }

    public void setContents(Content content) {
        this.contents.add(content);
    }
}
