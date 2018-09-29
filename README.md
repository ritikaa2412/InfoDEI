

## InfoDEI

This project involves developing an app that solves the problem of colleges, universities and institutions in which there are hundreds of rooms, offices, laboratories and a big work area which makes finding a particular room (example) difficult, so our application is going to tell everything about any room whether the question is how to reach there or occupancy chart of that room. 

 This application uses GPS to get the location updates and information like occupancy chart is stored in each activity itself. This application is able to navigate to any building right now but in future by improving the accuracy it’s going to navigate inside the building also. 

 This idea is first implemented for Dayalbagh Educational Institute as a learning experience and all things are made specific for DEI.

### INTRODUCTION

This application basically focuses on your location updates coming from GPS and then guide a user to reach its destination as Google Maps but there is a big limitation with Google Maps that it is not able to navigate inside the institution therefore using GPS coordinates and Google Map API, !nfo@DEI  provides navigation inside institution using Google Maps itself as an implicit intent.

 Since this application is implemented for DEI therefore this application is added with extra information and occupancy charts of rooms and labs which is shown to user when user come into the region of that room or laboratory using proximity alerts.

![image-19400707193530254](/Users/chandradeepgautam/Library/Application Support/typora-user-images/image-19400707193530254.png)

Application needs an API key to access the Google Maps servers. The type of key required is an API key with restriction for Android apps. The key is free. You can use it with any of your applications that call the Google Maps Android API, and it supports an unlimited number of users.

An API (Application Programming Interface) is a set of methods and tools that can be used for building software applications. Google Maps API allows you to display maps on your web site/ Application: Map Data.

Detailed guides to getting an API key:

1. Go to the Google API console ( <https://console.developers.google.com/apis/library/maps-android-backend.googleapis.com/?id=01d8f5af-dc9a-4b12-af6f-37029d8e3e71&project=trusty-legend-189717>)

2. Create or select a project

3. Click Continue to enable the Google Maps Android API

4. On the credentials page, get an API key
5. From the dialog displaying the API key, select restrict key to set an Android restriction on the API key

6.     In the restriction section, select android apps, then enter your app SHA1 fingerprint and package name. For e.g.:BB:OD:AC:74:D3:21:E1:43:67:71:9B:62:91:AF:A1:66:6E:44:5D:75
7.      Click Save 

An API key is a string of characters.

E.g.:AIzaSyBdv1-cTICSwascjascajdcjanjdsncxbvvfTYS0



## Final App

<video src="/Users/chandradeepgautam/Desktop/InfoDEI/output.mp4"></video>