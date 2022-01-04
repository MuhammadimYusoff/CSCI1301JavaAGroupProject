module JavaAGroupProject {
//	requires javafx.graphics;
//	requires javafx.fxml;
//	requires javafx.controls;

//	opens application to javafx.graphics, javafx.fxml;

	exports application;

	opens application to javafx.graphics;

	requires transitive javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;

}
