package com.example.android.miwok;

//represents a miwok word and the english translation

public class Word {
    // user's language version of the word
    private String mDefaultTranslation;

    // miwok version of the word
    private String mMiwokTranslation;

    // constructor
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}
