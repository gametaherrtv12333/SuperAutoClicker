import java.awt.*;
import java.awt.event.InputEvent;
import java.util.Scanner;

public class Ru_ru_clicker {
    public static void main(String[] args)throws AWTException {
        Robot bot = new Robot();
        Scanner scan = new Scanner(System.in);
        System.out.println("Здравствуйте! Введите задержку между кликами");
        int Delay = scan.nextInt();
        System.out.println("Выберите количество сделаных кликов Бесконечность Если 0");
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
