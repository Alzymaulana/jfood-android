package com.example.jfood_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import com.android.volley.Response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expandableListView;
    private ArrayList<Seller> listSeller = new ArrayList<>();
    private ArrayList<Food> foodIdList = new ArrayList<>();
    private HashMap<Seller, ArrayList<Food>> childMapping = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listAdapter = new MainListAdapter(MainActivity.this, listSeller, childMapping);
        expandableListView.setAdapter(listAdapter);

    }

    protected void refreshList(){
        Response.Listener<String> responseListener = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try{
                    JSONArray jsonResponse = new JSONArray(response);
                    for(int i=0;i<jsonResponse.length();i++){
                        JSONObject food = jsonResponse.getJSONObject(i);
                        JSONObject seller = food.getJSONObject("seller");
                        JSONObject location = seller.getJSONObject("location");

                        String city = location.getString("city");
                        String province = location.getString("province");
                        String description = location.getString("description");

                        Location location1 = new Location(city, province, description);

                        int sellerId = seller.getInt("id");
                        String sellerName = seller.getString("name");
                        String sellerEmail = seller.getString("email");
                        String sellerNumber = seller.getString("phoneNumber");

                        Seller newSeller = new Seller(sellerId, sellerName, sellerEmail, sellerNumber, location1);

                        if(listSeller.size()>0){
                            boolean success = true;
                            for (Seller object : listSeller){
                                if((object.getId()==(newSeller.getId()))){
                                    success = false;
                                }
                            }
                            if(success){
                                listSeller.add(newSeller);
                            }
                        }
                        else{
                            listSeller.add(newSeller);
                        }

                        int foodId = food.getInt("id");
                        int foodPrice = food.getInt("price");
                        String foodName = food.getString("name");
                        String foodCategory = food.getString("category");

                        Food newFood = new Food(foodId,foodName,foodPrice, foodCategory,newSeller);

                        foodIdList.add(newFood);

                    }
                    for(Seller sel:listSeller){
                        ArrayList<Food> temp = new ArrayList<>();
                        for(Food food:foodIdList){
                            if(food.getSeller().getName().equals(sel.getName()) || food.getSeller().getEmail().equals(sel.getEmail()) || food.getSeller().getPhoneNumber().equals(sel.getPhoneNumber())){
                                temp.add(food);
                            }
                        }
                        childMapping.put(sel,temp);
                    }

                } catch (JSONException e) {
                    Log.d("no_response", Objects.requireNonNull(e.getMessage()));
                }
            }
        };
    }
}