package sahin.three.lll;

import java.awt.Frame;
import java.awt.Lable;
import java.awt.TextField;
import java.awt.Button;

public class LOGIN
{
    public static void main (String[] args)
{
    Frame frame = new Frame("LOGIN PAGE");

    Label lbl1 = new Label("Username");
    setBounds.lbl1(200,200,100,50);
    frame.add(lbl1);

    TextField txt1 = new TextField();
    setBounds.txt1(250,200,300,50);
    frame.add(txt1);

    Label lbl2 = new Label("password");
    setBounds.lbl2(200,300,100,50);
    frame.add(lbl2);

    TextField txt2 = new TextField;
    setBounds.txt2(250,300,300,50);
    frame.add(txt2);

    frame.setSize(400,400);
    frame.setLayout(null);
    frame.setVisible(true);

}

}

