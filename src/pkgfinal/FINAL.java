/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

/**
 *
 * @author user
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 A5_Space Jane Lu
 Thursday May 30th 
 Use will use the program to play the game Space Invaders
 */
public class FINAL extends JPanel implements ActionListener, MouseListener {

    int turn1 = 0;
    String winner;
    Button nextplayer; //declares the buttom to convert from binomial to decimal
    Button exit;
    Button replay;
    Button outcome;
    boolean notclick = true;
    int totalscore1 = 0;
    int totalscore2 = 0;
    int turn = -1;
    int score1 = 0;//to add on player1's score
    int score2 = 0;//to add on player2's score
    int grid[] = new int[16];//use the array to store number in each box
    Font font = new Font("Arial", Font.BOLD, 50); //set the font to display the point user win
    Font font1 = new Font("Arial", Font.BOLD, 20);//set the font to display the point turn of this turn
    boolean stop = false;//to check whether stop the game
    String theText = "Tic Tac Toe Game!";//input on the frame that this is a program which converts different base of numbers
    String theText1;
    boolean line = true;
    boolean string = true;

    public FINAL() {// add the listener
        JOptionPane.showMessageDialog(null, "<html><b>Rules For Tic Tac Toe</b></html>\n"
                + "\n"
                + "Player1 is X, player2 is O. Players take turns putting their marks in empty squares.\n"
                + "Move the mouse in the empty grid and click to draw image.\n"
                + "<html><b>REMEMBER:<b><html>\n"
                + "The first player to get 3 of her marks in a row (up, down, across, or diagonally) is the winner.\n"
                + "When all 9 squares are full, the game is over. If no player has 3 marks in a row, the game ends in a tie.\n"
                + "\n"
                + "Click OK to begin the game.\n"
                + "Click Exit button to exit the game.\n"
                + "Click Restart button to restart the game.\n"
                + "Click Score button to check your score whenever you want and click again to continue the game.\n");
        nextplayer = new Button("Next");// button class is used to create a labeled button: btdButton
        nextplayer.addActionListener(this); // means that the actions for this ActionListener can be found in this class:  A2_Bin 
        exit = new Button("Exit");// button class is used to create a labeled button: btdButton
        exit.addActionListener(this); // means that the actions for this ActionListener can be found in this class:  A2_Bin 
        replay = new Button("Restart");// button class is used to create a labeled button: btdButton
        replay.addActionListener(this); // means that the actions for this ActionListener can be found in this class:  A2_Bin 
        outcome = new Button("Score");// button class is used to create a labeled button: btdButton
        outcome.addActionListener(this); // means that the actions for this ActionListener can be found in this class:  A2_Bin 
        add(nextplayer);//use add() method to add button on the frame
        add(exit);
        add(replay);
        add(outcome);
        addMouseListener(this);
    }

    public void actionPerformed(ActionEvent e) // this method responds to clicking a button
    {
        if (e.getActionCommand().equals("Next")) {//if the mouse click on "Exit"
            turn1++;
            notclick = true;
        } else if (e.getActionCommand().equals("Exit")) {//if the mouse click on "Exit"
            System.exit(0);
        } else if (e.getActionCommand().equals("Restart")) {//if the mouse click on "Exit"
            stop = false;
            line = true;
            for (int i = 0; i < 16; i++) {
                grid[i] = 0;
            }
            score1 = 0;
            score2 = 0;
            turn1 = 0;
        } else if (e.getActionCommand().equals("Score")) {
            turn++;
            if (turn % 2 == 0) {
                theText = "Score";
            } else if (turn % 2 == 1) {
                theText = "Tic Tac Toe";
            }
        }
        repaint(); // call paintComponent and update the frame by redrawing it
    }

