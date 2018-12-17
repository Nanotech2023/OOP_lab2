package com.company;

import java.util.HashSet;
import java.util.Set;

class SearchEngine {
    private Catalog catalog;

    SearchEngine(Catalog catalog) {
        this.catalog = catalog;
    }

    /** Searching songs*/

    Set<Song> findSongsBySinger(Singer singer) {
        Set<Song> set = new HashSet<>();
        for (Song song : catalog.getSongs()) {
            if (song.getSinger().equals(singer)) {
                set.add(song);
            }
        }
        return set;
    }

    Set<Song> findSongsByAlbum(Album album) {
        Set<Song> set = new HashSet<>();
        for (Song song : catalog.getSongs()) {
            if (song.getAlbum().equals(album)) {
                set.add(song);
            }
        }
        return set;
    }

    Set<Song> findSongsByCollection(SongsCollection collection) {
        return collection.getSongs();
    }

    Set<Song> findSongsByGenre(Genre genre) {
        Set<Song> set= new HashSet<>();
        for (Song song : catalog.getSongs()) {
            if (song.getGenre().equals(genre) || song.getGenre().getParent() != null && song.getGenre().getParent().equals(genre)) {
                set.add(song);
            }
        }
        return set;
    }

    Set<Song> findSongsEqualsYear(int year) {
        Set<Song> set = new HashSet<>();
        for (Song song : catalog.getSongs()) {
            if (song.getYear() == year) {
                set.add(song);
            }
        }
        return set;
    }

    Set<Song> findSongsLessThanYear(int year) {
        Set<Song> set = new HashSet<>();
        for (Song song : catalog.getSongs()) {
            if (song.getYear() < year) {
                set.add(song);
            }
        }
        return set;
    }

    Set<Song> findSongsMoreThanYear(int year) {
        Set<Song> set = new HashSet<>();
        for (Song song : catalog.getSongs()) {
            if (song.getYear() > year) {
                set.add(song);
            }
        }
        return set;
    }

    /**Searching singers*/

    Singer findSingerBySong(Song song) {
        return song.getSinger();
    }

    Singer findSingerByAlbum(Album album) {
        for (Song song : catalog.getSongs()) {
            if (song.getAlbum().equals(album)) {
                return song.getSinger();
            }
        }
        return null;
    }

    Set<Singer> findSingersByGenre(Genre genre) {
        Set<Singer> set = new HashSet<>();
        for (Song song : catalog.getSongs()) {
            if (song.getGenre().equals(genre) || song.getGenre().getParent() != null && song.getGenre().getParent().equals(genre)) {
                set.add(song.getSinger());
            }
        }
        return set;
    }

    Set<Singer> findSingersBySongCollection(SongsCollection collection) {
        Set<Singer> set = new HashSet<>();
        for (Song song : collection.getSongs()) {
            set.add(song.getSinger());
        }
        return set;
    }

    /**Searching albums*/

    Set<Album> findAlbumsBySinger(Singer singer) {
        Set<Album> set = new HashSet<>();
        for (Song song : catalog.getSongs()) {
            if (song.getSinger().equals(singer)) {
                set.add(song.getAlbum());
            }
        }
        return set;
    }

    Album findAlbumBySong(Song song) {
        return song.getAlbum();
    }

    Set<Album> findAlbumsByGenre(Genre genre) {
        Set<Album> set = new HashSet<>();
        for (Song song : catalog.getSongs()) {
            if (song.getGenre().equals(genre) || song.getGenre().getParent() != null && song.getGenre().getParent().equals(genre)) {
                set.add(song.getAlbum());
            }
        }
        return set;
    }

    Set<Album> findAlbumsBySongs(Set<Song> setSongs) {
        Set<Album> setAlbums = new HashSet<>();
        for (Song song : setSongs) {
            setAlbums.add(song.getAlbum());
        }
        return setAlbums;
    }

    /**Searching genres*/

    Set<Genre> findGenresBySinger(Singer singer) {
        Set<Genre> set = new HashSet<>();
        for (Song song : catalog.getSongs()) {
            if (song.getSinger().equals(singer)) {
                set.add(song.getGenre());
            }
        }
        return set;
    }

    Genre findGenreBySong(Song song) {
        return song.getGenre();
    }

    Set<Genre> findGenresByAlbum(Album album) {
        Set<Genre> set = new HashSet<>();
        for (Song song : catalog.getSongs()) {
            if (song.getAlbum().equals(album)) {
                set.add(song.getGenre());
            }
        }
        return set;
    }

    Set<Genre> findGenresBySongsCollection(SongsCollection collection) {
        Set<Genre> set = new HashSet<>();
        for (Song song : collection.getSongs()) {
            set.add(song.getGenre());
        }
        return set;
    }

    /**Searching collections*/

    Set<SongsCollection> findSongsCollectionsBySinger(Singer singer) {
        Set<SongsCollection> set = new HashSet<>();
        for (SongsCollection songsCollection : catalog.getSongsCollections()) {
            for (Song song : songsCollection.getSongs()) {
                if (song.getSinger().equals(singer)) {
                    set.add(songsCollection);
                }
            }
        }
        return set;
    }

    Set<SongsCollection> findSongsCollectionsBySong(Song song) {
        Set<SongsCollection> set = new HashSet<>();
        for (SongsCollection songsCollection : catalog.getSongsCollections()) {
            if (songsCollection.getSongs().contains(song)) {
                set.add(songsCollection);
            }
        }
        return set;
    }

    Set<SongsCollection> findSongsCollectionsByGenre(Genre genre) {
        Set<SongsCollection> set = new HashSet<>();
        for (SongsCollection songsCollection : catalog.getSongsCollections()) {
            for (Song song : songsCollection.getSongs()) {
                if (song.getGenre().equals(genre) || song.getGenre().getParent() != null && song.getGenre().getParent().equals(genre)) {
                    set.add(songsCollection);
                }
            }
        }
        return set;
    }

    Set<SongsCollection> findSongsCollectionBySongs(Set<Song> songsSet) {
        Set<SongsCollection> songsCollectionsSet = new HashSet<>();
        for (SongsCollection songsCollection : catalog.getSongsCollections()) {
            for (Song song : songsCollection.getSongs()) {
                if (songsSet.contains(song)) {
                    songsCollectionsSet.add(songsCollection);
                }
            }
        }
        return songsCollectionsSet;
    }
}