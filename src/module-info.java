module JavaAGroupProject {
	/* Original */
//	requires javafx.graphics;
//	requires javafx.fxml;
//	requires javafx.controls;

//	opens application to javafx.graphics, javafx.fxml;

	/* Testing */
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires javafx.graphics;
	requires java.xml;

	opens application to javafx.graphics, javafx.fxml;

	/******* Possible Okay to run ********/
//	exports application;
//
//	opens application to javafx.graphics;
//
//	requires transitive javafx.graphics;
//	requires javafx.controls;
//	requires javafx.fxml;

}
