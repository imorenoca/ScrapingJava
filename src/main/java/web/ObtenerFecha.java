package web;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class ObtenerFecha {

	public static void main(String[] args) {
		
		try {
			String urlStr = "https://www.sspa.juntadeandalucia.es/servicioandaluzdesalud"
					+ "/profesionales/ofertas-de-empleo/oferta-de-empleo-publico"
					+ "-puestos-base/convocatorias-oep-2025/cuadro-de-evolucion"
					+ "/tecnicoa-especialista-en-informatica";
			// Crear el cliente

			HttpClient client = HttpClient.newHttpClient();
			// 2. Crear la petición
			HttpRequest request = HttpRequest.newBuilder().uri(new URI(urlStr)).GET().build();
			// 3. Enviar la petición y obtener la respuesta como String
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
			if (response.statusCode() == 200) {
				// 4. Parsear HTML con Jsoup
				Document doc = Jsoup.parse(response.body());
				Element fechaElem = doc.selectFirst("span.field--name-sas-xfecha-actualizacion-dt");

				if (fechaElem != null) {
					System.out.println("Fecha encontrada: " + fechaElem.text());
				} else {
					System.out.println("No se encontró el elemento de fecha.");
				}
			} else {
				System.out.println("Error. Código de estado: " + response.statusCode());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
