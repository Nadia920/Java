package deposite;

public enum DepositeType {
    SHORT_TERM_DEPOSITE,
    LONG_TERM_DEPOSITE,
    TIME_DEPOSITE,
    SAVING_DEPOSITE,
    DEMAND_DEPOSITE;

    public static DepositeType convert(String str) {
        for(DepositeType type : DepositeType.values()) {
            if(type.toString().equals(str)) { return type; }
        }
        return null;
    }
}
