package othello;

public class Player {
	private String name;
	private int symbol;
	public Player(String name,int symbol)
	{
		setName(name);
		setSymbol(symbol);
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSymbol(int symbol)
	{
		this.symbol=symbol;
	}
	public int getSymbol()
	{
		return this.symbol;
	}
	public String getName()
	{
		return this.name;
	}
}
