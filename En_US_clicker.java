import java.awt.*;
import java.awt.event.InputEvent;
import java.util.Scanner;

public class En_US_clicker {
    public static void main(String[] args)throws AWTException {
        Robot bot = new Robot();
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello! Enter delay between clicks(ms)");
        int Delay = scan.nextInt();
        System.out.println("Choose how many clicks will be made endlessly if 0");
        int Clicks = scan.nextInt();
        int i = 0;
        bot.delay(2000);
        if (Clicks == 0){
            while(true){
            bot.mousePress(InputEvent.BUTTON1_MASK);
            bot.mouseRelease(InputEvent.BUTTON1_MASK);
            }
        }
        while (i < Clicks){
            bot.delay(Delay);
            bot.mousePress(InputEvent.BUTTON1_MASK);
            bot.mouseRelease(InputEvent.BUTTON1_MASK);
            i += 1;
        }

    }
}
