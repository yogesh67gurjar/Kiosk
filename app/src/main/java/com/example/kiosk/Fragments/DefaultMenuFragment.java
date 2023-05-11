package com.example.kiosk.Fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kiosk.Adapters.MenuListAdapter;
import com.example.kiosk.Data.Menu.Data;
import com.example.kiosk.Data.Menu.MenuResponse;
import com.example.kiosk.R;
import com.example.kiosk.Room.DatabaseHelper;
import com.example.kiosk.Service.Api_interface;
import com.example.kiosk.Service.Retrofit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DefaultMenuFragment extends Fragment {


    Context context;
    RecyclerView menu_list_rv;
    MenuListAdapter menuListAdapter;
    RecyclerView.LayoutManager LayoutManager;
    Integer shopID, categoryId, page, limit;
    Api_interface retrofitInterface;

    public DefaultMenuFragment(Context context) {
        this.context = context;
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_default_menu, container, false);

        menu_list_rv = rootView.findViewById(R.id.menu_list_rv);

        SharedPreferences sharedPreferences = requireActivity().getSharedPreferences("my_preferences", Context.MODE_PRIVATE);
        shopID = sharedPreferences.getInt("ShopID", 0);

        categoryId = 0;
        page = 1;
        limit = 50;


        LayoutManager = new GridLayoutManager(getActivity(), 3);
        menu_list_rv.setLayoutManager(LayoutManager);

        MenuList(shopID, categoryId, page, limit);

        return rootView;
    }

    private void MenuList(Integer shopID, Integer categoryId, Integer page, Integer limit) {
        retrofitInterface = Retrofit.getRetrofit().create(Api_interface.class);
        Call<MenuResponse> caaall = retrofitInterface.menuList(shopID, categoryId, page, limit);
        caaall.enqueue(new Callback<MenuResponse>() {
            @Override
            public void onResponse(Call<MenuResponse> call, Response<MenuResponse> response) {
                if (response.isSuccessful()) {

                    if (response.body().getData() != null) {
                        menuListAdapter = new MenuListAdapter(getContext(), response.body().getData().getShopMenu());
                        menu_list_rv.setAdapter(menuListAdapter);
                        menu_list_rv.setHasFixedSize(true);
                    } else {
                        Toast.makeText(requireActivity(), "No Data Found", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(requireActivity(), "Error Please Try Again", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<MenuResponse> call, Throwable t) {
                Toast.makeText(requireActivity(), "Network Failed", Toast.LENGTH_SHORT).show();
            }
        });

    }
}