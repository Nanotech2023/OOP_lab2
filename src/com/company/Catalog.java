package com.company;
import java.util.HashSet;
import java.util.Set;

class Catalog {
    private Set<Song> songs = new HashSet<>();
    private Set<SongsCollection> songsCollections = new HashSet<>();

    Catalog() {
    }

    public Set<Song> getSongs() {
        return songs;
    }

    public Set<SongsCollection> getSongsCollections() {
        return songsCollections;
    }

    Catalog(Set<Song> songs) {
        this.songs = songs;
    }

    void addSong(Song song) {
        songs.add(song);
    }

    void addSongsCollection(SongsCollection songsCollection) { songsCollections.add(songsCollection); }

}