    public void mouseClicked(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(Color.BLACK);

        if (stop == false) {
            if (turn1 % 2 == 1) {
                if (e.getX() > 100 & e.getX() < 200 && e.getY() > 200 && e.getY() < 300 && grid[0] != 1 && notclick == true) {
                    g.drawOval(100, 200, 100, 100);
                    grid[0] = 2;
                }
                if (e.getX() > 200 & e.getX() < 300 && e.getY() > 200 && e.getY() < 300 && grid[1] != 1 && notclick == true) {
                    g.drawOval(200, 200, 100, 100);
                    grid[1] = 2;
                }
                if (e.getX() > 300 & e.getX() < 400 && e.getY() > 200 && e.getY() < 300 && grid[2] != 1 && notclick == true) {
                    g.drawOval(300, 200, 100, 100);
                    grid[2] = 2;
                }
                if (e.getX() > 100 & e.getX() < 200 && e.getY() > 300 && e.getY() < 400 && grid[3] != 1 && notclick == true) {
                    g.drawOval(100, 300, 100, 100);
                    grid[3] = 2;
                }
                if (e.getX() > 200 & e.getX() < 300 && e.getY() > 300 && e.getY() < 400 && grid[4] != 1 && notclick == true) {
                    g.drawOval(200, 300, 100, 100);
                    grid[4] = 2;
                }
                if (e.getX() > 300 & e.getX() < 400 && e.getY() > 300 && e.getY() < 400 && grid[5] != 1 && notclick == true) {
                    g.drawOval(300, 300, 100, 100);
                    grid[5] = 2;
                }
                if (e.getX() > 100 & e.getX() < 200 && e.getY() > 400 && e.getY() < 500 && grid[6] != 1 && notclick == true) {
                    g.drawOval(100, 400, 100, 100);
                    grid[6] = 2;
                }
                if (e.getX() > 200 & e.getX() < 300 && e.getY() > 400 && e.getY() < 500 && grid[7] != 1 && notclick == true) {
                    g.drawOval(200, 400, 100, 100);
                    grid[7] = 2;
                }
                if (e.getX() > 300 & e.getX() < 400 && e.getY() > 400 && e.getY() < 500 && grid[8] != 1 && notclick == true) {
                    g.drawOval(300, 400, 100, 100);
                    grid[8] = 2;
                }
                if (e.getX() > 400 & e.getX() < 500 && e.getY() > 200 && e.getY() < 300 && grid[9] != 1 && notclick == true) {
                    g.drawOval(400, 200, 100, 100);
                    grid[9] = 2;
                }
                if (e.getX() > 400 & e.getX() < 500 && e.getY() > 300 && e.getY() < 400 && grid[10] != 1 && notclick == true) {
                    g.drawOval(400, 300, 100, 100);
                    grid[10] = 2;
                }
                if (e.getX() > 400 & e.getX() < 500 && e.getY() > 400 && e.getY() < 500 && grid[11] != 1 && notclick == true) {
                    g.drawOval(400, 400, 100, 100);
                    grid[11] = 2;
                }
                if (e.getX() > 400 & e.getX() < 500 && e.getY() > 500 && e.getY() < 600 && grid[12] != 1 && notclick == true) {
                    g.drawOval(400, 500, 100, 100);
                    grid[12] = 2;
                }
                if (e.getX() > 100 & e.getX() < 200 && e.getY() > 500 && e.getY() < 600 && grid[13] != 1 && notclick == true) {
                    g.drawOval(100, 500, 100, 100);
                    grid[13] = 2;
                }
                if (e.getX() > 200 & e.getX() < 300 && e.getY() > 500 && e.getY() < 600 && grid[14] != 1 && notclick == true) {
                    g.drawOval(200, 500, 100, 100);
                    grid[14] = 2;
                }
                if (e.getX() > 300 & e.getX() < 400 && e.getY() > 500 && e.getY() < 600 && grid[15] != 1 && notclick == true) {
                    g.drawOval(300, 500, 100, 100);
                    grid[15] = 2;
                }
                notclick = false;
            } else if (turn1 % 2 == 0) {
                if (e.getX() > 100 & e.getX() < 200 && e.getY() > 200 && e.getY() < 300 && grid[0] != 2 && notclick == true) {
                    g.drawLine(100, 200, 200, 300);
                    g.drawLine(200, 200, 100, 300);
                    grid[0] = 1;
                }
                if (e.getX() > 200 & e.getX() < 300 && e.getY() > 200 && e.getY() < 300 && grid[1] != 2 && notclick == true) {
                    g.drawLine(200, 200, 300, 300);
                    g.drawLine(300, 200, 200, 300);
                    grid[1] = 1;
                }
                if (e.getX() > 300 & e.getX() < 400 && e.getY() > 200 && e.getY() < 300 && grid[2] != 2 && notclick == true) {
                    g.drawLine(300, 200, 400, 300);
                    g.drawLine(400, 200, 300, 300);
                    grid[2] = 1;
                }
                if (e.getX() > 100 & e.getX() < 200 && e.getY() > 300 && e.getY() < 400 && grid[3] != 2 && notclick == true) {
                    g.drawLine(100, 300, 200, 400);
                    g.drawLine(200, 300, 100, 400);
                    grid[3] = 1;
                }
                if (e.getX() > 200 & e.getX() < 300 && e.getY() > 300 && e.getY() < 400 && grid[4] != 2 && notclick == true) {
                    g.drawLine(200, 300, 300, 400);
                    g.drawLine(300, 300, 200, 400);
                    grid[4] = 1;
                }
                if (e.getX() > 300 & e.getX() < 400 && e.getY() > 300 && e.getY() < 400 && grid[5] != 2 && notclick == true) {
                    g.drawLine(300, 300, 400, 400);
                    g.drawLine(400, 300, 300, 400);
                    grid[5] = 1;
                }
                if (e.getX() > 100 & e.getX() < 200 && e.getY() > 400 && e.getY() < 500 && grid[6] != 2 && notclick == true) {
                    g.drawLine(100, 400, 200, 500);
                    g.drawLine(200, 400, 100, 500);
                    grid[6] = 1;
                }
                if (e.getX() > 200 & e.getX() < 300 && e.getY() > 400 && e.getY() < 500 && grid[7] != 2 && notclick == true) {
                    g.drawLine(200, 400, 300, 500);
                    g.drawLine(300, 400, 200, 500);
                    grid[7] = 1;
                }
                if (e.getX() > 300 & e.getX() < 400 && e.getY() > 400 && e.getY() < 500 && grid[8] != 2 && notclick == true) {
                    g.drawLine(300, 400, 400, 500);
                    g.drawLine(400, 400, 300, 500);
                    grid[8] = 1;
                }
                if (e.getX() > 400 & e.getX() < 500 && e.getY() > 200 && e.getY() < 300 && grid[9] != 2 && notclick == true) {
                    g.drawLine(400, 200, 500, 300);
                    g.drawLine(500, 200, 400, 300);
                    grid[9] = 1;
                }
                if (e.getX() > 400 & e.getX() < 500 && e.getY() > 300 && e.getY() < 400 && grid[10] != 2 && notclick == true) {
                    g.drawLine(400, 300, 500, 400);
                    g.drawLine(500, 300, 400, 400);
                    grid[10] = 1;
                }
                if (e.getX() > 400 & e.getX() < 500 && e.getY() > 400 && e.getY() < 500 && grid[11] != 2 && notclick == true) {
                    g.drawLine(400, 400, 500, 500);
                    g.drawLine(500, 400, 400, 500);
                    grid[11] = 1;
                }
                if (e.getX() > 400 & e.getX() < 500 && e.getY() > 500 && e.getY() < 600 && grid[12] != 2 && notclick == true) {
                    g.drawLine(400, 500, 500, 600);
                    g.drawLine(500, 500, 400, 600);
                    grid[12] = 1;
                }
                if (e.getX() > 100 & e.getX() < 200 && e.getY() > 500 && e.getY() < 600 && grid[13] != 2 && notclick == true) {
                    g.drawLine(100, 500, 200, 600);
                    g.drawLine(200, 500, 100, 600);
                    grid[13] = 1;
                }
                if (e.getX() > 200 & e.getX() < 300 && e.getY() > 500 && e.getY() < 600 && grid[14] != 2 && notclick == true) {
                    g.drawLine(200, 500, 300, 600);
                    g.drawLine(300, 500, 200, 600);
                    grid[14] = 1;
                }
                if (e.getX() > 300 & e.getX() < 400 && e.getY() > 500 && e.getY() < 600 && grid[15] != 2 && notclick == true) {
                    g.drawLine(300, 500, 400, 600);
                    g.drawLine(400, 500, 300, 600);
                    grid[15] = 1;
                }
                notclick = false;
            }
        }
    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);//clear the frame
        g.setColor(Color.white);//set the color to black
        Dimension d = this.getSize();//get the size of the frame
        g.fillRect(0, 0, d.width, d.height);//create a rectangle and fill it in black, so the whole frame will be black
        if (theText.equals("Score")) {//if the mouse click on "Convert from binomial to decimal"
            super.paintComponent(g);//clear the frame
            Color player1 = new Color(223, 221, 232);
            g.setColor(player1);//set the color to black
            g.fillRect(1000, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
            Color player11 = new Color(142, 175, 205);
            g.setColor(player11);//set the color to black
            g.fillRect(1100, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
            Color player111 = new Color(79, 134, 161);
            g.setColor(player111);//set the color to black
            g.fillRect(1200, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
            Color player1111 = new Color(43, 119, 143);
            g.setColor(player1111);//set the color to black
            g.fillRect(1300, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
            Color player11111 = new Color(11, 77, 100);
            g.setColor(player11111);//set the color to black
            g.fillRect(1400, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
            Color player2 = new Color(128, 0, 0);
            g.setColor(player2);//set the color to black
            g.fillRect(0, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
            Color player22 = new Color(158, 61, 64);
            g.setColor(player22);//set the color to black
            g.fillRect(100, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
            Color player222 = new Color(188, 122, 128);
            g.setColor(player222);//set the color to black
            g.fillRect(200, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
            Color player2222 = new Color(218, 183, 191);
            g.setColor(player2222);//set the color to black
            g.fillRect(300, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
            Color player22222 = new Color(248, 244, 255);
            g.setColor(player22222);//set the color to black
            g.fillRect(400, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
            //   totalscore1 = totalscore1 + score1;
            // totalscore2 = totalscore2 + score2;
            g.setColor(Color.RED);
            g.setFont(font1);
            g.drawString("Player1's score is: " + totalscore1, 600, 300);
            g.drawString("Player2's score is: " + totalscore2, 600, 400);
            score1 = 0;
            score2 = 0;
        } else {
            if (stop == false) {
                if (turn1 % 2 == 0) {
                    Color player1 = new Color(223, 221, 232);
                    g.setColor(player1);//set the color to black
                    g.fillRect(1400, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
                    Color player11 = new Color(142, 175, 205);
                    g.setColor(player11);//set the color to black
                    g.fillRect(1300, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
                    Color player111 = new Color(79, 134, 161);
                    g.setColor(player111);//set the color to black
                    g.fillRect(1200, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
                    Color player1111 = new Color(43, 119, 143);
                    g.setColor(player1111);//set the color to black
                    g.fillRect(1100, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
                    Color player11111 = new Color(11, 77, 100);
                    g.setColor(player11111);//set the color to black
                    g.fillRect(1000, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
                } else if (turn1 % 2 == 1) {
                    Color player2 = new Color(128, 0, 0);
                    g.setColor(player2);//set the color to black
                    g.fillRect(1400, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
                    Color player22 = new Color(158, 61, 64);
                    g.setColor(player22);//set the color to black
                    g.fillRect(1300, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
                    Color player222 = new Color(188, 122, 128);
                    g.setColor(player222);//set the color to black
                    g.fillRect(1200, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
                    Color player2222 = new Color(218, 183, 191);
                    g.setColor(player2222);//set the color to black
                    g.fillRect(1100, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
                    Color player22222 = new Color(248, 244, 255);
                    g.setColor(player22222);//set the color to black
                    g.fillRect(1000, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
                }
                int R = (int) (Math.random() * 256);
                int G = (int) (Math.random() * 256);
                int B = (int) (Math.random() * 256);
                Color randomColor = new Color(R, G, B);
                g.setColor(randomColor);//set the color to black
                g.drawRect(100, 200, 100, 100);
                g.drawRect(200, 200, 100, 100);
                g.drawRect(300, 200, 100, 100);
                g.drawRect(400, 200, 100, 100);
                g.drawRect(100, 300, 100, 100);
                g.drawRect(200, 300, 100, 100);
                g.drawRect(300, 300, 100, 100);
                g.drawRect(100, 400, 100, 100);
                g.drawRect(200, 400, 100, 100);
                g.drawRect(300, 400, 100, 100);
                g.drawRect(100, 500, 100, 100);
                g.drawRect(200, 500, 100, 100);
                g.drawRect(300, 500, 100, 100);
                g.drawRect(400, 500, 100, 100);
                g.drawRect(400, 300, 100, 100);
                g.drawRect(400, 400, 100, 100);
                g.setFont(font);
                g.drawString(theText, 200, 100);

                g.setColor(randomColor);//set the color to black
                if (grid[0] == 2) {
                    g.drawOval(100, 200, 100, 100);
                }
                if (grid[1] == 2) {
                    g.drawOval(200, 200, 100, 100);
                }
                if (grid[2] == 2) {
                    g.drawOval(300, 200, 100, 100);
                }
                if (grid[3] == 2) {
                    g.drawOval(100, 300, 100, 100);
                }
                if (grid[4] == 2) {
                    g.drawOval(200, 300, 100, 100);
                }
                if (grid[5] == 2) {
                    g.drawOval(300, 300, 100, 100);
                }
                if (grid[6] == 2) {
                    g.drawOval(100, 400, 100, 100);
                }
                if (grid[7] == 2) {
                    g.drawOval(200, 400, 100, 100);
                }
                if (grid[8] == 2) {
                    g.drawOval(300, 400, 100, 100);
                }
                if (grid[9] == 2) {
                    g.drawOval(400, 200, 100, 100);
                }
                if (grid[10] == 2) {
                    g.drawOval(400, 300, 100, 100);
                }
                if (grid[11] == 2) {
                    g.drawOval(400, 400, 100, 100);
                }
                if (grid[12] == 2) {
                    g.drawOval(400, 500, 100, 100);
                }
                if (grid[13] == 2) {
                    g.drawOval(100, 500, 100, 100);
                }
                if (grid[14] == 2) {
                    g.drawOval(200, 500, 100, 100);
                }
                if (grid[15] == 2) {
                    g.drawOval(300, 500, 100, 100);
                }
                if (grid[0] == 1) {
                    g.drawLine(100, 200, 200, 300);
                    g.drawLine(200, 200, 100, 300);
                }
                if (grid[1] == 1) {
                    g.drawLine(200, 200, 300, 300);
                    g.drawLine(300, 200, 200, 300);
                }
                if (grid[2] == 1) {
                    g.drawLine(300, 200, 400, 300);
                    g.drawLine(400, 200, 300, 300);
                }
                if (grid[3] == 1) {
                    g.drawLine(100, 300, 200, 400);
                    g.drawLine(200, 300, 100, 400);
                }
                if (grid[4] == 1) {
                    g.drawLine(200, 300, 300, 400);
                    g.drawLine(300, 300, 200, 400);
                }
                if (grid[5] == 1) {
                    g.drawLine(300, 300, 400, 400);
                    g.drawLine(400, 300, 300, 400);
                }
                if (grid[6] == 1) {
                    g.drawLine(100, 400, 200, 500);
                    g.drawLine(200, 400, 100, 500);
                }
                if (grid[7] == 1) {
                    g.drawLine(200, 400, 300, 500);
                    g.drawLine(300, 400, 200, 500);
                }
                if (grid[8] == 1) {
                    g.drawLine(300, 400, 400, 500);
                    g.drawLine(400, 400, 300, 500);
                }
                if (grid[9] == 1) {
                    g.drawLine(400, 200, 500, 300);
                    g.drawLine(500, 200, 400, 300);
                }
                if (grid[10] == 1) {
                    g.drawLine(400, 300, 500, 400);
                    g.drawLine(500, 300, 400, 400);
                }
                if (grid[11] == 1) {
                    g.drawLine(400, 400, 500, 500);
                    g.drawLine(500, 400, 400, 500);
                }
                if (grid[12] == 1) {
                    g.drawLine(400, 500, 500, 600);
                    g.drawLine(500, 500, 400, 600);
                }
                if (grid[13] == 1) {
                    g.drawLine(100, 500, 200, 600);
                    g.drawLine(200, 500, 100, 600);
                }
                if (grid[14] == 1) {
                    g.drawLine(200, 500, 300, 600);
                    g.drawLine(300, 500, 200, 600);
                }
                if (grid[15] == 1) {
                    g.drawLine(300, 500, 400, 600);
                    g.drawLine(400, 500, 300, 600);
                }
            }
            g.setColor(Color.RED);

            if (grid[0] == 1 && grid[0] == grid[1] && grid[0] == grid[2] && line == true) {
                score1 = 1;
                g.drawLine(100, 250, 400, 250);
            } else if (grid[1] == 1 && grid[1] == grid[2] && grid[1] == grid[9] && line == true) {
                score1 = 1;
                g.drawLine(200, 250, 500, 250);
            } else if (grid[3] == 1 && grid[3] == grid[4] && grid[3] == grid[5] && line == true) {
                score1 = 1;
                g.drawLine(100, 350, 400, 350);
            } else if (grid[4] == 1 && grid[4] == grid[5] && grid[4] == grid[10] && line == true) {
                score1 = 1;
                g.drawLine(200, 350, 500, 350);
            } else if (grid[6] == 1 && grid[6] == grid[7] && grid[6] == grid[8] && line == true) {
                score1 = 1;
                g.drawLine(100, 450, 400, 450);
            } else if (grid[7] == 1 && grid[7] == grid[8] && grid[8] == grid[11] && line == true) {
                score1 = 1;
                g.drawLine(200, 450, 500, 450);
            } else if (grid[13] == 1 && grid[13] == grid[14] && grid[13] == grid[15] && line == true) {
                score1 = 1;
                g.drawLine(100, 550, 400, 550);
            } else if (grid[14] == 1 && grid[14] == grid[15] && grid[14] == grid[12] && line == true) {
                score1 = 1;
                g.drawLine(200, 550, 500, 550);
            } else if (grid[0] == 1 && grid[0] == grid[3] && grid[0] == grid[6] && line == true) {
                score1 = 1;
                g.drawLine(150, 200, 150, 500);
            } else if (grid[3] == 1 && grid[3] == grid[6] && grid[3] == grid[13] && line == true) {
                score1 = 1;
                g.drawLine(150, 300, 150, 600);
            } else if (grid[1] == 1 && grid[1] == grid[4] && grid[1] == grid[7] && line == true) {
                score1 = 1;
                g.drawLine(250, 200, 250, 500);
            } else if (grid[4] == 1 && grid[4] == grid[7] && grid[4] == grid[14] && line == true) {
                score1 = 1;
                g.drawLine(250, 300, 250, 600);
            } else if (grid[2] == 1 && grid[2] == grid[5] && grid[2] == grid[8] && line == true) {
                score1 = 1;
                g.drawLine(350, 200, 350, 500);
            } else if (grid[5] == 1 && grid[5] == grid[8] && grid[5] == grid[15] && line == true) {
                score1 = 1;
                g.drawLine(350, 300, 350, 600);
            } else if (grid[9] == 1 && grid[9] == grid[10] && grid[9] == grid[11] && line == true) {
                score1 = 1;
                g.drawLine(450, 200, 450, 500);
            } else if (grid[10] == 1 && grid[10] == grid[11] && grid[10] == grid[12] && line == true) {
                score1 = 1;
                g.drawLine(450, 300, 450, 600);
            } else if (grid[1] == 1 && grid[1] == grid[5] && grid[1] == grid[11] && line == true) {
                score1 = 1;
                g.drawLine(200, 200, 500, 500);
            } else if (grid[0] == 1 && grid[0] == grid[4] && grid[0] == grid[8] && line == true) {
                score1 = 1;
                g.drawLine(100, 200, 400, 500);
            } else if (grid[4] == 1 && grid[4] == grid[8] && grid[4] == grid[12] && line == true) {
                score1 = 1;
                g.drawLine(200, 300, 500, 600);
            } else if (grid[3] == 1 && grid[3] == grid[7] && grid[3] == grid[15] && line == true) {
                score1 = 1;
                g.drawLine(100, 300, 400, 600);
            } else if (grid[2] == 1 && grid[2] == grid[4] && grid[2] == grid[6] && line == true) {
                score1 = 1;
                g.drawLine(400, 200, 100, 500);
            } else if (grid[9] == 1 && grid[9] == grid[5] && grid[9] == grid[7] && line == true) {
                score1 = 1;
                g.drawLine(500, 200, 200, 500);
            } else if (grid[5] == 1 && grid[5] == grid[7] && grid[5] == grid[13] && line == true) {
                score1 = 1;
                g.drawLine(400, 300, 100, 600);
            } else if (grid[10] == 1 && grid[10] == grid[8] && grid[10] == grid[14] && line == true) {
                score1 = 1;
                g.drawLine(500, 300, 200, 600);
            } else if (grid[0] == 2 && grid[0] == grid[1] && grid[0] == grid[2] && line == true) {
                score2 = 1;
                g.drawLine(100, 250, 400, 250);
            } else if (grid[1] == 2 && grid[1] == grid[2] && grid[1] == grid[9] && line == true) {
                score2 = 1;
                g.drawLine(200, 250, 500, 250);
            } else if (grid[3] == 2 && grid[3] == grid[4] && grid[3] == grid[5] && line == true) {
                score2 = 1;
                g.drawLine(100, 350, 400, 350);
            } else if (grid[4] == 2 && grid[4] == grid[5] && grid[4] == grid[10] && line == true) {
                score2 = 1;
                g.drawLine(200, 350, 500, 350);
            } else if (grid[6] == 2 && grid[6] == grid[7] && grid[6] == grid[8] && line == true) {
                score2 = 1;
                g.drawLine(100, 450, 400, 450);
            } else if (grid[7] == 2 && grid[7] == grid[8] && grid[8] == grid[11] && line == true) {
                score2 = 1;
                g.drawLine(200, 450, 500, 450);
            } else if (grid[13] == 2 && grid[13] == grid[14] && grid[13] == grid[15] && line == true) {
                score2 = 1;
                g.drawLine(100, 550, 400, 550);
            } else if (grid[14] == 2 && grid[14] == grid[15] && grid[14] == grid[12] && line == true) {
                score2 = 1;
                g.drawLine(200, 550, 500, 550);
            } else if (grid[0] == 2 && grid[0] == grid[3] && grid[0] == grid[6] && line == true) {
                score2 = 1;
                g.drawLine(150, 200, 150, 500);
            } else if (grid[3] == 2 && grid[3] == grid[6] && grid[3] == grid[13] && line == true) {
                score2 = 1;
                g.drawLine(150, 300, 150, 600);
            } else if (grid[1] == 2 && grid[1] == grid[4] && grid[1] == grid[7] && line == true) {
                score2 = 1;
                g.drawLine(250, 200, 250, 500);
            } else if (grid[4] == 2 && grid[4] == grid[7] && grid[4] == grid[14] && line == true) {
                score2 = 1;
                g.drawLine(250, 300, 250, 600);
            } else if (grid[2] == 2 && grid[2] == grid[5] && grid[2] == grid[8] && line == true) {
                score2 = 1;
                g.drawLine(350, 200, 350, 500);
            } else if (grid[5] == 2 && grid[5] == grid[8] && grid[5] == grid[15] && line == true) {
                score2 = 1;
                g.drawLine(350, 300, 350, 600);
            } else if (grid[9] == 2 && grid[9] == grid[10] && grid[9] == grid[11] && line == true) {
                score2 = 1;
                g.drawLine(450, 200, 450, 500);
            } else if (grid[10] == 2 && grid[10] == grid[11] && grid[10] == grid[12] && line == true) {
                score2 = 1;
                g.drawLine(450, 300, 450, 600);
            } else if (grid[1] == 2 && grid[1] == grid[5] && grid[1] == grid[11] && line == true) {
                score2 = 1;
                g.drawLine(200, 200, 500, 500);
            } else if (grid[0] == 2 && grid[0] == grid[4] && grid[0] == grid[8] && line == true) {
                score2 = 1;
                g.drawLine(100, 200, 400, 500);
            } else if (grid[4] == 2 && grid[4] == grid[8] && grid[4] == grid[12] && line == true) {
                score2 = 1;
                g.drawLine(200, 300, 500, 600);
            } else if (grid[3] == 2 && grid[3] == grid[7] && grid[3] == grid[15] && line == true) {
                score2 = 1;
                g.drawLine(100, 300, 400, 600);
            } else if (grid[2] == 2 && grid[2] == grid[4] && grid[2] == grid[6] && line == true) {
                score2 = 1;
                g.drawLine(400, 200, 100, 500);
            } else if (grid[9] == 2 && grid[9] == grid[5] && grid[9] == grid[7] && line == true) {
                score2 = 1;
                g.drawLine(500, 200, 200, 500);
            } else if (grid[5] == 2 && grid[5] == grid[7] && grid[5] == grid[13] && line == true) {
                score2 = 1;
                g.drawLine(400, 300, 100, 600);
            } else if (grid[10] == 2 && grid[10] == grid[8] && grid[10] == grid[14] && line == true) {
                score2 = 1;
                g.drawLine(500, 300, 200, 600);
            }
            if (score1 > score2 && turn1 >= 5 && turn1 <= 16) {
                Color player1 = new Color(223, 221, 232);
                g.setColor(player1);//set the color to black
                g.fillRect(1400, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
                Color player11 = new Color(142, 175, 205);
                g.setColor(player11);//set the color to black
                g.fillRect(1300, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
                Color player111 = new Color(79, 134, 161);
                g.setColor(player111);//set the color to black
                g.fillRect(1200, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
                Color player1111 = new Color(43, 119, 143);
                g.setColor(player1111);//set the color to black
                g.fillRect(1100, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
                Color player11111 = new Color(11, 77, 100);
                g.setColor(player11111);//set the color to black
                g.fillRect(1000, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
                g.setColor(Color.RED);
                g.setFont(font1);
                theText1 = "Player1 is the winner.";
                g.drawString(theText1, 650, 300);
                g.drawString("Exit or replay the game.", 650, 400);
                totalscore2 = totalscore2 + score2;
                totalscore1 = totalscore1 + score1;
                stop = true;
                line = false;
            }
            if (score2 > score1 && turn1 >= 6 && turn1 <= 16) {
                Color player2 = new Color(128, 0, 0);
                g.setColor(player2);//set the color to black
                g.fillRect(1400, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
                Color player22 = new Color(158, 61, 64);
                g.setColor(player22);//set the color to black
                g.fillRect(1300, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
                Color player222 = new Color(188, 122, 128);
                g.setColor(player222);//set the color to black
                g.fillRect(1200, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
                Color player2222 = new Color(218, 183, 191);
                g.setColor(player2222);//set the color to black
                g.fillRect(1100, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
                Color player22222 = new Color(248, 244, 255);
                g.setColor(player22222);//set the color to black
                g.fillRect(1000, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
                g.setColor(Color.RED);//set the color to black
                g.setFont(font1);
                totalscore2 = totalscore2 + score2;
                totalscore1 = totalscore1 + score1;
                theText1 = "Player2 is the winner.";
                g.drawString(theText1, 650, 300);
                g.drawString("Exit or replay the game.", 650, 400);
                stop = true;
                line = false;
            }
            if (score2 == score1 && turn1 == 16) {
                super.paintComponent(g);//clear the frame
                Color player1 = new Color(223, 221, 232);
                g.setColor(player1);//set the color to black
                g.fillRect(1000, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
                Color player11 = new Color(142, 175, 205);
                g.setColor(player11);//set the color to black
                g.fillRect(1100, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
                Color player111 = new Color(79, 134, 161);
                g.setColor(player111);//set the color to black
                g.fillRect(1200, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
                Color player1111 = new Color(43, 119, 143);
                g.setColor(player1111);//set the color to black
                g.fillRect(1300, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
                Color player11111 = new Color(11, 77, 100);
                g.setColor(player11111);//set the color to black
                g.fillRect(1400, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
                Color player2 = new Color(128, 0, 0);
                g.setColor(player2);//set the color to black
                g.fillRect(0, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
                Color player22 = new Color(158, 61, 64);
                g.setColor(player22);//set the color to black
                g.fillRect(100, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
                Color player222 = new Color(188, 122, 128);
                g.setColor(player222);//set the color to black
                g.fillRect(200, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
                Color player2222 = new Color(218, 183, 191);
                g.setColor(player2222);//set the color to black
                g.fillRect(300, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
                Color player22222 = new Color(248, 244, 255);
                g.setColor(player22222);//set the color to black
                g.fillRect(400, 0, 100, 700);//create a rectangle and fill it in black, so the whole frame will be black
                g.setColor(Color.RED);
                g.setFont(font);
                theText1 = "Tie!";
                g.drawString(theText1, 700, 300);
                stop = true;
                totalscore2 = totalscore2 + score2;
                totalscore1 = totalscore1 + score1;
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tic Tac Toe Game");
        frame.getContentPane().add(new FINAL());
        frame.setSize(1500, 700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
