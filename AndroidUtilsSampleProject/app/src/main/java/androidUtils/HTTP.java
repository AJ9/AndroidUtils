package androidUtils;

import android.util.Log;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Created by AJ9 on 28/11/14.
 */
public class HTTP {

    public static final String TAG = "ANDROID TOOLS";

    public HTTP(){

    }

    public void sendPostRequest(final String url){

        new Thread(new Runnable() {
            public void run() {

                HttpClient client = new DefaultHttpClient();
                HttpPost post = new HttpPost(url);
                String serverResponse = null;

                
                JSONObject JSONObj;

                try {
                    JSONObj = new JSONObject();
                    StringEntity se = new StringEntity(JSONObj.toString());
                    post.setEntity(se);
                    HttpResponse httpresponse = client.execute(post);
                    serverResponse = EntityUtils.toString(httpresponse.getEntity());
                    Log.d(TAG, "Server Response: " + serverResponse);
                }

                catch (UnsupportedEncodingException ue){

                }
                catch (ClientProtocolException cpe){

                }
                catch (IOException ioe){

                }
            }
        }).start();
    }


}
