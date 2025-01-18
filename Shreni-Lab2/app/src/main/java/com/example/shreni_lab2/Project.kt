package com.example.shreni_lab2

data class Project(var title: String, var description: String, var authors: String, var projectLinks: String,
    var keywords: String, var isFavorite:Boolean) {
    companion object {
        var project =
            Project("Weather Forecast", "Weather Forcast is an app ...", "Author Name",
        "Project Link","Key word to search",
         false,)
    }
}



