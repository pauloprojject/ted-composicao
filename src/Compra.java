import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Compra {
    private Produto produto;
    private LocalTime dataHora;

    public Compra(Produto produto, LocalTime dataHora) {
        this.produto = produto;
        this.dataHora = dataHora;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public LocalTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalTime dataHora) {
        this.dataHora = dataHora;
    }

    public void desconto(int diaSemana){
        if (getDataHora().getHour() >= 20 ||
           (diaSemana==6|| diaSemana==7)){
           double desconto10 = getProduto().getPreco()*0.1;
           getProduto().setPreco(getProduto().getPreco()-desconto10);
        }
    }
}
