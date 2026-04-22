// A classe Leitor Digital representa o dispositivo no qual
// o Livro Digital será lido

public class LeitorDigital {

    private LeitorDigitalInterface leitorDigital;

    public LeitorDigital(LeitorDigitalInterface leitordigital) {
        this.setLeitorDigital(leitordigital);
    }

    // #region Getters e Setters
    public void setLeitorDigital(LeitorDigitalInterface leitorDigital) {
        this.leitorDigital = leitorDigital;
    }

    public LeitorDigitalInterface getLeitorDigital() {
        return this.leitorDigital;
    }
    // #endregion

    public void lerLivroDigital(LivroDigital livro) {
        this.leitorDigital.apresentarLivroDigital(livro);
    }
}
