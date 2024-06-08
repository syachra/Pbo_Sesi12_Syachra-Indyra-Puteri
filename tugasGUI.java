import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author HP
 */
public class tugasGUI extends JFrame{
    private JTextField display;
    
    public tugasGUI() {
        //  Mengatur judul jendela
        setTitle("Calculator");
        // Mengatur operasi default saat jendela ditutup
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Mengatur manajer tata letak
        setLayout(new BorderLayout());

        // Membuat text field tampilan
        display = new JTextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        // Membuat panel untuk tombol-tombol
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 4));

        // Menambahkan tombol-tombol ke panel
        String[] buttons = {
            "1", "2", "3", "4", "5", "6",
            "7", "8", "9", "0", "+", "-",
            "*", "/", "%", "=", "Mod", "Exit"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);

        // Mengatur ukuran jendela
        setSize(400, 250);
        // Membuat jendela terlihat
        setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("Exit")) {
                System.exit(0);
            } else {
                display.setText(display.getText() + command);
            }
        }
    }

    public static void main(String[] args) {
        // Membuat dan menampilkan tata letak calculator
        new tugasGUI();
    }
}



    

