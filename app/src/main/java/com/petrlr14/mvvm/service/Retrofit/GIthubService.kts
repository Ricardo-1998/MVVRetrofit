package com.petrlr14.mvvm.service.Retrofit

import javax.xml.ws.Response

interface GithubService{

    @GET("/users/{user}/repos")
    fun getRepos(@Path("user")user : String) : Deferred<Response<List<GithubRepo>>>

    companion object {
        fun getGithubService():GithubService{
            return Retrofit.Builder()
                .addConverterFactory(MoshiCOnverterFactory.create())
                .addCallAdapterFactory(CoroutineCallAdapterFactory())
                .build().create(GithubService::class.java)
        }
    }

}