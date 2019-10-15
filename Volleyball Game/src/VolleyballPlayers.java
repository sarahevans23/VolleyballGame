
public class VolleyballPlayers 
	{
		public double height; 
		public String name;
		public String position;
		public int playerNumber;
		
		public VolleyballPlayers( double h, String n, String p, int pN)
		{
			this.height = h;
			this.name = n;
			this.position = p;
			this.playerNumber = pN;
		}

		public int getPlayerNumber() {
			return playerNumber;
		}

		public void setPlayerNumber(int playerNumber) {
			this.playerNumber = playerNumber;
		}

		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
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
