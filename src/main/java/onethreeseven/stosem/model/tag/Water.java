package onethreeseven.stosem.model.tag;

/**
 * For bodies of water: lakes, ponds etc.
 */
public class Water extends OsmTag {
    public Water(String value) {
        super(value);
    }

    @Override
    Specificity getSpecificityImpl() {
        return Specificity.BETTER_THAN_NOTHING;
    }

    @Override
    public String getName() {
        return "water";
    }
}
