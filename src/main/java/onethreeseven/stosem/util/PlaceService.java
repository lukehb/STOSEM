package onethreeseven.stosem.util;

import onethreeseven.datastructures.model.CompositePt;
import onethreeseven.stosem.model.SemanticPlace;

import java.util.Collection;

/**
 * A service for supplying places based on geographic coordinates.
 * @author Luke Bermingham
 */
public abstract class PlaceService {

    PlaceService(){}

    public abstract Collection<CompositePt<SemanticPlace>> getNearbyPlaces(double lat, double lon, int searchRadius);

    public abstract CompositePt<SemanticPlace> getClosestPlace(double lat, double lon, int searchRadius);

}
