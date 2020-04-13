package com.example.my.androiduberclone;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface UserService {

    @POST("/loginConsumer")
    @FormUrlEncoded
    Call<APIResponse> loginUser(@Field("username") String userName,
                             @Field("password") String password);
}

