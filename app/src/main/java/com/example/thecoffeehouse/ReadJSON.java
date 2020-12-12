//package com.example.thecoffeehouse;
//
//import android.content.Context;
//
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//
//
//public class ReadJSON {
//    public static UuDai readUuDai(Context context) throws IOException,JSONException {
//        String jsonText = readText(context, R.raw.uudaidata);
//        JSONObject jsonRoot = new JSONObject(jsonText);
//
//        JSONArray jsonArray = jsonRoot.getJSONArray("UuDai");
//        ArrayList<UuDai> arrayUuDai = new ArrayList<>();
//        for(int i = 0; i <jsonArray.length(); i++){
//            arrayUuDai.add(jsonArray.get(i).getClass(UuDai.class));
//        }
//    }
//    private static String readText(Context context, int resId) throws IOException {
//        InputStream is = context.getResources().openRawResource(resId);
//        BufferedReader br= new BufferedReader(new InputStreamReader(is));
//        StringBuilder sb= new StringBuilder();
//        String s= null;
//        while((  s = br.readLine())!=null) {
//            sb.append(s);
//            sb.append("\n");
//        }
//        return sb.toString();
//    }
//}