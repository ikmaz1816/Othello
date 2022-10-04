package othello;

import java.util.Scanner;

public class Manager {
	private Player p1,p2;
	private Board board;
	private int num;
	Scanner sc;
	public Manager()
	{
		this.num=0;
		p1=getInfo(++num);
		p2=getInfo(++num);
		sc=new Scanner(System.in);
		board=new Board(p1.getSymbol(),p2.getSymbol());
	}
	public Player getInfo(int num)
	{
		System.out.println("Enter the player"+" "+num+"name");
		String name=sc.next();
		System.out.println("Enter the player"+" "+num+"symbol");
		int symbol=sc.nextInt();
		Player p=new Player(name,symbol);
		sc.close();
		return p;
		
	}
	public void startgame(int n)
	{
		boolean player1=true;
		while(n>0)
		{
			if(player1)
			{
				System.out.println("Enter the x coordinate for player 1");
				int x=sc.nextInt();
				System.out.println("Enter thr y coordinate for player 1");
				int y=sc.nextInt();
				if(board.move(p1.getSymbol(),x,y)!=true)
					continue;
				player1=!player1;
				
			}
			else
			{
				System.out.println("Enter the x coordinate for player 2");
				int x=sc.nextInt();
				System.out.println("Enter thr y coordinate for player 2");
				int y=sc.nextInt();
				if(board.move(p2.getSymbol(),x,y)!=true)
					continue;
				player1=true;
			}
			n--;
			}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
