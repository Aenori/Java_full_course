import java.util.*;

public class Chat {
	private static final List<Chat> listeChat 
		= new ArrayList();

	private int id;
	
	public static Chat getChatFromId(int id)
	{
		return Chat.getListeChat().get(id);
	}
	
	public static List<Chat> getListeChat()
	{
		return listeChat;
	}
	
	public Chat()
	{
		id = listeChat.size();
		listeChat.add(this);
	}
}
