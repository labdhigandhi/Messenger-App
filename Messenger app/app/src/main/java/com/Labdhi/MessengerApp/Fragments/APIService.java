package com.Labdhi.MessengerApp.Fragments;

import com.Labdhi.MessengerApp.Notifications.MyResponse;
import com.Labdhi.MessengerApp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAARIf5QkE:APA91bEsAkkVazC0zs36_R6-rGIK6Qx9dFswnkXMn5WtBexXDXOAaSMZIa1a_G5vhZMamPer0QWhtEai7OEtp1D8eF7xjYJK8jDVocdyTxJZOF3EXxxrpC4K8FAEXuJoEA-Ctzq0zck_"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
