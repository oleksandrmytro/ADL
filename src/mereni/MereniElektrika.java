package mereni;

import java.time.LocalDateTime;

public class MereniElektrika extends Mereni{
    private double spotrebaVt;
    private double spotrebaNT;

    public MereniElektrika(int idSenzor, LocalDateTime casMereni,
                           double spotrebaVt, double spotrebaNT) {
        super(idSenzor, enumTypSenzoru.ELEKTRIKA, casMereni);
        this.spotrebaVt = spotrebaVt;
        this.spotrebaNT = spotrebaNT;
    }

    public double getSpotrebaVT() {
        return spotrebaVt;
    }

    public double getSpotrebaNT() {
        return spotrebaNT;
    }
}
