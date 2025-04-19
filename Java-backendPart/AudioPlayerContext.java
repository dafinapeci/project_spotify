public class AudioPlayerContext {
    private Playable strategy;

    public void setStrategy(Playable strategy) {
        this.strategy = strategy;
    }

    public void play() {
        strategy.play();
    }

    public void pause() {
        strategy.pause();
    }

    public void stop() {
        strategy.stop();
    }
}