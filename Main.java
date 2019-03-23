public class Main {

    public static void main(String[] args) {
	    // If you want to replace  ' by " in your string, you can use the following code:
        String jsonText = "{'name': 'Yuki', 'feedback': 'OK'}";
        jsonText = jsonText.replaceAll("(')", "\"");

        System.out.println(jsonText);
    }
}
