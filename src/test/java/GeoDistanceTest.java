import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeoDistanceTest {

    @Test
    void distance() {
        GeoDistance geoDistance = new GeoDistance();
        double expected = 5.74;
        double actual = geoDistance.distance(new Double[]{50.84261825378569,4.347234362241133},new Double[]{50.88791760498203,4.3085666690045485});
        assertEquals(expected, actual);



    }
}