# We Hackathon Starter Kit

The start kit is a working Android app.  The app provides features that can be used as basic building blocks to build your own unique Android app.  The features available are:

Working code:
* Registration Form
* Map using Google Apis
* Information that links to webpage using WebView
* Weather using Weather API Rest Client 
* Play video

Place holders that can be used or deleted:
* Share
* Send
* Settings
* Floating Action Button

### Installing

Instructions for compiling and opening app:
* Download or clone git repository
```
git clone https://github.com/sandroid/WeHackathonPrototype.git
```

* Launch Android Studio

    Download from :  https://developer.android.com/studio/index.html
    
* Import project into Android Studio
* Run project to compile and install app on device
* Launch app

![wehackathon](https://user-images.githubusercontent.com/11093935/33496557-85149bae-d67f-11e7-94d7-145dfaef6e7c.png)



##Troubleshooting
If you are using Mac OSX and get an error with text like "Intel HAXM is required to run this AVD. /dev/kvm is not found"
Do the following to fix:
https://stackoverflow.com/questions/46565353/dev-kvm-is-not-found-on-mac-os

Do note that once the emulator is running, its process thread  will need to be stopped with a separate command.
 The IDE will NOT do this task.

