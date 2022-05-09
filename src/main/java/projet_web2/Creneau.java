package projet_web2;

import java.sql.Date;
import java.sql.Time;

public class Creneau {
	private Date jour;
	private Time debut;
	private Time fin;
	private Cours cours;
	public Creneau() {}
	public Creneau(Date jour, Time debut, Time fin, Cours cours) {
		super();
		this.jour = jour;
		this.debut = debut;
		this.fin = fin;
		this.cours = cours;
	}
	public Time getDebut() {
		return debut;
	}
	public void setDebut(Time debut) {
		this.debut = debut;
	}
	public Time getFin() {
		return fin;
	}
	public void setFin(Time fin) {
		this.fin = fin;
	}
	public Cours getCours() {
		return cours;
	}
	public void setCours(Cours cours) {
		this.cours = cours;
	}
	public Date getJour() {
		return jour;
	}
	public void setJour(Date jour) {
		this.jour = jour;
	}
	
}
