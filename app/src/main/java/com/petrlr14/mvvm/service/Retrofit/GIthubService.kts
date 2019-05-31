package com.petrlr14.mvvm.service.Retrofit

import javax.xml.ws.Response

const val GITHUB_API_BASE_URL = "https://api.github.com/"

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