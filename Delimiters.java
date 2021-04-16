import java.util.*;

public class Delimiters
{
	private String openDel;
	private String closeDel;

	public Delimiters(String open, String close)
	{
		openDel = open;
		closeDel = close;
	}

	public ArrayList<String> getDelimitersList(String[] tokens)
  {
	  //create an arrayList
    ArrayList<String> d = new ArrayList<String>();
    //Loop through tokens
    for(int a = 0; a < tokens.length; a++)
    {
    //if current element is openDel or closedDel
      if(tokens[a].equals(openDel))
      {
        //add to the arrayList
        d.add(tokens[a]);
      }
      if(tokens[a].equals(closeDel))
      {
        //add to the arrayList again
        d.add(tokens[a]);
      }
    //return arrayList
    
    }  
    return d; 
  }

	public boolean isBalanced(ArrayList<String> delimiters)
  {
    //Create 2 count variables
    int a = 0;
    int b = 0;
    //Loop through the list
    for(int c = 0; c < delimiters.size(); c++)
    {
    //If the element is openDel
      if(delimiters.get(c).equals(openDel))
      {
        //increment a
        a++;
      }
      //else
      else
      {
        //increment b
        b++;
      }
      //if b > a
      if(b > a)
      {
        //return false
        return false;
      }
    }
    //if a = b
    if(a == b)
    {
      //return true
      return true;
    }
  //return false
  return false;
  }
}