package com.example.android.infodei;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class activity_2 extends AppCompatActivity implements OnMapReadyCallback,GoogleMap.OnInfoWindowClickListener,LocationListener
,OnMenuItemClickListener {
    final static int PERMISSION_ALL = 1;
    final static String[] PERMISSIONS = {Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION};
    GoogleMap n_map;
    boolean mapReady = false;
    LatLng mycoordinates;
    PendingIntent pendingIntent;


    static final CameraPosition DEI = CameraPosition.builder()
            .target(new LatLng(27.228048, 78.012795)).zoom(17).tilt(10).build();
    MarkerOptions MyLocation;
    Marker myLocation;
    LocationManager locationManager;
    MarkerOptions FOArchitecture;
    MarkerOptions FOEngg;
    MarkerOptions FOCommerce;
    MarkerOptions FOScience;
    MarkerOptions FOSocialSciences;
    MarkerOptions FOArts;
    MarkerOptions ICT;
    MarkerOptions BoysCanteen;
    MarkerOptions BoysHostel;
    MarkerOptions EnggWorkshop;
    MarkerOptions EnggLibrary;
    MarkerOptions ElectricalEnggDept;
    MarkerOptions BadmintonHall;
    MarkerOptions USIC;
    MarkerOptions AutomobileWorkshop;
    MarkerOptions TennisCourt;
    MarkerOptions Parking;
    MarkerOptions CentralOffice;
    MarkerOptions MainGate;
    MarkerOptions VollyballCourt;
    MarkerOptions TechClg;
    MarkerOptions CompCentre;
    MarkerOptions PshycoDept;
    MarkerOptions ScienceGround;
    MarkerOptions CentralLib;
    MarkerOptions DesBlock;
    MarkerOptions GirlsCanteen;

    Marker fOArchitecture;
    Marker fOEngg;
    Marker fOCommerce;
    Marker fOScience;
    Marker fOSocialSciences;
    Marker fOArts;
    Marker iCT;
    Marker boysCanteen;
    Marker boysHostel;
    Marker enggWorkshop;
    Marker enggLibrary;
    Marker electricalEnggDept;
    Marker badmintonHall;
    Marker uSIC;
    Marker automobileWorkshop;
    Marker tennisCourt;
    Marker parking;
    Marker centralOffice;
    Marker mainGate;
    Marker vollyballCourt;
    Marker techClg;
    Marker compCentre;
    Marker pshycoDept;
    Marker scienceGround;
    Marker centralLib;
    Marker desBlock;
    Marker girlsCanteen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);




        FOArchitecture = new MarkerOptions()
                .position(new LatLng(27.227348, 78.014608))
                .title("Faculty Of Architecture")
                .snippet("Multimedia");

        FOEngg = new MarkerOptions()
                .position(new LatLng(27.230336, 78.014074))
                .title("Faculty Of Engineering")
                .snippet("For more information click");

        FOCommerce = new MarkerOptions()
                .position(new LatLng(27.227560, 78.013915))
                .title("Faculty Of Commerce");

        FOScience = new MarkerOptions()
                .position(new LatLng(27.226493, 78.013867))
                .title("Faculty Of Science")
                .snippet("For more information click");

        FOSocialSciences = new MarkerOptions()
                .position(new LatLng(27.226318, 78.012276))
                .title("Faculty Of Social Sciences");

        FOArts = new MarkerOptions()
                .position(new LatLng(27.226115, 78.014145))
                .title("Faculty Of Arts");

        ICT = new MarkerOptions()
                .position(new LatLng(27.228169, 78.014843))
                .title("Faculty of Integrated Medicines (AYUSH)")
                .snippet("For more information click");

        BoysCanteen = new MarkerOptions()
                .position(new LatLng(27.228500, 78.014898))
                .title("Boys Canteen");

        BoysHostel = new MarkerOptions()
                .position(new LatLng(27.229080, 78.014144))
                .title("Boys Hostel");

        EnggWorkshop = new MarkerOptions()
                .position(new LatLng(27.230166, 78.015087))
                .title("Engineering Workshop")
                .snippet("For more information click");

        EnggLibrary = new MarkerOptions()
                .position(new LatLng(27.230524, 78.014486))
                .title("Engineering Library");

        ElectricalEnggDept = new MarkerOptions()
                .position(new LatLng(27.231228, 78.014291))
                .title("Electrical Engineering Department")
                .snippet("For more information click");

        BadmintonHall = new MarkerOptions()
                .position(new LatLng(27.229849, 78.014768))
                .title("Badminton Hall");

        USIC = new MarkerOptions()
                .position(new LatLng(27.229151, 78.015333))
                .title("USIC");

        AutomobileWorkshop = new MarkerOptions()
                .position(new LatLng(27.229301, 78.015017))
                .title("Automobile Workshop");

        TennisCourt = new MarkerOptions()
                .position(new LatLng(27.228568, 78.013475))
                .title("Tennis Court");

        Parking = new MarkerOptions()
                .position(new LatLng(27.228257, 78.013215))
                .title("Parking");

        CentralOffice = new MarkerOptions()
                .position(new LatLng(27.227881, 78.013773))
                .title("Central Office");

        MainGate = new MarkerOptions()
                .position(new LatLng(27.228048, 78.012795))
                .title("Main Gate");

        VollyballCourt = new MarkerOptions()
                .position(new LatLng(27.228621, 78.013921))
                .title("Volleyball Court");

        TechClg = new MarkerOptions()
                .position(new LatLng(27.229677, 78.013817))
                .title("Technical College");

        CompCentre = new MarkerOptions()
                .position(new LatLng(27.227239, 78.015000))
                .title("Computer Centre");

        GirlsCanteen = new MarkerOptions()
                .position(new LatLng(27.226934, 78.014719))
                .title("Girls Canteen");

        PshycoDept = new MarkerOptions()
                .position(new LatLng(27.226115, 78.014145))
                .title("Pshycology Department");

        ScienceGround = new MarkerOptions()
                .position(new LatLng(27.227090, 78.012991))
                .title("Science Ground");

        CentralLib = new MarkerOptions()
                .position(new LatLng(27.226203, 78.012835))
                .title("Central Library");

        DesBlock = new MarkerOptions()
                .position(new LatLng(27.225965, 78.013269))
                .title("DES Block");

        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync((OnMapReadyCallback) this);


        locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
        MyLocation = new MarkerOptions().position(new LatLng(0, 0)).title("Your Current Location").icon(BitmapDescriptorFactory.fromResource(R.drawable.bluedot));
        if (Build.VERSION.SDK_INT >= 23 && !isPermissionGranted()) {
            requestPermissions(PERMISSIONS, PERMISSION_ALL);
        } else requestLocation();
        if (!isLocationEnabled())
            showAlert(1);


    }


    public void onMapReady(GoogleMap map) {
        mapReady = true;
        n_map = map;
        myLocation = n_map.addMarker(MyLocation);
        fOArchitecture = n_map.addMarker(FOArchitecture);
        fOEngg = n_map.addMarker(FOEngg);
        fOCommerce = n_map.addMarker(FOCommerce);
        fOScience = n_map.addMarker(FOScience);
        fOSocialSciences = n_map.addMarker(FOSocialSciences);
        fOArts = n_map.addMarker(FOArts);
        iCT = n_map.addMarker(ICT);
        boysCanteen = n_map.addMarker(BoysCanteen);
        boysHostel = n_map.addMarker(BoysHostel);
        electricalEnggDept = n_map.addMarker(ElectricalEnggDept);
        enggWorkshop = n_map.addMarker(EnggWorkshop);
        enggLibrary = n_map.addMarker(EnggLibrary);
        badmintonHall = n_map.addMarker(BadmintonHall);
        uSIC = n_map.addMarker(USIC);
        automobileWorkshop = n_map.addMarker(AutomobileWorkshop);
        tennisCourt = n_map.addMarker(TennisCourt);
        parking = n_map.addMarker(Parking);
        centralLib = n_map.addMarker(CentralLib);
        centralOffice = n_map.addMarker(CentralOffice);
        mainGate = n_map.addMarker(MainGate);
        vollyballCourt = n_map.addMarker(VollyballCourt);
        techClg = n_map.addMarker(TechClg);
        compCentre = n_map.addMarker(CompCentre);
        girlsCanteen = n_map.addMarker(GirlsCanteen);
        pshycoDept = n_map.addMarker(PshycoDept);
        scienceGround = n_map.addMarker(ScienceGround);
        desBlock = n_map.addMarker(DesBlock);
        n_map.setOnInfoWindowClickListener(this);
//        drawCircle(new LatLng(27.181858,77.967742));
        drawCircle(new LatLng(27.21091433,78.00256754));


    }

    public void onInfoWindowClick(Marker marker) {
        if (marker.equals(iCT)) {
            Intent intent = new Intent(activity_2.this, FacultyOfIntegratedMedicines.class);
            startActivity(intent);
        }
        if (marker.equals(fOScience)) {
            Intent intent = new Intent(activity_2.this, FacultyOfScience.class);
            startActivity(intent);
        }
        if (marker.equals(fOEngg)) {
            Intent intent = new Intent(activity_2.this, FacultyOfEngineering.class);
            startActivity(intent);
        }
        if (marker.equals(enggWorkshop)) {
            Intent intent = new Intent(activity_2.this, Workshop.class);
            startActivity(intent);
        }
        if (marker.equals(electricalEnggDept)) {
            Intent intent = new Intent(activity_2.this, DepartmentOfElectricalEngineering.class);
            startActivity(intent);
        }
    }

    private void flyTo(CameraPosition dei) {
        n_map.animateCamera(CameraUpdateFactory.newCameraPosition(dei), 3000, null);
    }


    @Override
    public void onLocationChanged(Location location) {
        LatLng myCoordinates = new LatLng(location.getLatitude(), location.getLongitude());
        mycoordinates = myCoordinates;
        CameraPosition camera = CameraPosition.builder().target(myCoordinates).zoom(19).tilt(10).build();
        n_map.moveCamera(CameraUpdateFactory.newCameraPosition(camera));
        myLocation.setPosition(myCoordinates);
//        Toast.makeText(getBaseContext(), "lat"+location.getLatitude()+"lon"+location.getLongitude(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }

    @SuppressLint("MissingPermission")
    private void requestLocation() {
        Criteria criteria = new Criteria();
        criteria.setAccuracy(Criteria.ACCURACY_FINE);
        criteria.setPowerRequirement(Criteria.POWER_HIGH);
        String provider = locationManager.getBestProvider(criteria, true);
        locationManager.requestLocationUpdates(provider, 1000, 1, this);
    }

    private boolean isLocationEnabled() {
        return locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER) ||
                locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
    }

    @SuppressLint("NewApi")
    private boolean isPermissionGranted() {
        if (checkSelfPermission(android.Manifest.permission.ACCESS_COARSE_LOCATION)
                == PackageManager.PERMISSION_GRANTED || checkSelfPermission(android.Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            Log.v("mylog", "Permission is granted");
            return true;
        } else {
            Log.v("mylog", "Permission not granted");
            return false;
        }
    }

    private void showAlert(final int status) {
        String message, title, btnText;
        if (status == 1) {
            message = "Your Locations Settings is set to 'Off'.\nPlease Enable Location to " +
                    "use this app";
            title = "Enable Location";
            btnText = "Location Settings";
        } else {
            message = "Please allow this app to access location!";
            title = "Permission access";
            btnText = "Grant";
        }
        final AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setCancelable(false);
        dialog.setTitle(title)
                .setMessage(message)
                .setPositiveButton(btnText, new DialogInterface.OnClickListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public void onClick(DialogInterface paramDialogInterface, int paramInt) {
                        if (status == 1) {
                            Intent myIntent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                            startActivity(myIntent);
                        } else
                            requestPermissions(PERMISSIONS, PERMISSION_ALL);
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface paramDialogInterface, int paramInt) {
                        finish();
                    }
                });
        dialog.show();
    }

    public void showPopup(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.popup_menu, popup.getMenu());
        popup.show();
        popup.setOnMenuItemClickListener((PopupMenu.OnMenuItemClickListener) this);
    }


    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.dei:
                flyTo(DEI);
                return true;
            case R.id.my_loc:
                flyTo(CameraPosition.builder().target(mycoordinates).zoom(17).build());
                return true;
            case R.id.normal:
                n_map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                return true;
            case R.id.satellite:
                n_map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                return true;
            case R.id.hybrid:
                n_map.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                return true;
            case R.id.terrain:
                n_map.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
                return true;

        }
        return false;
    }

    @SuppressLint({"WrongConstant", "MissingPermission"})
    private void drawCircle(LatLng point){

        // Instantiating CircleOptions to draw a circle around the marker
        CircleOptions circleOptions = new CircleOptions();

        // Specifying the center of the circle
        circleOptions.center(point);

        // Radius of the circle
        circleOptions.radius(1);

        // Border color of the circle
        circleOptions.strokeColor(R.color.colorPrimaryDark);

        // Fill color of the circle
        circleOptions.fillColor(0x30ff0000);

        // Border width of the circle
        circleOptions.strokeWidth(2);

        // Adding the circle to the GoogleMap
        n_map.addCircle(circleOptions);

        Intent proximityIntent = new Intent("my");

        // Passing latitude to the PendingActivity
        proximityIntent.putExtra("lat",point.latitude);

        // Passing longitude to the PendingActivity
        proximityIntent.putExtra("lng", point.longitude);

        // Creating a pending intent which will be invoked by LocationManager when the specified region is
        // entered or exited
        pendingIntent = PendingIntent.getActivity(getBaseContext(), 0, proximityIntent,Intent.FLAG_ACTIVITY_NEW_TASK);

        // Setting proximity alert
        // The pending intent will be invoked when the device enters or exits the region 20 meters
        // away from the marked point
        // The -1 indicates that, the monitor will not be expired
        locationManager.addProximityAlert(point.latitude, point.longitude, 1, -1, pendingIntent);

    }


}



