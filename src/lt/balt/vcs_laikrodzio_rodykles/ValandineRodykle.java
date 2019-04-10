package lt.balt.vcs_laikrodzio_rodykles;

class ValandineRodykle extends LaikrodzioRodykle {

	private double valandos;

	ValandineRodykle(double valandos) {
		this.valandos = valandos;
	}

	ValandineRodykle() {
		this(0);
	}

	double skaiciuotiKampaTarpVertikalesIrRodykles() {
		double laipsniai;
		if (valandos < RodyklinisLaikrodis.VAL_SKAICIUS_VIENAME_RATE) {
			laipsniai = valandos * (RodyklinisLaikrodis.MAX_KAMPAS / RodyklinisLaikrodis.VAL_SKAICIUS_VIENAME_RATE);
		} else {
			laipsniai = (valandos - RodyklinisLaikrodis.VAL_SKAICIUS_VIENAME_RATE)
					* (RodyklinisLaikrodis.MAX_KAMPAS / RodyklinisLaikrodis.VAL_SKAICIUS_VIENAME_RATE);
		}
		return laipsniai;
	}

	double getValandos() {
		return valandos;
	}

	void setValandos(double valandos) {
		this.valandos = valandos;
	}

}
