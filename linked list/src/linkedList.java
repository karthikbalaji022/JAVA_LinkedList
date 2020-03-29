
public class linkedList {
	Node head;
	public void add(int data)
	{
		Node n= new Node();
		n.data=data;
		n.next=null;
		
		if(head==null) {
			head=n;
		}else {
			Node node=head;
			while(node.next!=null)
			{
				node=node.next;
			}
			node.next=n;
		}
	}
	
	public void show()
	{
		Node print=head;
		while(print.next!=null)
		{
			System.out.print(print.data+" ");
			print=print.next;
		}
		System.out.print(print.data);
	}
	
	public void delete(int pos)
	{
		if(pos==0)
		{
			head=head.next;
		}else {
		Node skim=head;
		for(int i=0;i<pos-1;i++)
		{
			if(skim.next!=null)
			{
				skim=skim.next;
			}
		}
		//skim.next.data=0;

		skim.next=skim.next.next;
		}
		}
	
	public void insertAtStart(int data)
	{
		Node start=new Node();
		
		start.data=data;
		start.next=head;
		head=start;
	}
	
	public void insertAt(int pos,int data)
	{
		Node n=new Node();
		n.data=data;
		n.next=null;
		Node skim=head;
		for(int i=0;i<pos-1;i++)
		{
			if(skim.next!=null)
			{
				skim=skim.next;
			}
			
		}
		n.next=skim.next;
		skim.next=n;

	}
}
