package androidUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AJ9 on 28/11/14.
 */
public class JSONReference {
    public JSONReference(){

        //Standard JSON Object

        JSONObject JSONObj = new JSONObject();


        //JSON Array from array of ints. ONLY IN API 19.

        int[] arr = new int[]{1,2,3};


        try {
            JSONArray above19JSONArray = new JSONArray(arr);
        }
        catch (JSONException je){

        }

        //JSON Array from ints < API 19
        List<Integer> intList = new ArrayList<Integer>();
        for (int i : arr) {
            intList.add(i);
        }
        JSONArray below19JSONArray = new JSONArray(intList);


        //Put an attribute to the JSON object

        try {
            JSONObj.put("publicKey", below19JSONArray);

        }
        catch (JSONException je){

        }
    }


}
