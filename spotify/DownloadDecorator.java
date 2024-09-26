public class DownloadDecorator extends MusicDecorator {

    public DownloadDecorator(MusicStreamingService musicService) {
        super(musicService);
    }

    @Override
    public String play(String song) {
        return super.play(song) + " Downloading " + song + " for offline listening.";
    }
}
