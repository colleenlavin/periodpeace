package localhost.periodpeace;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsToClinics extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_to_clinics);
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
        mMap.setMinZoomPreference(11.0f);
        mMap.setMaxZoomPreference(14.0f);



        // Add a marker at New York City Free Clinic
        LatLng nycFreeClinic= new LatLng(40.736761, -73.991884);
        mMap.addMarker(new MarkerOptions().position(nycFreeClinic).title("New York City Free Clinic"));

        // Add a marker at Weill Cornell Community Clinic
        LatLng weillCornell= new LatLng(40.765694, -73.954109);
        mMap.addMarker(new MarkerOptions().position(weillCornell).title("Weill Cornell Community Clinic"));

        // Add a marker at Mount Sinai Adolescent Health Care Clinic
        LatLng mountSinai= new LatLng(40.782333, -73.947188);
        mMap.addMarker(new MarkerOptions().position(mountSinai).title("Mount Sinai Adolescent Health Care Clinic"));

        // Add a marker at East Harlem Health Outreach Program - Mount Sinai
        LatLng eastHarlemHealth= new LatLng(40.791484, -73.952012);
        mMap.addMarker(new MarkerOptions().position(eastHarlemHealth).title(" East Harlem Health Outreach Program - Mount Sinai"));

        // Add a marker at Columbia Student Medical Outreach
        LatLng columbiaStudentOutreach= new LatLng(40.839390, -73.938742);
        mMap.addMarker(new MarkerOptions().position(columbiaStudentOutreach).title("Columbia Student Medical Outreach"));

        // Add a marker at Columbia-Harlem Homeless Medical Partnership
        LatLng columbiaHarlemHomeless= new LatLng(40.814931, -73.956034);
        mMap.addMarker(new MarkerOptions().position(columbiaHarlemHomeless).title("Columbia-Harlem Homeless Medical Partnership"));

        // Add a marker at St. Anthony's Free Clinic
        LatLng stAnthonysFreeClinic= new LatLng(40.820149, -73.914967);
        mMap.addMarker(new MarkerOptions().position(stAnthonysFreeClinic).title("St. Anthony's Free Clinic"));

        // Add a marker at ECHO Free Clinic
        LatLng echoFreeClinic= new LatLng(40.849708, -73.908984);
        mMap.addMarker(new MarkerOptions().position(echoFreeClinic).title("ECHO Free Clinic"));

        // Add a marker at Al Hirschfeld Free Health Clinic
        LatLng alHirschfeldClinic= new LatLng(40.769250, -73.988116);
        mMap.addMarker(new MarkerOptions().position(alHirschfeldClinic).title("Al Hirschfeld Free Health Clinic "));

        // Add a marker at Callen-Lorde Community Health Center
        LatLng callenLorde= new LatLng(40.743061, -74.003146);
        mMap.addMarker(new MarkerOptions().position(callenLorde).title("Callen-Lorde Community Health Center"));
//        // Add a marker at Safe Horizon
//        LatLng safeHorizon= new LatLng(40.812601, -73.944923);
//        mMap.addMarker(new MarkerOptions().position(safeHorizon).title("Safe Horizon"));
//        // Add a marker at Willow Ave Shelter - Westhab
//        LatLng willowAveShelter= new LatLng(40.802548, -73.912332);
//        mMap.addMarker(new MarkerOptions().position(willowAveShelter).title("Willow Ave Shelter - Westhab"));
//        // Add a marker at St Anthony Shelter for Renewal
//        LatLng stAnthonyShelter= new LatLng(40.820525, -73.915163);
//        mMap.addMarker(new MarkerOptions().position(stAnthonyShelter).title("St Anthony Shelter for Renewal"));
//        // Add a marker at Saint Padre Pio Shelter
//        LatLng padrePioShelter= new LatLng(40.820239, -73.915074);
//        mMap.addMarker(new MarkerOptions().position(padrePioShelter).title("Saint Padre Pio Shelter"));
//        // Add a marker at West Harlem Residence
//        LatLng westHarlemResidence= new LatLng(40.819746, -73.939094);
//        mMap.addMarker(new MarkerOptions().position(westHarlemResidence).title("West Harlem Residence"));
//        // Add a marker at Women in Need Program
//        LatLng womenInNeed= new LatLng(40.669367, -73.950784);
//        mMap.addMarker(new MarkerOptions().position(willowAveShelter).title("Women in Need Program"));


        mMap.moveCamera(CameraUpdateFactory.newLatLng(columbiaHarlemHomeless));
    }
}
