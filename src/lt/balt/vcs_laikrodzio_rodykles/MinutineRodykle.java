package lt.balt;

class MinutineRodykle extends LaikrodzioRodykle {

	private double minutes;

	MinutineRodykle(double minutes) {
		this.minutes = minutes;
	}

	MinutineRodykle() {
		this(0);
	}

	double skaiciuotiKampaTarpVertikalesIrRodykles(double minutes) {
		double laipsniai = minutes * (RodyklinisLaikrodis.MAX_KAMPAS / RodyklinisLaikrodis.MIN_SKAICIUS_VALANDOJE);
		return laipsniai;
	}

	double getMinutes() {
		return minutes;
	}

	void setMinutes(double minutes) {
		this.minutes = minutes;
	}

}
