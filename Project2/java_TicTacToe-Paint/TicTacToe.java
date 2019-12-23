import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Random;

public class TicTacToe extends JFrame implements ActionListener {
  private JButton oButton, xButton;
  private Board board;
  private int lineThickness=4;
  private Color oColor=Color.BLUE, xColor=Color.RED;
  static final char BLANK=' ', O='O', X='X';
  private char position[]={  // Board position (BLANK, O, or X)
    BLANK, BLANK, BLANK,
    BLANK, BLANK, BLANK,
    BLANK, BLANK, BLANK};
  private int wins=0, losses=0, draws=0;  // game count by user

  // Start the game
  public static void main(String args[]) {
    new TicTacToe();
  }

  // Initialize
  public TicTacToe() {
    super("Tic Tac Toe demo"); // set title
    add(board=new Board(), BorderLayout.CENTER);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500, 500);
    setVisible(true);
  }

  // Change color of O or X
  public void actionPerformed(ActionEvent e) {
    // ...
  }

  // Board is what actually plays and displays the game
  private class Board extends JPanel implements MouseListener {
    private Random random=new Random();
    private int rows[][]={{0,2},{3,5},{6,8},{0,6},{1,7},{2,8},{0,8},{2,6}};
      // Endpoints of the 8 rows in position[] (across, down, diagonally)

    public Board() {
      addMouseListener(this);
    }

    // Redraw the board
    public void paintComponent(Graphics g) {
      // ...
    }

    // Draw an O where the mouse is clicked
    public void mouseClicked(MouseEvent e) {
      // ...
    }

    // Ignore other mouse events
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    // Computer plays X
    void putX() {
      // ...
    }

    // Return true if player has won
    boolean won(char player) {
      // ...
    }

    // Has player won in the row from position[a] to position[b]?
    boolean testRow(char player, int a, int b) {
      // ...
    }

    // Play X in the best spot
    void nextMove() {
      // ...
    }

    // Return 0-8 for the position of a blank spot in a row if the
    // other 2 spots are occupied by player, or -1 if no spot exists
    int findRow(char player) {
      // ...
    }

    // If 2 of 3 spots in the row from position[a] to position[b]
    // are occupied by player and the third is blank, then return the
    // index of the blank spot, else return -1.
    int find1Row(char player, int a, int b) {
      // ...
    }

    // Are all 9 spots filled?
    boolean isDraw() {
      // ...
    }

    // Start a new game
    void newGame(char winner) {
      // ...
    }
  } // end inner class Board
} // end class TicTacToe
