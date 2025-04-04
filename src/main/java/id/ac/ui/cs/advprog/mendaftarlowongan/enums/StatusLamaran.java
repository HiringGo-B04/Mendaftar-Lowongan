package id.ac.ui.cs.advprog.mendaftarlowongan.enums;
import lombok.Getter;

@Getter
public enum StatusLamaran {
    WAITING_PAYMENT("WAITING_PAYMENT"),
    FAILED("FAILED"),
    SUCCESS("SUCCESS"),
    CANCELLED("CANCELLED");

    private final String value;

    private StatusLamaran(String value) {
        this.value = value;
    }

    public static boolean contains(String param) {
        for (StatusLamaran orderStatus : StatusLamaran.values()) {
            if (orderStatus.name().equals(param)) {
                return true;
            }
        }
        return false;
    }
}
