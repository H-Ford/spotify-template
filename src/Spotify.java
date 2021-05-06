import java.util.List;
import java.util.Scanner;

public class Spotify {
    private static List<Artist> artistList;
    //Scanner for user input
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What do you want to do?");
        //1. Add new artist
        //2. Add Album for artist
        //3. Add song for artist
        //4. Listen to song
        //5. Listen to album
        //6. Add Song to playlist
        //7. List artists
        // etc...
        //8. Exit

        var option = 0;

        while (option != 8) {
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    addNewArtist();
                    break;

                    //other cases

                case 7:
                    System.out.println("Goodbye");
            }
        }


        //Switch statement
    }

    private static void addNewArtist() {
        var artist = new Artist();
        artistList.add(artist);
    }
}
