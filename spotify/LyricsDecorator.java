public class LyricsDecorator extends MusicDecorator {

    public LyricsDecorator(MusicStreamingService musicService) {
        super(musicService);
    }

    @Override
    public String play(String song) {
        return super.play(song) + " Showing lyrics for " + song + ".";
    }
}
