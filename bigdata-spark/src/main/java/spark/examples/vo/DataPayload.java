package spark.examples.vo;

import java.util.List;
import java.io.Serializable;
import java.util.ArrayList;

public class DataPayload implements Serializable {

	public List<String> payload = new ArrayList<String>();

	@Override
	public String toString() {

		String output = "";

		for (String s : payload) {
			output = output + s + "\n";
		}
		return output.trim();
	}
}