package collectionframework;

public class Enployee  implements Comparable<Enployee>{
	
	private int eid;
	private String name;
	public Enployee(int eid, String name) {


		this.eid = eid;
		this.name = name;
	}
	
	
	public String toString()
	{
		return ""+eid;
	}


	@Override
	public int compareTo(Enployee o) {


		/*
		 * +ve
		 * -ve
		 * 0
		 */
		if(this.eid>o.eid)
			return 1;
		else if(this.eid<o.eid)
			return -1;
		else
		return 0;
	}

}
