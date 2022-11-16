import java.time.LocalDate;

public class Cotacao {
    @Override
    public String toString() {
        return "Cotacao{" +
                "codEmpresa='" + codEmpresa + '\'' +
                ", valor=" + valor +
                ", data=" + data +
                ", moeda='" + moeda + '\'' +
                '}';
    }

    public Cotacao(String codEmpresa, String moeda, double valor) {
        this.codEmpresa = codEmpresa = "";
        this.moeda = moeda;
        this.valor = valor;
    }

    public Cotacao() {

    }

    public Cotacao(String codEmpresa, LocalDate data, double valor) {
        this.codEmpresa = codEmpresa;
        this.data = data;
        this.valor = valor;
    }

    public String getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(String codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    String codEmpresa;
    double valor;
    LocalDate data = LocalDate.now();
    String moeda = "";
}
