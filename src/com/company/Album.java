package com.company;
import java.util.Objects;
import java.util.Set;

public class Album {
    private String name;

    Album (String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    static void printSet(Set<Album> set) {
        for (Album album : set) {
            System.out.println(album);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Album: " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Album)) return false;
        Album album = (Album) o;
        return Objects.equals(name, album.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}