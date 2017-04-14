package com.here.service;

import com.here.entity.CityList;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by wanghb on 2017/4/14.
 */

public interface HereService {
    @GET("loc/list")
    Observable<CityList> getCityList();
}
