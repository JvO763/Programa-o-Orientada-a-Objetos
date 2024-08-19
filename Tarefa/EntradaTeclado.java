
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaTeclado {

	static private InputStreamReader isr = new InputStreamReader(System.in);

	static private BufferedReader br = new BufferedReader(isr);

	public static String leString() throws IOException {
		String x;
		x = br.readLine();
		return x;

	}

	public static int leInt() throws IOException, NumberFormatException  {
		String x = leString();
		return Integer.parseInt(x);
	}

	public static double leDouble() throws IOException, NumberFormatException {
		String x = leString();
		return Double.parseDouble(x);

	}
}
