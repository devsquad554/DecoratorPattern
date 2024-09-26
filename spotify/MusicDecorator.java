public abstract class MusicDecorator implements MusicStreamingService {
    protected MusicStreamingService musicService;

    public MusicDecorator(MusicStreamingService musicService) {
        this.musicService = musicService;
    }

    @Override
    public String play(String song) {
        return musicService.play(song);
    }
}
