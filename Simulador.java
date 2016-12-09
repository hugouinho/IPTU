package calculo;


public class Simulador {

	private static double[][] faixasResidencial = { { 0.6, 95450 },
			{ 0.7, 143176 }, { 0.75, 178970 }, { 0.80, 298283 },
			{ 0.85, 238626 }, { 0.9, 238626 }, { 1.0, 999999999 } };

	private static double[][] faixasNaoResidencial = { { 1.2, 35793},
			{ 1.3, 83520}, { 1.4, 477252}, { 1.5, 596566},
			{ 1.6, 999999999} };

	private static double[][] faixasTerritorial = { { 1, 47724},
		{ 1.6, 310215}, { 2, 357940}, { 2.5, 477252},
		{ 3, 999999999} };

	public static double calcularIPTU(String tipo, double valorImovel,
			double desconto) {

		double imposto = 0;

		if (tipo.equals("1")) {
			for (double[] faixa : faixasResidencial) {
				if (valorImovel > faixa[1]) {
					imposto += faixa[1] * faixa[0] / 100;
				} else {
					imposto += valorImovel * faixa[0] / 100;
				}
				valorImovel -= faixa[1];
				if (valorImovel < 0) {
					break;
				}
			}
		} else if (tipo.equals("2")) {
			for (double[] faixa : faixasNaoResidencial) {
				if (valorImovel > faixa[1]) {
					imposto += faixa[1] * faixa[0] / 100;
				} else {
					imposto += valorImovel * faixa[0] / 100;
				}
				valorImovel -= faixa[1];
				if (valorImovel < 0) {
					break;
				}
			}
		} else {
			for (double[] faixa : faixasTerritorial) {
				if (valorImovel > faixa[1]) {
					imposto += faixa[1] * faixa[0] / 100;
				} else {
					imposto += valorImovel * faixa[0] / 100;
				}
				valorImovel -= faixa[1];
				if (valorImovel < 0) {
					break;
				}
			}
		}

		return imposto;
	}

}
