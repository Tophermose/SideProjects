import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;

public class TypeChartGammaMac extends JFrame {
   private final int WINDOW_WIDTH = 300;
   private final int WINDOW_HEIGHT = 400;
   private ButtonListener buttonListener;
   private JLabel messageLabel;
   private JButton j;
   private JTextField output;
   private String inputFile;
   private HashMap<Integer, String> map = new HashMap<Integer, String>();
   private JPanel panel;
   private ArrayList<JButton> arraylist = new ArrayList<JButton>();
   
   public TypeChartGammaMac() throws IOException {
      buttonListener = new ButtonListener();  

      output = new JTextField(11);
      output.setHorizontalAlignment(JTextField.RIGHT);
		output.setEditable(false);
      
      File file = new File(".//typechart.txt");
      //"//Users//matthewjoseph//Documents//Comp Prog 210 Stuff//typechart.txt"
   
      Scanner reader = new Scanner(file);
   
      while(reader.hasNext()) {
         
         for(int i = 0; i < 18; i++) {
            inputFile = reader.nextLine();
            map.put(i,inputFile);
            String g = Integer.toString(i);
            String h = map.get(i).toString();
            arraylist.add(new JButton(h));            
            arraylist.get(i).addActionListener(buttonListener);
         }
      }  
      
      windowInit();
   }
   
   private class ButtonListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         String str = e.getActionCommand();
         output.setText(str);
         String type = output.getText();
         
         for(int i = 0; i < 18; i++) {
            arraylist.get(i).setOpaque(true);
            arraylist.get(i).setBackground(null);
            arraylist.get(i).setBorder(new LineBorder(null, 0));
            arraylist.get(i).setForeground(Color.BLACK);
         }
                  
