!! THIS IS FOR INTELLIJ !!

How to install javaFX:

1. Download javaFX from this link: https://gluonhq.com/products/javafx/ (Download 11.0.2 for your specific operator)

2. Put the javafx folder inside zip to your Catan project (place is your choice, but make sure it is okay)

3. Open up Intellij

4. Go to File > Project Structure > Global Libraries

5. Click on the plus symbol on the upper left and click Java.

6. From the file selector window, go to the javafx folder you downloanded and put, go to lib and select every file except the src zip
and the properties file (so select every executable file)

7. Click OK on file selector

8. Right click the module you just added and click "Add Module to the Project" (or something similar I don't remember exactly), click Apply
on bottom right and then you are done with modules.

Edit Configurations:

For the files you want to run (In our case the GameStart, but you may have Test UI files you want to run) go to Run > Edit Configurations
and select your main class. For its VM Options, copy paste this in there (except change the part I marked below):
--module-path **PATH TO YOUR JAVAFX FOLDER**\javafx-sdk-11.0.2\lib --add-modules javafx.controls,javafx.fxml
and click Apply then OK. You are done with JavaFx

How to install AnimateFX:

In Intellij go to File > Project Structure > Global Libraries and click the plus sign on the upper left and click Maven.

Copy and paste this to the text box:

<dependency>
  <groupId>io.github.typhon0</groupId>
  <artifactId>AnimateFX</artifactId>
  <version>1.2.1</version>
  <type>pom</type>
</dependency>

then click OK, it will download it for you.

You are done with installing AnimateFX.

How to add javafx.media:

Open edit configuration of GameApplication.
At VM options, add javafx.media to the end of the line.
Click OK. It is done!

How to install Socket-IO:

1. Go to https://jar-download.com/artifacts/io.socket/socket.io-client/1.0.0/source-code

2. Download socket-io (1.0.0)

3. In the zip files you just downloaded, there are 5 jar files, put them in a folder and put the folder 
in a place of your choice (make note of path)

4. In Intellij, go to File > Project Structure

5. Go to libraries

6. Click the plus sign, select java and select all 5 jar files you downloaded.

7. Click ok and add the jar files to the modules.

8. Click apply and ok.

AFTER YOU HAVE DONE BOTH, YOU CAN RUN THE MAIN UI CLASSES OF THE PROJECT!
