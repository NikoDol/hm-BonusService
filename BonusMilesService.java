public class BonusMilesService {
    public Integer calculate (int price) {
        // За каждые 20 рублей , одна миля.
        int miles = price/20;
        return miles;
    }

}
