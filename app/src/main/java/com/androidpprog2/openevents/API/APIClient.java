package com.androidpprog2.openevents.API;



import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {

    private static APIClient shared;

    private Retrofit retrofit;
    private APIService service;


    public static APIClient getInstance() {
        if (shared == null) {
            shared = new APIClient();
        }

        return shared;
    }


    public APIClient() {
        retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        this.service = retrofit.create(APIService.class);
    }


    public void createUser(Callback<Login> callback, Login task) {
        this.service.createUser(task).enqueue(callback);
    }


}
