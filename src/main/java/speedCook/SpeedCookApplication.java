package speedCook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import speedCook.utils.AppContext;

/**
 * Speed Cook!
 *
 */
@SpringBootApplication
public class SpeedCookApplication {
    public static void main( String[] args ){
    	SpringApplication.run(AppContext.class, args);
    }
}
