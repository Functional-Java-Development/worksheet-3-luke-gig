import java.util.Map;
import java.util.Optional;

public class TaxRates {

    private final static Map<Item.Type, Float> taxRateEntries = Map.of(Item.Type.ART, 0.05f,
                                                                Item.Type.CONFECTIONARY, 0.06f,
                                                                Item.Type.REPAIRS, 0.075f,
                                                                Item.Type.PHARMACEUTICAL, 0.0f,
                                                                Item.Type.GOODS, 0.18f);

    public static Optional<Float> getTaxRate(Item.Type itemType){
        // TODO Check validation and if not present set tax rate to 0.18
        return Optional.ofNullable(taxRateEntries.get(itemType));
    }
}
