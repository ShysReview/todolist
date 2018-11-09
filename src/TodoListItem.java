
public class TodoListItem {
	String description;
	int priority;
	boolean isdone;
	
	public TodoListItem(String description,int priority){
		this.description= description;
		this.priority= priority;
    	this.isdone= false;
	}
	
	

	public Object getDescription() {
		return description;
		
	}

	public void markDone() {
		// TODO Auto-generated method stub
		this.isdone=true;
	}

	public boolean isDone() {
		// TODO Auto-generated method stub
		return this.isdone;
	}

	public Object getPriority() {
		// TODO Auto-generated method stub
		return this.priority;
	}
}
