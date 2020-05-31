

	public class Pokemon implements Comparable<Pokemon>, java.io.Serializable {

		public String jmeno;

		
		public String druh;

		public Pokemon(String jmeno, String druh) {
			this.jmeno = jmeno;
			this.druh = druh;
		}

		public String toCSV() {
			return this.jmeno + "," + this.druh + "\n\r";
		}

		
		public int compareTo(Pokemon other) {
			return this.jmeno.compareTo(other.jmeno);
		}

		

		@Override
		public String toString() {
			return "Pokemon [jmeno=" + jmeno + ", druh=" + druh + "]";
		}

		
		
	}


