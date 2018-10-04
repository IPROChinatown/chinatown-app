package com.example.ipro.chinatownapp;

import android.support.annotation.ArrayRes;
import android.support.annotation.StringRes;

public interface LanguageView {
    void setTextById (@StringRes int id);
    void setTextWithString (String text);
    void setTextByArrayAndIndex (@ArrayRes int arrId, @StringRes int arrIndex);

    void reLoadLanguage(); //change default language
}