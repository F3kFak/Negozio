/**
 * La classe gestisce prodotti di un negozio
 */
public class Prodotto {
    /**
     * nome del prodotto
     */
    protected String nome;
    /**
     * prezzo di vendita del prodotto
     */
    protected double prezzo;
    /**
     * nazione di produzione del prodotto
     */
    protected String provenienza;

    /**
     * Costruttore parametrio, costruisce un oggetto Prodotto dato il nome prezzo e nazione di provenienza
     * @param nome nome da assegnare al nuovo oggetto Prodotto
     * @param prezzo prezzo da assegnare al nuovo oggetto Prodottoprezzo da assegnare al nuovo oggetto Prodotto
     * @param provenienza nazione di produzione del nuovo oggetto Prodotto
     */
    public Prodotto(String nome, double prezzo, String provenienza) {
        setNome(nome);
        setPrezzo(prezzo);
        setProvenienza(provenienza);
    }

    /**
     * Applica uno sconto del 10% sul prezzo del prodotto
     */
    public void applicaSconto()
    {
        prezzo = prezzo - ((prezzo/100) * 10);
    }

    /**
     * Restituisce il nome del prodotto
     * @return il nome del prodotto
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Imposta il nome del prodotto
     * @param nome nome del prodotto
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Restituisce il prezzo del prodotto
     * @return il prezzo del prodotto
     */
    public double getPrezzo() {
        return this.prezzo;
    }

    /**
     * Imposta il prezzo dell'oggetto di tipo Prodotto
     * @param prezzo prezzo del prodotto
     */
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    /**
     * Restituisce la nazione di produzione del prodotto
     * @return nazione di provenienza
     */
    public String getProvenienza() {
        return this.provenienza;
    }

    /**
     * Imposta la provenienza dell'oggetto di tipo Prodotto
     * @param provenienza stringa provenienza
     */
    public void setProvenienza(String provenienza) {
        this.provenienza = provenienza;
    }


    /**
     * Restituisce una stringa che rappresenta l'oggetto
     * @return Rappresentazione testuale dell'oggetto Prodotto
     */
    @Override
    public String toString() {
        return " nome='" + getNome() + "'" +
            ", prezzo='" + getPrezzo() + "'" +
            ", provenienza='" + getProvenienza();
    }

}
