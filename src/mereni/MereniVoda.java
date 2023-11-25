package mereni;

import java.time.LocalDateTime;

public class MereniVoda extends Mereni{
    private double spotrebaM3;

    public MereniVoda(int idSenzor, LocalDateTime casMereni, double spotrebaM3) {
        super(idSenzor, enumTypSenzoru.VODA, casMereni);
        this.spotrebaM3 = spotrebaM3;
    }

    public double getSpotrebaM3() {
        return spotrebaM3;
    }
}
