public class SpotifyService implements MusicStreamingService {
    @Override
    public String play(String song) {
        return "Playing " + song + " on Spotify.";
    }
}
