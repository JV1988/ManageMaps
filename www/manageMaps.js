var manageMaps =  {
    goToLatLonPosition: function(latitude, longitude, successCallback, errorCallback) {
        cordova.exec(
            successCallback, // success callback function
            errorCallback, // error callback function
            'ManageMaps', // mapped to our native Java class called "Calendar"
            'goToLatLonPosition', // with this action name
            [{                  // and this array of custom arguments to create our entry
                "latitude": latitude,
                "longitude": longitude
            }]
        );
    }
}
module.exports = manageMaps;
