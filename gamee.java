import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
//<applet code="gamee" height=400 width=400></applet>
public class gamee extends Applet implements ActionListener
{
	Random r=new Random();
	int random1,random2,random3,random4,random5,random6,random7,random8,random9,random10,random11,count1=3,count2=3;
	TextField t;
	Button[] button=new Button[16];
	String s1,s2,s3,s4,s5;
	Font f1,f2,f3;
	int i,c,n;
	public void init()
	{
	 GridBagLayout gbl = new GridBagLayout();
	 GridBagConstraints gbc = new GridBagConstraints();
	 setLayout(gbl);
	 gbc.ipadx=60;
	 gbc.ipady=60;
	  t = new TextField("            RESULT HERE...    ");
	 gbc.gridx = 0;
     gbc.gridy = 0;
     gbc.gridwidth =4;
	 t.setBounds(0,0,4,2);
     add(t, gbc);
	 
	 button[0]=new Button();
	 gbc.gridx=0;
	 gbc.gridy=3;
	 gbc.gridwidth=1;
	 gbc.gridheight=1;
	 button[0].addActionListener(this);
	 add(button[0],gbc);
	 
	 button[1]=new Button();
	 gbc.gridx=1;
	 gbc.gridy=3;
	 gbc.gridwidth=1;
	 gbc.gridheight=1;
	 button[1].addActionListener(this);
	 add(button[1],gbc);
	 
	 button[2]=new Button();
	 gbc.gridx=2;
	 gbc.gridy=3;
	 gbc.gridwidth=1;
	 gbc.gridheight=1;
	 button[2].addActionListener(this);
	 add(button[2],gbc);
	 
	 button[3]=new Button();
	 gbc.gridx=3;
	 gbc.gridy=3;
	 gbc.gridwidth=1;
	 gbc.gridheight=1;
	 button[3].addActionListener(this);
	 add(button[3],gbc);
	 
	 button[4]=new Button();
	 gbc.gridx=0;
	 gbc.gridy=4;
	 gbc.gridwidth=1;
	 gbc.gridheight=1;
	 button[4].addActionListener(this);
	 add(button[4],gbc);
	 
	 button[5]=new Button();
	 gbc.gridx=1;
	 gbc.gridy=4;
	 gbc.gridwidth=1;
	 gbc.gridheight=1;
	 button[5].addActionListener(this);
	 add(button[5],gbc);
	 
	 button[6]=new Button();
	 gbc.gridx=2;
	 gbc.gridy=4;
	 gbc.gridwidth=1;
	 gbc.gridheight=1;
	 button[6].addActionListener(this);
	 add(button[6],gbc);
	 
	 button[7]=new Button();
	 gbc.gridx=3;
	 gbc.gridy=4;
	 gbc.gridwidth=1;
	 gbc.gridheight=1;
	 button[7].addActionListener(this);
	 add(button[7],gbc);
	 
	 button[8]=new Button();
	 gbc.gridx=0;
	 gbc.gridy=5;
	 gbc.gridwidth=1;
	 gbc.gridheight=1;
	 button[8].addActionListener(this);
	 add(button[8],gbc);
	 
	 button[9]=new Button();
	 gbc.gridx=1;
	 gbc.gridy=5;
	 gbc.gridwidth=1;
	 gbc.gridheight=1;
	 button[9].addActionListener(this);
	 add(button[9],gbc);
	 
	 button[10]=new Button();
	 gbc.gridx=2;
	 gbc.gridy=5;
	 gbc.gridwidth=1;
	 gbc.gridheight=1;
	 button[10].addActionListener(this);
	 add(button[10],gbc);
	 
	 button[11]=new Button();
	 gbc.gridx=3;
	 gbc.gridy=5;
	 gbc.gridwidth=1;
	 gbc.gridheight=1;
	 button[11].addActionListener(this);
	 add(button[11],gbc);
	 
	 button[12]=new Button();
	 gbc.gridx=0;
	 gbc.gridy=6;
	 gbc.gridwidth=1;
	 gbc.gridheight=1;
	 button[12].addActionListener(this);
	 add(button[12],gbc);
	 
	 button[13]=new Button();
	 gbc.gridx=1;
	 gbc.gridy=6;
	 gbc.gridwidth=1;
	 gbc.gridheight=1;
	 button[13].addActionListener(this);
	 add(button[13],gbc);
	 
	 button[14]=new Button();
	 gbc.gridx=2;
	 gbc.gridy=6;
	 gbc.gridwidth=1;
	 gbc.gridheight=1;
	 button[14].addActionListener(this);
	 add(button[14],gbc);
	 
	 button[15]=new Button();
	 gbc.gridx=3;
	 gbc.gridy=6;
	 gbc.gridwidth=1;
	 gbc.gridheight=1;
	 button[15].addActionListener(this);
	 add(button[15],gbc);
	 
	random1=r.nextInt(15);random2=r.nextInt(15);random3=r.nextInt(15);random4=r.nextInt(15);random5=r.nextInt(15);random6=r.nextInt(15);
	random7=r.nextInt(15);random8=r.nextInt(15);random9=r.nextInt(15);random10=r.nextInt(15);random11=r.nextInt(15);
	f1=new Font("Arial",Font.BOLD,20);
	f2=new Font("Elephant",Font.BOLD,40);
	f3=new Font("Arial",Font.BOLD,30);
	} 
	public void paint(Graphics g){
		g.setColor(Color.blue);
		g.setFont(f2);
		g.drawString("* * * * Guess right  * * * *",200,80);
		g.setColor(Color.red);
		g.setFont(f1);
		g.drawString("Instructions:-",40,150);
		g.setColor(Color.lightGray);
		g.drawString("1.Observe the grids.",25,200);
		g.drawString("2.You have 5 chances.",25,250);
		g.drawString("3.If you get 3 green grids",25,300);
		g.drawString("you win",25,350);
		g.drawString("4.Otherwise you loose.",25,400);
		g.setFont(f3);
		g.setColor(Color.magenta);
		g.drawString(" The game over all depends",25,450);
		g.drawString("on your luck.",25,500);
		
	}
	 public void actionPerformed(ActionEvent e)
    {
		for(i=0;i<=15;i++)
		{
			if(i==random1 || i==random2 || i==random3 || i==random4 || i==random5 || i==random6 || i==random7 ||i==random8 ||
			i==random9 || i==random10 ||i==random11)
			{
				if(e.getSource()==button[i])
				{
					button[i].setBackground(Color.cyan);
					t.setText("Wrong Grid");
					count1--;
				}
			}
			else
			{
				if(e.getSource()==button[i])
				{
					t.setText("Correct Grid");
					button[i].setBackground(Color.yellow);
					count2--;
				}
			}
			if(count2==0)
			{
				t.setText("You won the game");
				break;
			}
			if(count1==0)
			{
				t.setText("You lost the game");
				break;
			}
			
		}
		
	}
}