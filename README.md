# SatelliteLaunch
# orbit
- Initializes a `Scanner` for user input and a `Satellite` object to simulate satellite operations.
- Displays the initial state of the satellite.
- Enters an infinite loop for handling user commands related to the satellite.
- Displays a menu with the following options, introducing a 1-second delay for each option:
  - Rotate
  - Activate Panels
  - Deactivate Panels
  - Collect Data
  - Display Status
  - Exit
- Prompts the user to enter a command number corresponding to the menu options.
- Reads the user's input and consumes the newline character.
- Executes different actions based on the user's command number:
  - Case 1: Rotates the satellite based on the specified direction (North/South/East/West).
  - Case 2: Activates the satellite panels.
  - Case 3: Deactivates the satellite panels.
  - Case 4: Simulates data collection by the satellite.
  - Case 5: Displays the current status of the satellite.
  - Case 6: Exits the program.
- Helper method to display a message with a specified delay using `Thread.sleep`.
- Continues the loop and introduces a 1-second time gap between commands (except for the "Exit" command).
- Exits the loop and closes the scanner when the "Exit" command is selected.
# satellite
Fields:
  - orientation: Represents the current orientation of the satellite (e.g., North, South, East, West).
  - solarPanelsActive: Indicates whether the solar panels of the satellite are active (true) or inactive (false).
  - dataCollected: Keeps track of the amount of data collected by the satellite.
- Constructor Initializes a `Satellite` object with an initial orientation of "North," inactive solar panels, and no data collected.
- Allows the satellite's orientation to be changed based on the provided direction.
- Activates the satellite's solar panels.
- Deactivates the satellite's solar panels.
- Increases the amount of data collected by the satellite by 10 units if the solar panels are active.
- Retrieves and returns a formatted string that provides the current status of the satellite, including its orientation, the status of solar panels (active or inactive), and the amount of data collected.

