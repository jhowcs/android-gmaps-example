package br.com.android.jhowcs.maps2;

import android.content.SearchRecentSuggestionsProvider;

/**
 * Created by jonathan_campos on 06/03/2016.
 */
public class MySuggestionProvider extends SearchRecentSuggestionsProvider {
    public final static String AUTHORITY = "br.com.android.jhowcs.maps2";
    public final static int MODE = DATABASE_MODE_QUERIES;

    public MySuggestionProvider() {
        setupSuggestions(AUTHORITY, MODE);
    }
}
