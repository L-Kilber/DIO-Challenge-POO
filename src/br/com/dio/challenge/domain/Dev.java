package br.com.dio.challenge.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> completedContent = new LinkedHashSet<>();
    private Set<Content> signedContent = new LinkedHashSet<>();

    public void signUpBootcamp(Bootcamp bootcamp) {
        this.signedContent.addAll(bootcamp.getContents());
        bootcamp.getSubscribedDevs().add(this);
    }

    public void progress() {
        Optional<Content> content = this.signedContent.stream().findFirst();
        //Optional é utilizado em retornos nulos.
        if (content.isPresent()) {
            this.completedContent.add(content.get());
            this.signedContent.remove(content.get());
        } else {
            System.err.println("You are not subscribed to any content!");
        }
    }

    public double calculateTotalXP() {
        return this.completedContent.stream().mapToDouble(content -> content.calculateXP()).sum();
    }

    public String getName() {
        return name;
    }

    public Set<Content> getCompletedContent() {
        return completedContent;
    }

    public Set<Content> getSignedContent() {
        return signedContent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompletedContent(Set<Content> completedContent) {
        this.completedContent = completedContent;
    }

    public void setSignedContent(Set<Content> signedContent) {
        this.signedContent = signedContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(completedContent, dev.completedContent) && Objects.equals(signedContent, dev.signedContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, completedContent, signedContent);
    }
}
