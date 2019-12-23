import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TicTacToe extends JPanel {
    JButton buttons[] = new JButton[9];
    int alternate = 0;// if this number is a even, then put a X. If it's odd, then put an O

    public TicTacToe() {
        setLayout(new GridLayout(3, 3));
        initializebuttons();
    }

    public void initializebuttons() {
        // ...
    }

    public void resetButtons() {
        // ...
    }

    private class buttonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            // ...
        }

        public boolean checkForWin() {
            // ...
        }

        public boolean checkAdjacent(int a, int b) {
            // ...
        }

    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Tic-Tac-Toe");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().add(new TicTacToe());
        window.setBounds(300, 200, 300, 300);
        window.setVisible(true);
    }
}