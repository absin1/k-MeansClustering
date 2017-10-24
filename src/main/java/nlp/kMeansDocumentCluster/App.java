package nlp.kMeansDocumentCluster;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		File file = new File("data/615855.txt");
		if (file.exists()) {
			System.out.println("Found");
		} else {
			System.err.println("Not found");
		}
	}
}
