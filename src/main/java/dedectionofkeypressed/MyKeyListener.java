package dedectionofkeypressed;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyListener implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {


        /*getKeyCode() methodu:tıklanan tuşun kodunu getirir*/
        int KeyCode = e.getKeyCode();


        /*getKeyText() methodu:tıklanan keyin, keycodeunu verdiğimizde bize key'in açıklamasını getirir*/
        String keyText = KeyEvent.getKeyText(KeyCode);
        System.out.println("Description of the pressed key:" + keyText);


        /*Java'da, geliştiricilerin JVM sonlandırılmadan önce çalıştırılması gereken bir kod parçacığını eklemesine
         izin veren "Kapatma Kancaları" adlı özel bir yapı vardır. Temizleme işlemlerini yapmak için özellikle
         kullanışlıdırlar. Bu gibi durumlarda kapatma kancalarını
        çağırmak için System.exit yöntemi kullanılır.*/


        //Program ESC tusuna basılana dek çalışsın
        while (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            System.exit(0);

        }
    }


    @Override
    public void keyReleased(KeyEvent e) {

    }

}
