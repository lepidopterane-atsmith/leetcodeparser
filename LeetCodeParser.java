
public class LeetCodeParser {
	
	public static void main (String[] args){
	  for (int i = 0; i < 4; i++)
	    args[i] = args[i].substring(1,args[i].length()-1);
	    
	  String[] cmds = args[0].split(",");
	  String[] params = args[1].split(",");
	  String[] unx = args[2].split(",");
	  String[] x = args[3].split(",");
	  
	  System.out.println("cmds \t params \t unx \t x");
	  for(int i = 0; i<cmds.length; i++){
		System.out.println(cmds[i]+" \t "+params[i]+" \t\t "+unx[i]+" \t "+x[i]);  
	  }
	}	

}
