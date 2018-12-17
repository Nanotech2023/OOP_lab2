package com.company;
import java.util.Objects;
import java.util.Set;

public class Genre {
    private String name;
    private Genre parent;

    String getName() {
        return name;
    }

    Genre getParent() {
        return parent;
    }

    Genre(String name){
        this.name = name;
    }

    Genre(String name, Genre parent) {
        this.name = name;
        this.parent = parent;
    }

    static void printSet(Set<Genre> set) {
        for (Genre genre : set) {
            System.out.println(genre);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Genre: " + this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Genre)) return false;
        Genre genre = (Genre) o;
        return Objects.equals(name, genre.name) &&
                Objects.equals(parent, genre.parent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, parent);
    }
}