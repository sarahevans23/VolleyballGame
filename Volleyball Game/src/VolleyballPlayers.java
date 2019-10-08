
public class VolleyballPlayers 
	{
		public int height; 
		public String name;
		public String position;
		public int weight;
		public int playerNumber;
		
		public VolleyballPlayers( int h, String n, String p, int w, int pN)
		{
			height = h;
			name = n;
			position = p; 
			weight = w;
			playerNumber = pN;
		}

		public int getPlayerNumber() {
			return playerNumber;
		}

		public void setPlayerNumber(int playerNumber) {
			this.playerNumber = playerNumber;
		}

		public int getWeight() {
			return weight;
		}

		public void setWeight(int weight) {
			this.weight = weight;
		}

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPosition() {
			return position;
		}

		public void setPosition(String position) {
			this.position = position;
		}
	}
