// Adapter Pattern to unify different music sources
interface MusicSource {
    void play();
}

class LocalFilePlayer {
    void playLocalFile() {
        System.out.println("Playing music from local files");
    }
}

class OnlineStreamingService {
    void streamOnline() {
        System.out.println("Streaming music online");
    }
}

class RadioStation {
    void playRadio() {
        System.out.println("Playing music from radio station");
    }
}

// Adapters
class LocalFileAdapter implements MusicSource {
    private final LocalFilePlayer localFilePlayer;
    
    public LocalFileAdapter(LocalFilePlayer localFilePlayer) {
        this.localFilePlayer = localFilePlayer;
    }
    
    @Override
    public void play() {
        localFilePlayer.playLocalFile();
    }
}

class OnlineStreamingAdapter implements MusicSource {
    private final OnlineStreamingService streamingService;
    
    public OnlineStreamingAdapter(OnlineStreamingService streamingService) {
        this.streamingService = streamingService;
    }
    
    @Override
    public void play() {
        streamingService.streamOnline();
    }
}

class RadioAdapter implements MusicSource {
    private final RadioStation radioStation;
    
    public RadioAdapter(RadioStation radioStation) {
        this.radioStation = radioStation;
    }
    
    @Override
    public void play() {
        radioStation.playRadio();
    }
}

// Facade Pattern to simplify access
class MusicPlayerFacade {
    private final MusicSource localMusic;
    private final MusicSource onlineStreaming;
    private MusicSource radio;
    
    public MusicPlayerFacade() {
        this.localMusic = new LocalFileAdapter(new LocalFilePlayer());
        this.onlineStreaming = new OnlineStreamingAdapter(new OnlineStreamingService());
        this.radio = new RadioAdapter(new RadioStation());
    }

    public MusicPlayerFacade(MusicSource localMusic, MusicSource onlineStreaming, MusicSource radio) {
        this.localMusic = localMusic;
        this.onlineStreaming = onlineStreaming;
        this.radio = radio;
    }
    
    public void playLocalMusic() {
        localMusic.play();
    }
    
    public void playOnlineMusic() {
        onlineStreaming.play();
    }
    
    public void playRadioMusic() {
        radio.play();
    }
}

// Main application
public class MusicStreamingApp {
    public static void main(String[] args) {
        MusicPlayerFacade musicPlayer = new MusicPlayerFacade();
        
        musicPlayer.playLocalMusic();
        musicPlayer.playOnlineMusic();
        musicPlayer.playRadioMusic();
    }
}
