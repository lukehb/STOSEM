
module onethreeseven.stosem {
    requires onethreeseven.datastructures;
    requires onethreeseven.geo;
    requires onethreeseven.common;
    requires trove4j;
    requires jts;
    requires osmosis.core;
    requires osmosis.pbf2;
    requires osmosis.xml;
    requires java.logging;
    requires foursquare.api;
    requires graphhopper.map.matching.core;
    requires graphhopper.core;
    requires graphhopper.reader.osm;
    requires onethreeseven.collections;
    requires java.xml;
    requires hppc;

    exports onethreeseven.stosem.algorithm;
    exports onethreeseven.stosem.data;
    exports onethreeseven.stosem.model;
    exports onethreeseven.stosem.model.markov;
    exports onethreeseven.stosem.model.tag;
    exports onethreeseven.stosem.util;

}