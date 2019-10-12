package henu.cs.cq.domain;

public class Train extends Transport{
	public Train() {
		super("train");
		super.setPrice("cheap");
		super.setComfort("bad");
		super.setSpeed("normal");
	}
}
