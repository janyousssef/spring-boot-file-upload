# Spring boot file upload

What if your application allows users to upload large files, but you don't want to wait for the entire file to be uploaded to start performing business logic?

## WebListener
Using WebListener you can execute code when a request is first created, and when it is destroyed

## WebFilter
Using WebFilter you can have finer grade control over when your code runs as you can supply it with URL[s] pattern[s].

Additionally, with filters you can stop a request from reaching your controller in the first place.