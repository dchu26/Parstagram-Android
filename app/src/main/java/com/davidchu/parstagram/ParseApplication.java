package com.davidchu.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseClassName;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("r0jTmyoysqRjed8jBIIFrc72kURAHfeQ4ju4Qv0N")
                .clientKey("GywiFV5TRoJXnlO2LqEeTB1WiK8OiDjarqSoqKPw")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
