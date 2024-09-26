public class Main {
    public static void main(String[] args) {
        // Base service
        MusicStreamingService spotifyService = new SpotifyService();

        // Add lyrics feature to the base service
        MusicStreamingService spotifyWithLyrics = new LyricsDecorator(spotifyService);

        // Add download feature to the base service
        MusicStreamingService spotifyWithDownload = new DownloadDecorator(spotifyService);

        // Add both lyrics and download features
        MusicStreamingService fullFeaturedSpotify = new DownloadDecorator(new LyricsDecorator(spotifyService));

        // Using the services
        System.out.println(spotifyService.play("Song A"));
        System.out.println(spotifyWithLyrics.play("Song A"));
        System.out.println(spotifyWithDownload.play("Song B"));
        System.out.println(fullFeaturedSpotify.play("Song C"));
    }
}
