import clock.Clock;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import timed.Timed;

import java.util.Date;

public class Main extends Application {

    private Timed timer = new Timed(0, 0);
    private Clock clock = new Clock(timer);
    private MediaPlayer mediaPlayer;

    private AnimationTimer animationTimer = new AnimationTimer() {
        @Override
        public void handle(long now) {
            Date time = new Date();
            timer.setTime(time.getHours(), time.getMinutes());
            if (clock.signalAlarm()) {
                System.out.println("Я будильник, я звоню! Вставай!");
                mediaPlayer.play();
            } else {
                mediaPlayer.stop();
            }
        }
    };

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        clock.setSignal(new Timed(22, 3));
        clock.setAlarm(2);
        Media media = new Media(getClass().getResource("/sound.mp3").toString());
        mediaPlayer = new MediaPlayer(media);
        animationTimer.start();
    }
}
