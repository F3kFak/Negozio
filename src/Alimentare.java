import java.util.Calendar;
/**
 * La classe gestisce la tipologia Alimentare di Prodotto
 */
public class Alimentare extends Prodotto{

    /**
     * anno di scadenza riportato sulla confezione del prodotto
     */
    protected int annoScadenza;

    /**
     * mese di scadenza riportato sulla confezione del prodotto
     */
    protected int meseScadenza;

    /**
     * Costruttore Parametrico - Costruisce un oggetto di tipo ProdottoAlimentare
     * @param annoScadenza anno di scadenza da assegnare al nuovo oggetto Prodotto
     * @param meseScadenza mese di scadenza da assegnare al nuovo oggetto Prodotto
     * @param nome nome da assegnare al nuovo oggetto Prodotto
     * @param prezzo prezzo da assegnare al nuovo oggetto Prodotto
     * @param provenienza nazione di produzione del nuovo oggetto Prodotto
     */
    public Alimentare(int annoScadenza, int meseScadenza, String nome, double prezzo, String provenienza) {
        super(nome, prezzo, provenienza);
        if (annoScadenza > 1900 && meseScadenza >= 1 && meseScadenza <= 12) {
            setMeseScadenza(meseScadenza);
            setAnnoScadenza(annoScadenza);
        }
        else {
            System.out.println("Errore");
            super.setNome(null);
            super.setPrezzo(0);
            super.setProvenienza(null);
        }
    }

    /**
     * Restituisce l'anno di scadenza riportato sulla confezione
     * @return anno di scadenza
     */
    public int getAnnoScadenza() {
        return this.annoScadenza;
    }

    /**
     * Imposta l'anno di scadenza dell'oggetto Prodotto Alimentare
     * @param annoScadenza intero che rappresenta l'anno (>1900)
     */
    public void setAnnoScadenza(int annoScadenza) {
        if (annoScadenza > 1900 ) {
            this.annoScadenza = annoScadenza;
        } else {
            System.out.println("Errore");
        }
    }

    /**
     * Restituisce il mese di scadenza riportato sulla confezione
     * @return mese di scadenza
     */
    public int getMeseScadenza() {
        return this.meseScadenza;
    }

    /**
     * Imposta il mese di scadenza dell'oggetto Prodotto Alimentare
     * @param meseScadenza intero che rappresenta il mese (1-12)
     */
    public void setMeseScadenza(int meseScadenza) {
        if (meseScadenza >= 1 && meseScadenza <= 12) {
            this.meseScadenza = meseScadenza;
        } else {
            System.out.println("Errore");
        }
    }

    /**
     * Restituisce una stringa che rappresenta l'oggetto ProdottoAlimentare
     * @return Rappresentazione testuale dell'oggetto ProdottoAlimentare
     */
    @Override
    public String toString() {
        return "{" + super.toString() +
            " annoScadenza='" + getAnnoScadenza() + "'" +
            ", meseScadenza='" + getMeseScadenza() + "'" +
            "}";
    }

    /**
     * Controlla la scadenza del prodotto
     * @return true se il prodotto è scaduto, false altrimenti
     */
    public boolean isScaduto()
    {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        if (annoScadenza < year)
            return true;
        else if (annoScadenza == year) {
            if (meseScadenza < month) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /**
     * Applica uno sconto sul prezzo del prodotto Alimentare.
     * <ul>
     * <li>Se il prodotto è scaduto lo sconto non viene applicato.</li>
     * <li>Se ci si trova nel mese di scadenza allora applica uno sconto del 50%</li>
     * <li>Negli altri casi rimane lo sconto del 10%</li>
     * </ul>
     */
    public void applicaSconto()
    {
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);
        if (isScaduto() == false) {
            if (annoScadenza == year && meseScadenza == month) {
                prezzo = prezzo - ((prezzo/100) * 50);
            }
            else {
                super.applicaSconto();
            }
        }
        else 
            System.out.println("Scaduto");
    }
}
