import javax.script.*;
import java.io.*;
public class JavascriptFile
{
	public static void main(String[] args)throws Exception
	{
		ScriptEngineManager manager=new ScriptEngineManager();
		ScriptEngine engine=manager.getEngineByName("javascript");
		FileReader file=new FileReader("test.js");
		engine.eval(file);
	}
}
