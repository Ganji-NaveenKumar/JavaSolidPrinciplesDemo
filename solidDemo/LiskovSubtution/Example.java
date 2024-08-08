package solidDemo.LiskovSubtution;
class MediaFile {
    public void play() {
        System.out.println("Playing media file");
    }
}
class VideoFile extends MediaFile {
    @Override
    public void play() {
        // Play video
        System.out.println("Playing video");
    }
}

class AudioFile extends MediaFile {
    @Override
    public void play() {
        // Play audio
        System.out.println("Playing Audio");
    }
}

class SubtitleFile extends MediaFile {
    @Override
    public void play() {
       System.out.println("Playing subtitle");
    }
}
public class Example {
    public static void main(String[] args) {
        MediaFile mf = new MediaFile();
        mf.play();
        VideoFile vf = new VideoFile();
        vf.play();
        AudioFile af = new AudioFile();
        af.play();
        SubtitleFile sf = new SubtitleFile();
        sf.play();
    }
}
