# Project README

## 0.1 Abstract
This Lab is to level-up from the basic "hello android" application where the application was created by selecting an empty activity to a new application where some modifications and implementations are required in an older application code. The requirements are to modify the Project data class in a way to add other fields in the application.

## 0.2 Introduction
The objective of this lab is to modify an application which has edit features. It allows the user to see the project and then click on the edit button to navigate to the edit page. In the edit page, the user can edit and on saving it, the user will be navigated to the first page which displays the updated information of the project. In the page to display the project, the user can mark the project as their favourite.

## 0.3 Procedures
This application was created in Android Studio. A modern toolkit, Jetpack Compose, is used for building native UI of the application. A new empty project was created and then code from Project data class is created and the project setup was completed. After successfully executing the code, the modifications are done.

The project structure of the application looks like the below image.

MainActivity.kt is the main file that was used to create the functionality and layout of the application. The use of XML files for creating and managing layout is not needed here as Jetpack Compose is being used. It makes the work easier by building native UI of the application in the MainActivity file using Kotlin.

The MainActivity.kt contains the composable function, NavGraph. This function contains the logic for navigation to the edit page and then back to the display page. A data class `Project` is created which contains the companion object. Inside the `components` package, `ProjectDetail.kt` and `ProjectEdit.kt` are there. These files contain the composable objects for displaying the project and editing the project respectively.

## 0.4 Results
This application shows the project on the first screen. On clicking the edit button, the user can navigate to the edit screen. On clicking the submit button, it goes back to the display screen where the user can set the project as a favourite project.  
GitHub link to the repository of this lab is [Shreni-Lab2](https://github.com/your-repository-link)

## 0.5 Conclusion
This lab work contains modification of the previous version of the application. It is a necessary skill to understand the code and modify it according to the requirements. The navigation strategy is good as it uses the same button for two purposes. The key takeaway from this lab is learning the navigation and editing and displaying data on screen.

## 0.6 References
- The activity lifecycle

## 0.7 Activity Lifecycle

In Android, understanding the **Activity Lifecycle** is crucial to managing the app’s UI and resources effectively. The activity lifecycle consists of several methods that define the stages of an activity, such as when it is created, started, resumed, paused, stopped, or destroyed. For this application, we interact with the lifecycle through Jetpack Compose and Kotlin.

The main activity lifecycle methods used in this app are:

- **onCreate()**: Initializes the app and sets up the initial screen and navigation logic.
- **onStart()**: The activity becomes visible to the user but is not yet interactive.
- **onResume()**: The activity is in the foreground and ready to interact with the user.
- **onPause()**: Triggered when the activity is no longer in the foreground, allowing the app to save data or pause ongoing operations.
- **onStop()**: Called when the activity is no longer visible to the user, at which point resources can be released.
- **onDestroy()**: Invoked before the activity is destroyed, useful for cleaning up resources.

Even though Jetpack Compose simplifies state management and UI rendering, understanding the activity lifecycle ensures smooth navigation, data persistence, and optimal performance in the app.

