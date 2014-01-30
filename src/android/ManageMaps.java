package com.periskal.manageMaps;
 
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import android.app.Activity;
import android.content.Intent;

public class ManageMaps extends CordovaPlugin {
    public static final String ACTION_GO_TO_LAT_LON_POSITION = "goToLatLonPosition";
    
    @Override
    public JSONObject execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        try {
            if (ACTION_GO_TO_LAT_LON_POSITION.equals(action)) { 
                JSONObject arg_object = args.getJSONObject(0);
                
                Tile test = new Tile(arg_object.getFloat("latitude"), arg_object.getFloat("longitude"));
                JSONObject object=new JSONObject();
				
                
               callbackContext.success();
               return object;
            }
            callbackContext.error("Invalid action");
            return false;
        } catch(Exception e) {
            System.err.println("Exception: " + e.getMessage());
            callbackContext.error(e.getMessage());
            return null;
        } 
    }
}
