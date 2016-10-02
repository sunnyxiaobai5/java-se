import javax.script.*;
public class JavascriptPrint
{
	public static void main(String[] args)throws Exception
	{
		ScriptEngineManager manager=new ScriptEngineManager();
		ScriptEngine engine=manager.getEngineByName("javascript");
		engine.eval("print('hello\\n')");
	}
}
