//Quandl
import com.jimmoores.quandl.*;
import com.jimmoores.quandl.classic.ClassicQuandlSession;

//AlphaVantage
import io.github.mainstringargs.alphavantagescraper.AlphaVantageConnector;
import io.github.mainstringargs.alphavantagescraper.StockQuotes;
import io.github.mainstringargs.alphavantagescraper.output.AlphaVantageException;

//YahooFinance
import io.github.mainstringargs.yahooFinance.*;

import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args) {
        System.out.println();

        //No Yahoo Finance, as empresas brasileiras terminam com ".sa"
        //cotacaoUsandoYahooFinance("MGLU3.SA");

        //cotacaoUsandoAlphaVantage("INTL"); //INTL = Intel

         // ServicoCotacao servico = new AlphaVantageAdapter();
        ServicoCotacao servico = new QuandlAdapter();
        System.out.println(servico.getCotacao("WIKI/AAPL"));

        //cotacaoUsandoQuandl("WIKI/AAPL"); //AAPL = Apple
    }

}
