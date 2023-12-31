package mereni;

import java.time.LocalDateTime;

public abstract class Mereni {
    private int idSenzor;
    private enumTypSenzoru typSenzoru;
    private LocalDateTime casMereni;

    public Mereni(int idSenzor, enumTypSenzoru typSenzoru, LocalDateTime casMereni) {
        this.idSenzor = idSenzor;
        this.typSenzoru = typSenzoru;
        this.casMereni = casMereni;
    }

    public int getIdSenzor() {
        return idSenzor;
    }

    public enumTypSenzoru getTypSenzoru() {
        return typSenzoru;
    }

    public LocalDateTime getCasMereni() {
        return casMereni;
    }
}
