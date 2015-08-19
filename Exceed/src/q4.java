import java.io.IOException;
import java.net.MalformedURLException;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlDivision;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSpan;

// A maior parte das depend�ncias s�o da API do HtmlUnit
// Segue link para lista de depend�ncias: http://htmlunit.sourceforge.net/dependencies.html

public class q4 {

	/**
	 * @param args
	 * @throws IOException
	 * @throws MalformedURLException
	 * @throws FailingHttpStatusCodeException
	 */

	public static void main(String[] args)
			throws FailingHttpStatusCodeException, MalformedURLException,
			IOException {
		/*
		 * Basta rodar a aplica��o como Java Application, e o nome e valor do
		 * produto mais vendido ser� mostrado no console
		 */

		WebClient webClient = new WebClient(BrowserVersion.FIREFOX_2);
		webClient.setJavaScriptEnabled(false);
		webClient.setCssEnabled(false);
		HtmlPage page = (HtmlPage) webClient
				.getPage("http://www.submarino.com.br");

		final HtmlDivision div = (HtmlDivision) page.getByXPath(
				"//div[@class='top-area-product']").get(0);
		final HtmlSpan span = (HtmlSpan) page.getByXPath(
				"//span[@class='product-price-integer']").get(0);
		System.out.println(div.asText());
		System.out.println(span.asText());

	}
}