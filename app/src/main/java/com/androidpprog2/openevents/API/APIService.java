package com.androidpprog2.openevents.API;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;


public interface APIService {


    @POST("todos/")
    Call<Login> createUser(@Body Login login);


}
