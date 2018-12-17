package com.company;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SongsCollection {
    private String name;
    private Set<Song> songs = new HashSet<>();

    SongsCollection(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public Set<Song> getSongs() {
        return songs;
    }

    void addSong(Song song) {
        songs.add(song);
    }

    static void printSet(Set<SongsCollection> set) {
        for (SongsCollection songsCollection : set) {
            System.out.println(songsCollection);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Collection: " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SongsCollection)) return false;
        SongsCollection that = (SongsCollection) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}