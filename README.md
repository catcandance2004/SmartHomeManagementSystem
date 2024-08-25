# Smart Home Management System

## Overview

The Smart Home Management System is a Java-based application that allows users to manage various smart devices within a home. The project includes features for adding and removing devices, user management, and device operations. It also includes logging and analytics capabilities for tracking device usage.

## Project Structure

- `com.smarthome.MainApp`: The entry point of the application.
- `com.smarthome.devices`: Contains classes representing different types of devices (e.g., `SmartLight`, `Thermostat`, `SmartDoorLock`, `SecurityCamera`).
- `com.smarthome.management`: Contains classes for managing users (`UserManager`) and devices (`DeviceManager`).
- `com.smarthome.users`: Contains user-related classes (`User`, `AdminUser`, `RegularUser`).
- `com.smarthome.analytics`: Contains the `DeviceLogger` class for logging and analytics.

## Classes and Their Roles

### Device.java
An abstract class that defines the basic properties and behaviors of a smart device. All other device types extend this class.

### SmartLight.java
A class representing a smart light device. It inherits from `Device` and implements the `operate` method to define how the light operates.

### Thermostat.java
A class representing a thermostat device. It allows setting and getting the temperature and implements the `operate` method to define its behavior.

### SmartDoorLock.java
A class representing a smart door lock. It provides methods to lock and unlock the door and implements the `operate` method.

### SecurityCamera.java
A class representing a security camera device. It allows starting and stopping recording and implements the `operate` method.

### DeviceManager.java
A class that manages all devices in the system. It allows adding, removing, and retrieving devices.

### UserManager.java
A class that manages users in the system. It allows adding, removing, and retrieving users.

### AdminUser.java
A subclass of `User` with additional capabilities to manage other users and devices. It can add/remove users and devices, and list all users and devices.

### RegularUser.java
A subclass of `User` with limited access. Regular users can only interact with the devices they own.

### DeviceLogger.java
A class that logs actions performed on devices for analytical purposes.

## Testing

Unit tests have been written for the device classes to ensure correct behavior. These can be found in the `test/` directory.

## How to Run the Project

1. Clone the repository.
2. Open the project in your preferred IDE.
3. Run `MainApp.java` to start the application.
4. The console will display various actions as defined in the `MainApp` class.

## Future Extensions

- Implement additional device types such as Smart TVs or Smart Speakers.
- Add a user interface using JavaFX or Swing.
- Enhance analytics by integrating a database to store and retrieve logs.
- Implement a web interface to control the smart home remotely.

## Contributions

Feel free to fork the project, make improvements, and submit a pull request.

## License

This project is licensed under the MIT License.