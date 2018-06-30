package me.chrislewis.flixster.models;

import org.json.JSONException;
import org.json.JSONObject;

public class Movie {

    // values from API
    String title;
    String overview;
    String posterPath; // only path to poster
    String backdropPath;

    // no-arg constructor, for using Parcelable
    public Movie() {}

    // initialize from JSON object
    public Movie(JSONObject object) throws JSONException {
         title = object.getString("title");
         overview = object.getString("overview");
         posterPath = object.getString("poster_path");
         backdropPath = object.getString("backdrop_path");
    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getBackdropPath() {
        return backdropPath;
    }
}
