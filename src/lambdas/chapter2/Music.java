package lambdas.chapter2;

import lambdas.music.Musician;
import lambdas.music.Track;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Music {

    public static void main(String[] args) {

        List<Musician> musicians = initMusicians();
        List<Track> tracks = initTracks();

        musiciansFromCityCount(musicians, "London");
        printMusiciansFromCity(musicians, "London");
        filterMusiciansFromCity(musicians, "London");
        collectMusiciansFromCity(musicians, "London");

        uppercaseMusiciansFromCity(tracks);

    }

    private static List<Track> initTracks() {
        return Arrays.asList(
                new Track("Babies on fire"),
                new Track("compound"),
                new Track("link"),
                new Track("consist"),
                new Track("decompound"),
                new Track("composite"),
                new Track("complex"),
                new Track("delimit"),
                new Track("be"),
                new Track("constitute"),
                new Track("make"),
                new Track("up"),
                new Track("make"),
                new Track("on"),
                new Track("break"),
                new Track("do"),
                new Track("get")
        );
    }

    private static List<Musician> initMusicians() {
        List<Musician> musicians = Arrays.asList(
                new Musician("Daniel", "London"),
                new Musician("Kalvin", "Boston"),
                new Musician("Sarah", "New York"),
                new Musician("Elizabeth", "London")
        );
        return musicians;
    }

    private static void musiciansFromCityCount(List<Musician> musicians, String city) {
        long count = musicians.stream()
                .filter(artist -> artist.isFrom(city))
                .count();
        System.out.println("musiciansFromCityCount : " + city + " : " + count);
    }

    private static void printMusiciansFromCity(List<Musician> musicians, String city) {
        long count = musicians.stream()
                .filter(artist -> {
                    System.out.println(artist.getName() + " : " + artist.getOrigin());
                    return artist.isFrom(city);
                })
                .count();
        System.out.println("printMusiciansFromCity : " + city + " : " + count);
    }

    private static void filterMusiciansFromCity(List<Musician> musicians, String city) {
        Stream<Musician> filter = musicians.stream()
                .filter(artist -> {
                    System.out.println(artist.getName() + " : " + artist.getOrigin());
                    return artist.isFrom(city);
                });
        System.out.println("filterMusiciansFromCity : " + city + " : " + filter);
    }

    private static void collectMusiciansFromCity(List<Musician> musicians, String city) {
        List<Musician> collectedMusicians = musicians.stream()
                .filter(artist -> artist.isFrom(city))
                .collect(Collectors.toList());
        System.out.println("collectMusiciansFromCity : " + city + " : " + collectedMusicians);
    }

    private static void uppercaseMusiciansFromCity(List<Track> tracks) {
        List<String> collectedMusicians = tracks.stream()
                .map(record -> record.getName().toUpperCase())
                .collect(Collectors.toList());
        System.out.println("uppercaseMusiciansFromCity : " + collectedMusicians);
    }
}
