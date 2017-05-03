package localhost.periodpeace;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsToShelter extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_to_shelter);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMinZoomPreference(6.0f);
        mMap.setMaxZoomPreference(14.0f);


        // Add a marker at Tillary women's center and move the camera.
        LatLng tillWomShel= new LatLng(40.695864 , -73.982454);
        mMap.addMarker(new MarkerOptions().position(tillWomShel).title("Tillary Street Women's Shelter"));
        // Add a marker at nyc Rescue Misson
        LatLng nycRescueMission= new LatLng(40.717536, -74.001621);
        mMap.addMarker(new MarkerOptions().position(nycRescueMission).title("New York City Rescue Mission"));
        // Add a marker at Covenant House
        LatLng covenantHouse= new LatLng(40.758501, -73.995957);
        mMap.addMarker(new MarkerOptions().position(covenantHouse).title("Covenant House"));
        // Add a marker at Coalition for Shelter
        LatLng coalitionForShelter= new LatLng(40.706227, -74.012419);
        mMap.addMarker(new MarkerOptions().position(coalitionForShelter).title("Neighborhood Coalition for Shelter"));
        // Add a marker at Lenox Hill Neighborhood House Women’s Mental Health Shelter
        LatLng lenoxHill= new LatLng(40.767246, -73.965512);
        mMap.addMarker(new MarkerOptions().position(lenoxHill).title("Lenox Hill Neighborhood House"));
        // Add a marker at Nazereth Housing
        LatLng nazerethHousing= new LatLng(40.723751, -73.984116);
        mMap.addMarker(new MarkerOptions().position(nazerethHousing).title("Nazereth Housing"));
        // Add a marker at Mainchance Drop-In Center
        LatLng mainchanceDropIn= new LatLng(40.745231, -73.981462);
        mMap.addMarker(new MarkerOptions().position(mainchanceDropIn).title("Mainchance Drop-In Center"));
        // Add a marker at Jennie Clark Residence
        LatLng jennieClark= new LatLng(40.788329, -73.948277);
        mMap.addMarker(new MarkerOptions().position(jennieClark).title("Jennie Clark Residence"));
        // Add a marker at Convent Family Living Center
        LatLng conventFamily= new LatLng(40.809532, -73.942204);
        mMap.addMarker(new MarkerOptions().position(conventFamily).title("Convent Family Living Center"));
        // Add a marker at East River Family Center
        LatLng eastRiverFamily= new LatLng(40.789139, -73.942132);
        mMap.addMarker(new MarkerOptions().position(eastRiverFamily).title("East River Family Center"));
        // Add a marker at Safe Horizon
        LatLng safeHorizon= new LatLng(40.812601, -73.944923);
        mMap.addMarker(new MarkerOptions().position(safeHorizon).title("Safe Horizon"));
        // Add a marker at Willow Ave Shelter - Westhab
        LatLng willowAveShelter= new LatLng(40.802548, -73.912332);
        mMap.addMarker(new MarkerOptions().position(willowAveShelter).title("Willow Ave Shelter - Westhab"));
        // Add a marker at St Anthony Shelter for Renewal
        LatLng stAnthonyShelter= new LatLng(40.820525, -73.915163);
        mMap.addMarker(new MarkerOptions().position(stAnthonyShelter).title("St Anthony Shelter for Renewal"));
        // Add a marker at Saint Padre Pio Shelter
        LatLng padrePioShelter= new LatLng(40.820239, -73.915074);
        mMap.addMarker(new MarkerOptions().position(padrePioShelter).title("Saint Padre Pio Shelter"));
        // Add a marker at West Harlem Residence
        LatLng westHarlemResidence= new LatLng(40.802548, -73.912332);
        mMap.addMarker(new MarkerOptions().position(westHarlemResidence).title("West Harlem Residence"));
        // Add a marker at Willow Ave Shelter - Westhab
        LatLng willowAveShelter= new LatLng(40.802548, -73.912332);
        mMap.addMarker(new MarkerOptions().position(willowAveShelter).title("Willow Ave Shelter - Westhab"));


        mMap.moveCamera(CameraUpdateFactory.newLatLng(tillWomShel));

    }
}