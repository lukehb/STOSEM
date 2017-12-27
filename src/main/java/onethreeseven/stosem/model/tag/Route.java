package onethreeseven.stosem.model.tag;

/**
 * This can be used to describe routes.
 * @author Luke Bermingham
 */
public class Route extends OsmTag {
    public Route(String value) {
        super(value);
    }

    @Override
    Specificity getSpecificityImpl() {
        return Specificity.BETTER_THAN_NOTHING;
    }

    @Override
    public String getName() {
        return "route";
    }
}
