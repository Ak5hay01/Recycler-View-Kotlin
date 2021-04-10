# Recycler-View-Kotlin

# Implementing the Recycler view is tricky but if you master it, it's very simple and easy.

# Following are the important steps for creating recycler view in Android

# 1. We need to add Dependency of recycler view
# 2. We need to create a view for items (How the item will look in list/recycler view)
# 3. Create Model class for the data that we are going to bind
# 4. Create an Adapter (Most important step)
# 5. Add Recycler view widget to Main Activity XML/Layout file
# 6. Initialize the Recycler view and bind data in Main Activity (Kotlin file)

# In this Solution I have used 
# 1. Glide for getting online Android version images 
# 2. Card View for better UI 

# Abouth the Application
I have added all the android versions from 'Android Jelly Bean' to 'Android 11'. I have also implemented the on click listener using the interface method which is considered the most efficient way to handle the on click listener. I have used dummy data to bind in the recyclr View. I have also used Glide library for fetching images from web or remote server. I have added a dummy background image if glide is not able to fetch required Image. 

# Recycler view will look something as follows

![alt text](/screenshot/Screenshot_20210410-194413.jpg)

# If we click on the Item in recycler view/Android version name, a toast will pop-up with the android name which was clicked

![alt text](/screenshot/Screenshot_20210410-194420.jpg)  
