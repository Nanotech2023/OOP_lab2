package com.company;
import java.util.Objects;
import java.util.Set;

public class Singer {
    private String name;

    Singer(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    static void printSet(Set<Singer> set) {
        for (Singer singer : set) {
            System.out.println(singer);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Singer: " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Singer)) return false;
        Singer singer = (Singer) o;
        return Objects.equals(name, singer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
