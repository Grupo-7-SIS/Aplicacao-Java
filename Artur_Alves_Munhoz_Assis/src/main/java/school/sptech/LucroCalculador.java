package school.sptech;

public class LucroCalculador {

    private Double[] faturamentoBruto;
    private Double[] despesas;
    private Double[] lucros;

    public LucroCalculador(int meses) {
        this.faturamentoBruto = new Double[meses];
        this.despesas = new Double[meses];
        this.lucros = new Double[meses];
    }

    public void adicionarDadosMes(int mes, double faturamento, double despesa) {
        if (mes >= 0 && mes < faturamentoBruto.length) {
            faturamentoBruto[mes] = faturamento;
            despesas[mes] = despesa;
            lucros[mes] = faturamento - despesa;
        }
    }

    public double calcularLucroMes(int mes) {
        if (mes >= 0 && mes < lucros.length && lucros[mes] != null) {
            return lucros[mes];
        }
        return 0.0;
    }

    public double calcularLucroTotal() {
        Double total = 0.0;
        for (Double lucro : lucros) {
            if (lucro != null) {
                total += lucro;
            }
        }
        return total;
    }

    public double calcularLucroMedio() {
        Integer mesesComDados = 0;
        Double total = 0.0;

        for (Double lucro : lucros) {
            if (lucro != null) {
                total += lucro;
                mesesComDados++;
            }
        }

        return mesesComDados > 0 ? total / mesesComDados : 0.0;
    }

    public String getSituacaoMes(Integer mes) {
        Double lucro = calcularLucroMes(mes);
        return lucro >= 0 ? "LUCRO" : "PREJUÍZO";
    }

    public Double[] getFaturamentoBruto() {
        return faturamentoBruto;
    }

    public Double[] getDespesas() {
        return despesas;
    }

    public Double[] getLucros() {
        return lucros;
    }

    public int getTotalMeses() {
        return faturamentoBruto.length;
    }
}