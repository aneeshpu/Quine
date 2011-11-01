import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class QuineMaker {

	public static void main(String[] args) throws IOException {

		final FileReader fileReader = new FileReader(new File("/home/aneeshpu/programming/android_workspace/Quine/src/quineinput.txt"));
		int charRead = 0;
		for (int i = 88; (charRead = fileReader.read()) != -1; i++) {
			System.out.println(String.format("quine[%d] = '%c';", i, charRead));
		}
	}
}
