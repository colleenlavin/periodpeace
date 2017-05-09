package localhost.periodpeace;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsToStudentCenters extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_to_student_centers);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap = googleMap;
        mMap.setMinZoomPreference(11.0f);
        mMap.setMaxZoomPreference(14.0f);



        // Add a marker at Tillary women's center and move the camera.
        LatLng tillWomShel= new LatLng(40.695864 , -73.982454);
        mMap.addMarker(new MarkerOptions().position(tillWomShel).title("Tillary Street Women's Shelter"));
        // Add a marker at nyc Rescue Misson
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

        mMap.moveCamera(CameraUpdateFactory.newLatLng(lenoxHill));
    }
}
