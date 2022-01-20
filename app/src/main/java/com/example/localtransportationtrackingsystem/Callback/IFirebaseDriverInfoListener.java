package com.example.localtransportationtrackingsystem.Callback;

import com.example.localtransportationtrackingsystem.Model.DriverGeoModel;

public interface IFirebaseDriverInfoListener {
    void onDriverInfoLoadSuccess(DriverGeoModel driverGeoModel);
}
