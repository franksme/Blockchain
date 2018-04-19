import java.util.ArrayList;

Block block = new Block();

public class Main {

		
		
		
		private static int previousHash;
		ArrayList<Block> blockchain = new ArrayList<>();
		
		public static void main(String[] args) {
			String[] genesisTransactions = {"A sends B 1o bitcoin", "C sends D 15 bitcoins"};
			Block genesisBlock = new Block(previousHash: 0, genesisTransactions);
			System.out.println(genesisBlock.getBlockHash());
			
			
			
		}
		
		
	}

