package Chpt3__Class;

public class MuseumAdmission {
	int visitors;
	int person;
	int income;
	
	MuseumAdmission(){
		visitors = 0;
		person = 0;
		income = 0;
	}
	
	public int getVisitors() {
		return visitors;
	}
	public int getPerson() {
		return person;
	}
	public int getIncome() {
		return income;
	}
	
	public boolean enter(Person P) {
		if (P.isMember() == false) {
			if(P.getAge() > 7) {
				if(P.getAge() < 18) {
					if(P.pay(2000) == false)
						return false;
					income += 2000;
				}
				else { //over 18
					if (P.pay(5000) == false)
						return false;
					income += 5000;
					}
				}
			}
		visitors ++;
		return true;
		}
	public void quit(Person p)
	{
		visitors--;
	}
}
