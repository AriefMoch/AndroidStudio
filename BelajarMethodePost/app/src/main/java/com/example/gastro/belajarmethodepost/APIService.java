package com.example.gastro.belajarmethodepost;

import java.util.HashMap;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by gastro on 11/17/17.
 */

public interface APIService {

    @FormUrlEncoded
    @POST("/login")
    Call<ResponseBody> postLogin(@FieldMap HashMap<String, String> params);

    @GET("api")
    Call<ResponseBody> getResultAsJSON();

}
