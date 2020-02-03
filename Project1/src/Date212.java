//Gurmat Sandhu
//CS 212-11G
//Lab Instructor-Di Wu
//Project 1


public class Date212 {

	private int year;
	private int month;
	private int day;

	public Date212(String d) {
		
		year = Integer.parseInt(d.substring(0, 4));
		month = Integer.parseInt(d.substring(4, 6));
		day = Integer.parseInt(d.substring(6, 8));
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date212 other = (Date212) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	public int compareTo(String s){
		String mm = String.valueOf(year)+String.valueOf(month)+String.valueOf(day);
		return mm.compareTo(s);
	}

	@Override
	public String toString() {
		
		String mm="";
		
		switch(month){
		case 1:
			mm="January";
			break;
		case 2: 
			mm="February";
			break;
		case 3: 
			mm="March";
			break;
		case 4: 
			mm="April";
			break;
		case 5:
			mm="May";
			break;
		case 6: 
			mm="June";
			break;
		case 7: 
			mm="July";
			break;
		case 8: 
			mm="August";
			break;
		case 9: 
			mm="September";
			break;
		case 10:
			mm="October";
			break;
		case 11:
			mm="November";
			break;
		case 12: 
			mm="December";
			break;
		}
		
		mm += " "+String.valueOf(day)+", "+String.valueOf(year);
		return mm;
	}
	
	
	
}
