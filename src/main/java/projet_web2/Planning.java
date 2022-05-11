package projet_web2;

import java.util.ArrayList;

public class Planning {
	private Utilisateur u;
	private ArrayList<Creneau> edt;
	public Planning(Utilisateur user) {
		super();
		this.u = user;
		this.edt = new ArrayList<Creneau>();
	}
	public Utilisateur getU() {
		return u;
	}
	public void setU(Utilisateur user) {
		this.u = user;
	}
	public ArrayList<Creneau> getEdt() {
		return edt;
	}
	public void addCreneau(Creneau cre) {
		edt.add(cre);
	}
}