         switch (type) {
      
            case ("Normal"):
               arraylist.get(1).setBackground(Color.RED);
               arraylist.get(5).setBackground(Color.ORANGE);
               arraylist.get(7).setBackground(Color.BLACK);
               arraylist.get(7).setForeground(Color.WHITE);
               arraylist.get(8).setBackground(Color.ORANGE);
               break;
            
            case ("Fight"):
               arraylist.get(0).setBackground(Color.GREEN);
               arraylist.get(2).setBackground(Color.ORANGE);
               arraylist.get(2).setBorder(new LineBorder(Color.RED, 5));
               arraylist.get(3).setBackground(Color.ORANGE);
               arraylist.get(5).setBackground(Color.GREEN);
               arraylist.get(6).setBackground(Color.ORANGE);;
               arraylist.get(8).setBackground(Color.GREEN);
               arraylist.get(13).setBackground(Color.ORANGE);
               arraylist.get(13).setBorder(new LineBorder(Color.RED, 5));
               arraylist.get(14).setBackground(Color.GREEN);
               arraylist.get(16).setBackground(Color.GREEN);
               arraylist.get(17).setBackground(Color.ORANGE);
               arraylist.get(17).setBorder(new LineBorder(Color.RED, 5));
               break;
               
             case ("Flying"):
               arraylist.get(1).setBackground(Color.GREEN);
               arraylist.get(5).setBackground(Color.ORANGE);
               arraylist.get(5).setBorder(new LineBorder(Color.RED, 5));
               arraylist.get(6).setBackground(Color.GREEN);
               arraylist.get(8).setBackground(Color.ORANGE);
               arraylist.get(11).setBackground(Color.GREEN);
               arraylist.get(12).setBackground(Color.ORANGE);
               arraylist.get(12).setBorder(new LineBorder(Color.RED, 5));
               arraylist.get(14).setBackground(Color.RED);
               break;
   
            case ("Poison"):
               arraylist.get(3).setBackground(Color.ORANGE);
               arraylist.get(4).setBackground(Color.ORANGE);
               arraylist.get(4).setBorder(new LineBorder(Color.RED, 5));
               arraylist.get(5).setBackground(Color.ORANGE);
               arraylist.get(7).setBackground(Color.ORANGE);
               arraylist.get(8).setBackground(Color.BLACK);
               arraylist.get(8).setForeground(Color.WHITE);
               arraylist.get(11).setBackground(Color.GREEN);
               arraylist.get(12).setBackground(Color.GREEN);
               arraylist.get(13).setBackground(Color.RED);
               break;
   
            case ("Ground"):
               arraylist.get(2).setBackground(Color.BLACK);
               arraylist.get(2).setForeground(Color.WHITE);
               arraylist.get(3).setBackground(Color.GREEN);
               arraylist.get(5).setBackground(Color.GREEN);
               arraylist.get(6).setBackground(Color.ORANGE);
               arraylist.get(8).setBackground(Color.GREEN);
               arraylist.get(9).setBackground(Color.GREEN);
               arraylist.get(10).setBackground(Color.RED);
               arraylist.get(11).setBackground(Color.ORANGE);
               arraylist.get(11).setBorder(new LineBorder(Color.RED, 5));
               arraylist.get(12).setBackground(Color.GREEN);
               arraylist.get(14).setBackground(Color.RED);
               break;
   
            case ("Rock"):
               arraylist.get(1).setBackground(Color.ORANGE);
               arraylist.get(1).setBorder(new LineBorder(Color.RED, 5));
               arraylist.get(2).setBackground(Color.GREEN);
               arraylist.get(4).setBackground(Color.ORANGE);
               arraylist.get(4).setBorder(new LineBorder(Color.RED, 5));
               arraylist.get(6).setBackground(Color.GREEN);
               arraylist.get(8).setBackground(Color.ORANGE);
               arraylist.get(8).setBorder(new LineBorder(Color.RED, 5));
               arraylist.get(9).setBackground(Color.GREEN);
               arraylist.get(10).setBackground(Color.RED);
               arraylist.get(11).setBackground(Color.RED);
               arraylist.get(14).setBackground(Color.GREEN);
               break;
   
            case ("Bug"):
               arraylist.get(1).setBackground(Color.ORANGE);
               arraylist.get(2).setBackground(Color.ORANGE);
               arraylist.get(2).setBorder(new LineBorder(Color.RED, 5));
               arraylist.get(3).setBackground(Color.ORANGE);
               arraylist.get(5).setBackground(Color.RED);
               arraylist.get(7).setBackground(Color.ORANGE);
               arraylist.get(8).setBackground(Color.ORANGE);
               arraylist.get(9).setBackground(Color.ORANGE);
               arraylist.get(9).setBorder(new LineBorder(Color.RED, 5));
               arraylist.get(11).setBackground(Color.GREEN);
               arraylist.get(13).setBackground(Color.GREEN);
               arraylist.get(16).setBackground(Color.GREEN);
               arraylist.get(17).setBackground(Color.ORANGE);
               break;
   
            case ("Ghost"):
               arraylist.get(7).setBackground(Color.GREEN);
               arraylist.get(7).setBorder(new LineBorder(Color.RED, 5));
               arraylist.get(13).setBackground(Color.GREEN);
               arraylist.get(16).setBackground(Color.ORANGE);
               arraylist.get(16).setBorder(new LineBorder(Color.RED, 5));
               break; 
               
            case("Steel"):
               arraylist.get(1).setBackground(Color.RED);
               arraylist.get(4).setBackground(Color.RED);
               arraylist.get(5).setBackground(Color.GREEN);
               arraylist.get(8).setBackground(Color.ORANGE);
               arraylist.get(9).setBackground(Color.ORANGE);
               arraylist.get(9).setBorder(new LineBorder(Color.RED, 5));
               arraylist.get(10).setBackground(Color.ORANGE);
               arraylist.get(12).setBackground(Color.ORANGE);
               arraylist.get(14).setBackground(Color.GREEN);
               arraylist.get(17).setBackground(Color.GREEN);
               break;
   
            case ("Fire"):
               arraylist.get(4).setBackground(Color.RED);
               arraylist.get(5).setBackground(Color.ORANGE);
               arraylist.get(5).setBorder(new LineBorder(Color.RED, 5));
               arraylist.get(6).setBackground(Color.GREEN);
               arraylist.get(8).setBackground(Color.GREEN);
               arraylist.get(9).setBackground(Color.ORANGE);
               arraylist.get(10).setBackground(Color.ORANGE);
               arraylist.get(10).setBorder(new LineBorder(Color.RED, 5));
               arraylist.get(11).setBackground(Color.GREEN);
               arraylist.get(14).setBackground(Color.GREEN);
               arraylist.get(15).setBackground(Color.ORANGE);
               break;
   
            case ("Water"):
               arraylist.get(4).setBackground(Color.GREEN);
               arraylist.get(5).setBackground(Color.GREEN);
               arraylist.get(9).setBackground(Color.GREEN);
               arraylist.get(10).setBackground(Color.ORANGE);
               arraylist.get(11).setBackground(Color.ORANGE);
               arraylist.get(11).setBorder(new LineBorder(Color.RED, 5));
               arraylist.get(12).setBackground(Color.RED);
               arraylist.get(15).setBackground(Color.ORANGE);
               break;
   
            case ("Grass"): 
               arraylist.get(2).setBackground(Color.ORANGE);
               arraylist.get(2).setBorder(new LineBorder(Color.RED, 5));
               arraylist.get(3).setBackground(Color.ORANGE);
               arraylist.get(3).setBorder(new LineBorder(Color.RED, 5));
               arraylist.get(4).setBackground(Color.GREEN);
               arraylist.get(5).setBackground(Color.GREEN);
               arraylist.get(6).setBackground(Color.ORANGE);
               arraylist.get(8).setBackground(Color.ORANGE);
               arraylist.get(9).setBackground(Color.ORANGE);
               arraylist.get(9).setBorder(new LineBorder(Color.RED, 5));
               arraylist.get(10).setBackground(Color.GREEN);
               arraylist.get(11).setBackground(Color.ORANGE);
               arraylist.get(14).setBackground(Color.RED);
               arraylist.get(15).setBackground(Color.ORANGE);
               break;
   
            case ("Electric"): 
               arraylist.get(2).setBackground(Color.GREEN);
               arraylist.get(4).setBackground(Color.RED);
               arraylist.get(4).setBorder(new LineBorder(Color.BLACK, 5));
               arraylist.get(10).setBackground(Color.GREEN);
               arraylist.get(11).setBackground(Color.ORANGE);
               arraylist.get(12).setBackground(Color.ORANGE);
               arraylist.get(15).setBackground(Color.ORANGE);
               break;
   
            case ("Psychic"):
               arraylist.get(1).setBackground(Color.GREEN);
               arraylist.get(3).setBackground(Color.GREEN);
               arraylist.get(6).setBackground(Color.RED);
               arraylist.get(7).setBackground(Color.RED);
               arraylist.get(8).setBackground(Color.ORANGE);
               arraylist.get(13).setBackground(Color.ORANGE);
               arraylist.get(16).setBackground(Color.RED);
               arraylist.get(16).setBorder(new LineBorder(Color.BLACK, 5));
               break;
   
            case ("Ice"):
               arraylist.get(1).setBackground(Color.RED);
               arraylist.get(2).setBackground(Color.GREEN);
               arraylist.get(3).setBackground(Color.GREEN);
               arraylist.get(5).setBackground(Color.RED);
               arraylist.get(8).setBackground(Color.ORANGE);
               arraylist.get(9).setBackground(Color.ORANGE);
               arraylist.get(9).setBorder(new LineBorder(Color.RED, 5));
               arraylist.get(10).setBackground(Color.ORANGE);
               arraylist.get(11).setBackground(Color.GREEN);
               arraylist.get(14).setBackground(Color.ORANGE);
               arraylist.get(15).setBackground(Color.GREEN);
               break;
   
            case("Dragon"):
               arraylist.get(8).setBackground(Color.ORANGE);
               arraylist.get(15).setBackground(Color.GREEN);
               arraylist.get(15).setBorder(new LineBorder(Color.RED, 5));
               arraylist.get(17).setBackground(Color.BLACK);
               arraylist.get(17).setForeground(Color.WHITE);
               break;
   
            case ("Dark"):
               arraylist.get(1).setBackground(Color.ORANGE);
               arraylist.get(1).setBorder(new LineBorder(Color.RED, 5));
               arraylist.get(7).setBackground(Color.GREEN);
               arraylist.get(13).setBackground(Color.GREEN);
               arraylist.get(17).setBackground(Color.ORANGE);
               arraylist.get(17).setBorder(new LineBorder(Color.RED, 5));
               break;
   
            case ("Fairy"):
               arraylist.get(1).setBackground(Color.GREEN);
               arraylist.get(3).setBackground(Color.ORANGE);
               arraylist.get(3).setBorder(new LineBorder(Color.RED, 5));
               arraylist.get(8).setBackground(Color.ORANGE);
               arraylist.get(8).setBorder(new LineBorder(Color.RED, 5));
               arraylist.get(9).setBackground(Color.ORANGE);
               arraylist.get(15).setBackground(Color.GREEN);
               arraylist.get(16).setBackground(Color.GREEN);
               break;
         } 
      }
   }
   
   private void windowInit() {
      setTitle("Pokemon Type Chart");
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new BorderLayout());
      
      panel = new JPanel();
      panel.setLayout(new GridLayout(0, 3));
      add(panel);
      for(int i = 0; i < 18; i++) {
         panel.add(arraylist.get(i));
      }
            
      setLocationRelativeTo(null);
      setVisible(true);
   }
   
   public static void main(String[] args) throws IOException {
      new TypeChartGammaMac();
      /*UIManager.setLookAndFeel(
         UIManager.getCrossPlatformLookAndFeelClassName());*/
   }
}