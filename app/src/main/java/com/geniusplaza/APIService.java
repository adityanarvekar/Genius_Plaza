package com.geniusplaza;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIService {

    @POST("users")
    @FormUrlEncoded
    Call<Post> saveUser(@Field("name") String name,
                        @Field("job") String job);
}
