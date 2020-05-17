package com.example.mycartapplicaton;

import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CartActivity extends AppCompatActivity {

    RecyclerView recyclerviewCart;
    public static TextView cartPrice;

  //  public static List<Map<Long,List<GeneralFood>>> list = new ArrayList<Map<Long,List<GeneralFood>>>();//This is the final list you need

//    public static Map<List<GeneralFood>,String> cartFood1 = new HashMap<>();
  //  public static List<GeneralFood> cartFoods = new ArrayList<>();
    public static Map<String, List<GeneralFood>> map1 = new HashMap<>();//This is one instance of the  map you want to store in the above list.
    public static List<GeneralFood> cartFoods = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

      /*  Toolbar mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        getSupportActionBar().setTitle("Food Cart");
        mToolbar.setTitleTextColor(0xFFFFFFFF);

        mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);

        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CartActivity.super.onBackPressed();
            }
        });*/
        ArrayList<GeneralFood>
                newList = removeDuplicates(cartFoods);

        cartPrice = findViewById(R.id.cart_price);
        cartPrice.setText(Double.toString(grandTotal(cartFoods)));
/*cartPrice.setText("0");*/
        recyclerviewCart = findViewById(R.id.cart_recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerviewCart.setLayoutManager(linearLayoutManager);
        recyclerviewCart.setNestedScrollingEnabled(false);
        recyclerviewCart.setAdapter(new CartAdapter(map1, R.layout.datacarttt, getApplicationContext()));


    }

    private ArrayList<GeneralFood> removeDuplicates(List<GeneralFood> cartFoods) {

            // Create a new ArrayList
            ArrayList<GeneralFood> newList = new ArrayList<GeneralFood>();

            // Traverse through the first list
            for (GeneralFood element : cartFoods) {

                // If this element is not present in newList
                // then add it
                if (!newList.contains(element)) {

                    newList.add(element);
                }
            }

            // return the new list
            return newList;

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
      /*  getMenuInflater().inflate(R.menu.menu_confirmation, menu);*/

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

      /*  if (id == R.id.order_button){
            Intent intent = new Intent(CartActivity.this, OrderActivity.class);
            startActivity(intent);
        }*/

        return super.onOptionsItemSelected(item);
    }

    public static int grandTotal(List< GeneralFood> cartFoods){


        int totalPrice = 0;
        for(int i = 0 ; i < cartFoods.size(); i++) {
            int p= Integer.parseInt(cartFoods.get(i).getProductPrice());
            int c=cartFoods.get(i).getCount();
      //      Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
            totalPrice +=p*c;
        }
        return totalPrice;

    }

/*    public static int updateValue(List< GeneralFood> cartFoods,int s)
    {
        for(int i = 0 ; i < cartFoods.size(); i++) {
            int s= Integer.parseInt(cartFoods.get(i).getProductPrice());
            totalPrice += s;
        }
    return totalPrice;
    }*/

    public static void priceAdjust(){
        cartPrice.setText(String.valueOf(grandTotal(cartFoods)));
    }

    public static boolean checkList(List< GeneralFood> cartFoods,GeneralFood item)
    {
        boolean b=false;
        if(cartFoods.contains(item)){
            b=true;
        }
        else
        {
            b=false;
        }
        return b;
    }
    public static boolean checkMap(Map<String, List<GeneralFood>> map1, String itemId){

        boolean c=false;
        if(map1.containsKey(itemId)){
            c=true;
        }
        else
        {
            c=false;
        }
        return c;
    }

}
