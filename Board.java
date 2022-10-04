package othello;

class Board {
	private int[][] board;
	private int p1Symbol,p2Symbol;
	public Board(int p1,int p2)
	{
		board=new int[8][8];
		p1Symbol=p1;
		p2Symbol=p2;
		board[3][3]=p1Symbol;
		board[4][4]=p1Symbol;
		board[3][4]=p2Symbol;
		board[4][3]=p2Symbol;
	}
	public void print()
	{
		for(int[] i:board)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public boolean move(int symbol,int x,int y)
	{
		boolean isAdvantage=false;
		if(x<0 || y<0 || x>board.length || y>board.length || board[x][y]!=0)
			return isAdvantage;
		int count=0;
		int[] xcoordinates= {0,0,-1,1,1,-1,1,-1};
		int[] ycoordinates= {1,-1,1,0,-1,1,1,-1};
		for(int i=0;i<xcoordinates.length;i++)
		{
			int currentX=x + xcoordinates[i];
			int currentY=y + ycoordinates[i];
			while(currentX>=0 || currentY>=0 || currentX<board.length || currentY<board.length )
			{
			if(board[currentX][currentY]==0)
				break;
			else if(board[currentX][currentY]!=symbol)
			{
				currentX=currentX + xcoordinates[i];
				currentX=currentX + xcoordinates[i];
				count++;
			}
			else
			{
				if(count>0)
				{
					isAdvantage=true;
					int curr_x=currentX-xcoordinates[i];
					int curr_y=currentY-ycoordinates[i];
					while(curr_x!=x && curr_y!=y)
					{
						board[curr_x][curr_y]=symbol;
						curr_x=curr_x-xcoordinates[i];
						curr_y=curr_y-ycoordinates[i];
					}
				}
				break;
			}
			}
		}
		if(isAdvantage)
			board[x][y]=symbol;
		return isAdvantage;
	}
	
}
