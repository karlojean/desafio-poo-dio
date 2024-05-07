package br.com.dio.desafio.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Developer {
    private String name;
    private Set<Content> subscribeContents = new LinkedHashSet<>();
    private Set<Content> completedContents = new LinkedHashSet<>();

    public void registerBootcamp(Bootcamp bootcamp) {
        this.subscribeContents.addAll(bootcamp.getContents());
        bootcamp.getDevsRegistered().add(this);
    }

    public void toProgress(){
        Optional<Content> content = this.subscribeContents.stream().findFirst();

        if (content.isEmpty()) {
            System.out.println("Você não está inscrito em nenhum conteudo!");
            return;
        }
        this.completedContents.add(content.get());
        this.subscribeContents.remove(content.get());
    }

    public double calculateTotalXp() {
        return this.completedContents.stream().mapToDouble(Content::calculateXp).sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Developer developer)) return false;
        return Objects.equals(getName(), developer.getName()) && Objects.equals(getSubscribeContents(), developer.getSubscribeContents()) && Objects.equals(getCompletedContents(), developer.getCompletedContents());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSubscribeContents(), getCompletedContents());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribeContents() {
        return subscribeContents;
    }

    public void setSubscribeContents(Set<Content> subscribeContents) {
        this.subscribeContents = subscribeContents;
    }

    public Set<Content> getCompletedContents() {
        return completedContents;
    }

    public void setCompletedContents(Set<Content> completedContents) {
        this.completedContents = completedContents;
    }
}
