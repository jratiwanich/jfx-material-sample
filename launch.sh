java \
--add-opens javafx.controls/com.sun.javafx.scene.control.behavior=com.jfoenix \
--add-opens javafx.controls/com.sun.javafx.scene.control=com.jfoenix \
--module-path /Users/jakratiwanich/projects/javafx/libs/jfoenix-9.0.10.jar:\
    /Users/jakratiwanich/projects/JavaLibs/javafx-sdk-15.0.1/lib \
    --add-modules com.jfoenix,javafx.controls,javafx.fxml \
-classpath build/classes \
org.dolosplus.example.material.MainLauncher