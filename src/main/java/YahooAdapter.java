import io.github.mainstringargs.yahooFinance.YahooFinanceModules;
import io.github.mainstringargs.yahooFinance.YahooFinanceRequest;
import io.github.mainstringargs.yahooFinance.YahooFinanceUrlBuilder;

public class YahooAdapter implements ServicoCotacao {
    @Override
    public Cotacao getCotacao(String codEmpresa) {
        //System.out.printf("Cotação da Empresa %s pelo serviço Yahoo Finance: https://finance.yahoo.com%n", codigoEmpresa);
        var builder =
                new YahooFinanceUrlBuilder().modules(YahooFinanceModules.values()).symbol(codEmpresa);

        var request = new YahooFinanceRequest();
        var financeData = request.getFinanceData(request.invoke(builder));

        var financialData = financeData.getFinancialData();
        if (financialData == null)
            //System.err.printf("Não foi possível obter a cotação para a empresa %s%n", codEmpresa);
            return new Cotacao();

        else
            return new Cotacao(codEmpresa,
                    financialData.getFinancialCurrency(),
                    financialData.getCurrentPrice().getRaw().doubleValue());


        /*

        System.out.printf("Preço: %s %s%n", financialData.getFinancialCurrency(), financialData.getCurrentPrice().getRaw());

        System.out.println(builder.getURL());
        System.out.println("https://query1.finance.yahoo.com/v8/finance/chart/"+codigoEmpresa+"?period1=1546311600&period2=1556593200&interval=1d&includePrePost=False");
        */
        //System.out.println("---------------------------------------------------------------------------------");
    }
}
