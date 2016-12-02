import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/oi")
public class Calculando extends HttpServlet {

	private static final long serialVersionUID = -1747097861842415159L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String tipo = request.getParameter("tipo");
		
		String basedc = request.getParameter("basedc");
		String valordd = request.getParameter("valordd");

		
		System.out.println(tipo);

String residencial = tipo;
String Naoresidencial = tipo;
String territorial = tipo;

double valor = Double.parseDouble(valordd);
double base = Double.parseDouble(basedc);

		double faixa1 = 0;
		double faixa4 = 0;
		double faixa2 = 0;
		double faixa5 = 0;
		double faixa3 = 0;
		double faixa6 = 0;
		double faixa7 = 0;

		// RESIDENCIAL
		
		switch (tipo)
		{
		
		case "residencial":
			
			if (base >= 95450) {
				base -= 95450;
				faixa1 = 95450 * 0.60 / 100; // faixa 1 Residencial
			} else if (base < 95450) {
				faixa1 = base * 0.60 / 100;
				base = 0;
			}

			if (base >= 238626) {
				base -= 143.176;
				faixa2 = 143.176 * 0.70 / 100; // faixa 2 Residencial
			} else if (base < 238626) {
				faixa2 = base * 0.70 / 100;
				base = 0;
			}

			if (base >= 417596) {
				base -= 178.970;
				faixa3 = 178.970 * 0.75 / 100; // faixa 3 Residencial
			} else if (base < 417596) {
				faixa3 = base * 0.75 / 100;
				base = 0;
			}

			if (base >= 715879) {
				base -= 298.283;
				faixa4 = 298.283 * 0.80 / 100; // faixa 4 Residencial
			} else if (base < 715879) {
				faixa4 = base * 0.80 / 100;
				base = 0;
			}

			if (base > 954505) {
				base -= 238.626;
				faixa5 = 238.626 * 0.85 / 100; // faixa 5 Residencial
			} else if (base < 954505) {
				faixa5 = base * 0.85 / 100;
				base = 0;
			}

			if (base > 11933131) {
				base -= 238.626;
				faixa6 = 238.626 * 0.90 / 100; // faixa 6 Residencial
			} else if (base < 1193131) {
				faixa6 = base * 0.90 / 100;
				base = 0;
			}

			if (base > 11933132) {
				base -= 1193132;
				faixa7 = 1193132 * 1.0 / 100; // faixa 7 Residencial
			} else if (base < 1193132) {
				faixa7 = base * 1.0 / 100;

			}
	break;
		case "Naoresidencial":
	
			// NAO RESIDENCIAL - - - - - ----- - - - - -

			if (base >= 35793) {
				base -= 35793;
				faixa1 = 35793 * 1.20 / 100; // faixa 1 Nao Residencial
			} else if (base < 35793) {
				faixa1 = base * 1.20 / 100;
				base = 0;
			}

			if (base >= 139313) {
				base -= 83.520;
				faixa2 = 83.520 * 1.30 / 100; // faixa 2 Nao Residencial
			} else if (base < 139313) {
				faixa2 = base * 1.30 / 100;
				base = 0;
			}

			if (base >= 596565) {
				base -= 477.252;
				faixa3 = 477.252 * 1.40 / 100; // faixa 3 Nao Residencial
			} else if (base < 596565) {
				faixa3 = base * 1.40 / 100;
				base = 0;
			}

			if (base >= 1193131) {
				base -= 596.566;
				faixa4 = 596.566 * 1.50 / 100; // faixa 4 Nao Residencial
			} else if (base < 1193131) {
				faixa4 = base * 1.50 / 100;
				base = 0;
			}

			if (base > 1193132) {
				base -= 1193132;
				faixa5 = 1193132 * 1.60 / 100; // faixa 5 Nao Residencial
			} else if (base < 1193132) {
				faixa5 = base * 1.60 / 100;
				base = 0;
			}
		break;
		case "territorial":
			// TERRITORIAL = - - - - - - - - - - - - -

			if (base >= 47724) {
				base -= 47724;
				faixa1 = 47724 * 1.00 / 100; // faixa 1 Territorial
			} else if (base < 47724) {
				faixa1 = base * 1.00 / 100;
				base = 0;
			}

			
			if (base >= 357939) {
				base -= 310215;
				faixa2 = 310215 * 1.60 / 100; // faixa 2 Territorial
			} else if (base < 357939) {
				faixa2 = base * 1.60 / 100;
				base = 0;
			}
			

			if (base >= 715879) {
				base -= 357940;
				faixa3 = 357940 * 2.00 / 100; // faixa 3 Territorial
			} else if (base < 715879) {
				faixa3 = base * 2.00 / 100;
				base = 0;
			}
		

			if (base >= 1193131) {
				base -= 477.252;
				faixa4 = 477.252 * 2.50 / 100; // faixa 4 Territorial
			} else if (base < 1193131) {
				faixa4 = base * 2.50 / 100;
				base = 0;
			}

			if (base > 1193132) {
				base -= 1193132;
				faixa5 = 1193132 * 3.00 / 100; // faixa 5 Territorial
			} else if (base < 1193132) {
				faixa5 = base * 3.00 / 100;
				base = 0;
			}
			break;
			default:
				System.out.println("Nao Entrou");
				break;
		}
	
		double rs = (faixa1 + faixa2 + faixa3 + faixa4 + faixa5 + faixa6 + faixa7)-valor;

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Valor : " + rs);
		out.println("</body>");
		out.println("</html>");

	}

}