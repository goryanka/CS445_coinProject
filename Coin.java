/*
	Coin.java THIS IS THE ONLY FILE YOU HAND IN
	THERE IS NO MAIN METHOD IN THIS CLASS!
*/
import java.util.Random;
public class Coin
{
	private final int TAILS = 0;
	private final int HEADS = 1;
	private Random rand;
	private int numHeads;
	private int numTails;
	
	
	public Coin(int seed){
		rand = new Random(seed);
		reset();
		}
		
    public int getNumHeads(){
		return  numHeads;
	}
	
	public int getNumTails(){
		return numTails;
	}
	
	private void setNumHeads(int h){
		numHeads = h;
	}
	
	private void setNumTails(int t){
		numTails = t;
	}
		
	public String flip(){
		int side = rand.nextInt(2);
		if(side == HEADS){
			setNumHeads(getNumHeads() + 1);
		return "H";
		}else{
	
		if(side == TAILS)
			setNumTails(getNumTails() + 1);
		return "T";
		}
	}
	 public void reset(){
		setNumHeads(0); 
		setNumTails(0);
	 }

} // END COIN CLASS