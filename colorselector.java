// Exercise 10.11 solution
// ColorSelect.java
// This program creates a simple GUI
import java.awt.*;
import javax.swing.*;

public class ColorSelect extends JFrame {
   private JButton ok, cancel; 
   private JCheckBox b, f;
   private JComboBox colorList;
   private JPanel p, p1;

   public ColorSelect()
   {
      super( "ColorSelect" );

      // north
      colorList = new JComboBox();
      colorList.addItem( "RED" );
      getContentPane().add( colorList, BorderLayout.NORTH );

      // center
      p = new JPanel();
      b = new JCheckBox( "background" );
      f = new JCheckBox( "foreground" );
      p.add( b );
      p.add( f );
      getContentPane().add( p, BorderLayout.CENTER );

      // south
      ok = new JButton( "Ok" );
      cancel = new JButton( "Cancel" );
      p1 = new JPanel();
      p1.add( ok );
      p1.add( cancel );
      getContentPane().add( p1, BorderLayout.SOUTH );

      setSize( 300, 125 );
      show();
   }

   public static void main( String args[] )
   {
      new ColorSelect();
   }
}

