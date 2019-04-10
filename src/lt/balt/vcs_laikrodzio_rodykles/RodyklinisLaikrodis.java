package lt.balt.vcs_laikrodzio_rodykles;

class RodyklinisLaikrodis {

	static final double MAX_KAMPAS = 360;
	static final double VAL_SKAICIUS_VIENAME_RATE = 12;
	static final double MIN_SKAICIUS_VALANDOJE = 60;

	private ValandineRodykle valandineRodykle;
	private MinutineRodykle minutineRodykle;

	RodyklinisLaikrodis(double valandos, double minutes) {
		this.valandineRodykle = new ValandineRodykle(valandos + minutes / MIN_SKAICIUS_VALANDOJE);
		this.minutineRodykle = new MinutineRodykle(minutes);
	}

	RodyklinisLaikrodis() {
		this(0, 0);
	}

	double skaiciuotiKampaTarpLaikrodzioRodykliu() {
		double laipsniai;

		double kampasTarpVertikalesIrValRodykles = this.valandineRodykle.skaiciuotiKampaTarpVertikalesIrRodykles();
		double kampasTarpVertikalesIrMinRodykles = this.minutineRodykle
				.skaiciuotiKampaTarpVertikalesIrRodykles();

		if (kampasTarpVertikalesIrMinRodykles >= kampasTarpVertikalesIrValRodykles) {
			laipsniai = Math.min((kampasTarpVertikalesIrMinRodykles - kampasTarpVertikalesIrValRodykles),
					(MAX_KAMPAS - kampasTarpVertikalesIrMinRodykles + kampasTarpVertikalesIrValRodykles));
		} else {
			laipsniai = Math.min((kampasTarpVertikalesIrValRodykles - kampasTarpVertikalesIrMinRodykles),
					(MAX_KAMPAS - kampasTarpVertikalesIrValRodykles + kampasTarpVertikalesIrMinRodykles));
		}
		return laipsniai;
	}

}
