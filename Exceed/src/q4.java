import java.io.IOException;
import java.net.MalformedURLException;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlDivision;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSpan;

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

		WebClient webClient = new WebClient();
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