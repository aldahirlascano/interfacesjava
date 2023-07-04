import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Holamundo {

    //esto fue generado desde el Holamundo.form
    private JPanel rootPanel;
    private JButton okButton;
    private JLabel resultado;
    private JTextField numero2;
    private JTextField numero1;
    int i=0;

    //esto creamos desde el form dando click derecho en el boton, create listener
    public Holamundo() {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("HOLA");
                numero1.getText();
                resultado.setText(numero1.getText()+" "+numero2.getText());

            }
        });
    }

    public static void main(String[] args) {

        //generamos un form
        JFrame frame = new JFrame("Holamundo");
        frame.setContentPane(new Holamundo().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
