import java.awt.*;
class LabelEx{
	public static void main(String[] args) {
		Frame f=new Frame();
		Label l1, l2, l3;
		l1=new Label("Lable one");
        l1.setBounds(80,100,80,30);
		l2=new Label("Label two");
		l2.setBounds(80,150,80,30);
		l3=new Label("Label two");
		l3.setBounds(80,200,80,30);
		f.add(l1);f.add(l2);f.add(l3);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
}