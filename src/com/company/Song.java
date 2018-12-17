package com.company;
import java.util.Objects;
import java.util.Set;

public class Song {
    private int year;
    private String name;
    private Singer singer;
    private Album album;
    private Genre genre;

    Song(String name, int year, Singer singer, Genre genre, Album album) {
        this.name = name;
        this.year = year;
        this.singer = singer;
        this.album = album;
        this.genre = genre;
    }

    int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    Singer getSinger() {
        return singer;
    }

    Album getAlbum() {
        return album;
    }

    Genre getGenre() {
        return genre;
    }

    static void printSet(Set<Song> set) {
        for (Song song : set) {
            System.out.println(song);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        String answer = "Song: " + name + "; Year: " + year + "; Singer: " + singer.getName() + "; Album: " + album.getName() +
                "; Genre: " + genre.getName();
        return answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;
        Song song = (Song) o;
        return year == song.year &&
                Objects.equals(name, song.name) &&
                Objects.equals(singer, song.singer) &&
                Objects.equals(album, song.album) &&
                Objects.equals(genre, song.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, name, singer, album, genre);
    }
}