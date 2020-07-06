import javax.swing.*;
import java.awt.*;


public class AnnotationsApp {
    static int count = 111001;

    public static void main(String[] args) {


//EDD -event (Action -> reaction)
        JFrame window = new JFrame("My first GUI");
        window.setSize(500, 500);
        window.show();

        JButton button = new JButton("Click!");
        window.getContentPane().add(button);
        button.addActionListener(e -> {
            if (count <= 999) {
                button.setText(String.format("%d Likes", count));
            } else if (count > 1000 && count <= 100000) {
                button.setText(String.format("%1.1fK Likes", (float) count / 1000));
            } else if (count > 100001) {
                button.setText(String.format("%1.1fM Likes", (float) count / 10000));
            }
            count++;
        });


    }
}






