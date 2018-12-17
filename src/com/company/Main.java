package com.company;

public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();

        Song TheLeadersOfResistance = new Song("The Leaders Of Resistance", 2005, new Singer("John Williams"), new Genre("Soundtrack", new Genre("Instrumental")),
                new Album("Star Wars: Episode III"));
        catalog.addSong(TheLeadersOfResistance);

        Song DuelOfTheFates = new Song("Duel Of The Fates", 2005, new Singer("John Williams"), new Genre("Soundtrack", new Genre("Instrumental")),
                new Album("Star Wars: Episode III"));
        catalog.addSong(DuelOfTheFates);

        Song Crawling = new Song("Crawling", 2000, new Singer("Linkin Park"),
                new Genre("Rock", new Genre("Alternative Rock")), new Album("Hybrid Theory"));
        catalog.addSong(Crawling);

        Song InTheEnd = new Song("Crawling", 2000, new Singer("Linkin Park"),
                new Genre("Rock", new Genre("Alternative Rock")), new Album("Hybrid Theory"));
        catalog.addSong(InTheEnd);

        Song APlaceForMyHead = new Song("A Place For My Head", 2000, new Singer("Linkin Park"),
                new Genre("Rock", new Genre("Alternative Rock")), new Album("Hybrid Theory"));
        catalog.addSong(APlaceForMyHead);

        Song SongNameOne = new Song("Song Name One", 2018, new Singer("SingerName"),
                new Genre("Instrumental"), new Album("AlbumName"));
        catalog.addSong(SongNameOne);

        Song SongNameTwo = new Song("Song Name Two", 2005, new Singer("Linkin Park"),
                new Genre("Rock", new Genre("Metal")), new Album("Hybrid Theory"));
        catalog.addSong(SongNameTwo);

        Song SongNameThree = new Song("Song Name Three", 2000, new Singer("SingerName"), new Genre("Alternative Rock"),
                new Album("AlbumName"));
        catalog.addSong(SongNameThree);

        SongsCollection starWarsIIIOST = new SongsCollection("Star Wars:III OST");
        starWarsIIIOST.addSong(TheLeadersOfResistance);
        starWarsIIIOST.addSong(DuelOfTheFates);
        catalog.addSongsCollection(starWarsIIIOST);

        SongsCollection wonderfulMusic = new SongsCollection("Wonderful Music");
        wonderfulMusic.addSong(TheLeadersOfResistance);
        wonderfulMusic.addSong(DuelOfTheFates);
        wonderfulMusic.addSong(SongNameThree);
        catalog.addSongsCollection(wonderfulMusic);

        SongsCollection bestRock = new SongsCollection("Best Rock");
        bestRock.addSong(Crawling);
        bestRock.addSong(InTheEnd);
        bestRock.addSong(APlaceForMyHead);
        catalog.addSongsCollection(bestRock);

        SongsCollection example = new SongsCollection("Example");
        example.addSong(SongNameTwo);
        catalog.addSongsCollection(example);

        SearchEngine searchEngine = new SearchEngine(catalog);

        System.out.println("------------------------Tests on the conditions of the problem------------------------");

        Album.printSet(searchEngine.findAlbumsBySongs(new SearchEngine(new Catalog(searchEngine.findSongsByGenre(new Genre("Alternative Rock")))).findSongsEqualsYear(2000)));
        SongsCollection.printSet(searchEngine.findSongsCollectionBySongs(new SearchEngine(new Catalog(searchEngine.findSongsByGenre(new Genre("Instrumental")))).findSongsEqualsYear(2005)));

        System.out.println("------------------------Songs search tests------------------------");

        Song.printSet(searchEngine.findSongsBySinger(new Singer("Linkin Park")));

        Song.printSet(searchEngine.findSongsByAlbum(new Album("Hybrid Theory")));

        Song.printSet(searchEngine.findSongsByCollection(new SongsCollection("Wonderful Music")));

        Song.printSet(searchEngine.findSongsByGenre(new Genre("Metal")));

        Song.printSet(searchEngine.findSongsEqualsYear(2000));

        Song.printSet(searchEngine.findSongsLessThanYear(2006));

        Song.printSet(searchEngine.findSongsMoreThanYear(2017));

        Song.printSet(new SearchEngine(new Catalog(new SearchEngine(new Catalog(searchEngine.findSongsByGenre(new Genre("Rock")))).findSongsByAlbum(new Album("Hybrid Theory")))).findSongsLessThanYear(2000));

        Song.printSet(searchEngine.findSongsBySinger(searchEngine.findSingerBySong(Crawling)));

        System.out.println("------------------------Singers search tests------------------------");

        System.out.println(searchEngine.findSingerBySong(SongNameTwo));
        System.out.println();

        System.out.println(searchEngine.findSingerByAlbum(new Album("Hybrid Theory")));
        System.out.println();

        Singer.printSet(searchEngine.findSingersByGenre(new Genre("Alternative Rock")));

        Singer.printSet(searchEngine.findSingersBySongCollection(new SongsCollection("BestRock")));

        System.out.println("------------------------Genres search tests------------------------");

        Genre.printSet(searchEngine.findGenresBySinger(new Singer("Jown Williams")));

        System.out.println(searchEngine.findGenreBySong(SongNameThree));
        System.out.println();

        Genre.printSet(searchEngine.findGenresByAlbum(new Album("Hybrid Theory")));

        Genre.printSet(searchEngine.findGenresBySongsCollection(new SongsCollection("BestRock")));

        System.out.println("------------------------Albums search tests------------------------");

        Album.printSet(searchEngine.findAlbumsBySinger(new Singer("John Williams")));

        System.out.println(searchEngine.findAlbumBySong(DuelOfTheFates));
        System.out.println();

        Album.printSet(searchEngine.findAlbumsByGenre(new Genre("Metal")));

        Album.printSet(searchEngine.findAlbumsBySongs(searchEngine.findSongsLessThanYear(2007)));

        System.out.println("------------------------SongsCollections search tests------------------------");

        SongsCollection.printSet(searchEngine.findSongsCollectionsBySinger(new Singer("Linkin Park")));

        SongsCollection.printSet(searchEngine.findSongsCollectionsBySong(APlaceForMyHead));

        SongsCollection.printSet(searchEngine.findSongsCollectionsByGenre(new Genre("Rock")));

        SongsCollection.printSet(searchEngine.findSongsCollectionBySongs(searchEngine.findSongsByGenre(new Genre("Instrumental"))));

    }
}
