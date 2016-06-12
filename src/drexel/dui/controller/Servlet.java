/*
 * Author:Pranati Shrivastava
 * Class: Controller
 * */

package drexel.dui.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.ContainerServlet;

public class Servlet extends HttpServlet {
	
	String[] foodpreference= new String [] {"nothing"};	
	String[] cuisine= new String [] {"nothing"};
	String[] cookingExperience= new String[]{"beginner"};
	String[] cookingTime= new String[]{"30 min and less"};
	String[] mealType= new String[]{"nothing"};
	String calorie="200";
	String other= null;
	boolean food=false;
	boolean cookex=false;
	boolean cuisinecheck=false;
	boolean cooktimecheck=false;
	boolean mealcheck=false;
	boolean v1,v2,v3,v4,v5=false;
	boolean nv=false;
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doGet(req, resp);

	String result=req.getParameter("action");
	
	
	
/*	for(int i=0; i< foodpreference.length ;i++)
	{
		resp.getWriter().println("<html>");
		resp.getWriter().println("<body>");
		resp.getWriter().println("checkbox values are:"+foodpreference[i]);
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");
	}
	
*/	
	
	//resp.getWriter().print(foodpreference);
	//System.out.println(foodpreference);
	


	if("Next".equalsIgnoreCase(result))
	{
	
		foodpreference=req.getParameterValues("foodpreference");
		cookingExperience=req.getParameterValues("cookingExperience");
		/*for(int i=0; i< cookingExperience.length ;i++)
		{
			System.out.println(cookingExperience[i]);
		}*/
		resp.sendRedirect("page2.html");
		//System.out.println(foodpreference);
		for(int i=0; i< foodpreference.length ;i++)
		{
			System.out.println(foodpreference[i]);
		}
	}
	else if("Back".equalsIgnoreCase(result))
	{
		resp.sendRedirect("index.html");
	}
	else if("Ask Chef Oracle".equalsIgnoreCase(result))
	{
		//figure out null pointer exception here
		
		cuisine=req.getParameterValues("cuisine");
		cookingExperience=req.getParameterValues("cookingTime");
		mealType=req.getParameterValues("mealtype");
		calorie=req.getParameter("calorie");
		System.out.println(calorie);
		other=req.getParameter("other");
		System.out.println(other);
		
		/*for(int i=0; i< cookingTime.length ;i++)
		{
			System.out.println(cookingTime[i]);
		}*/
		for(int i=0; i< foodpreference.length ;i++)
		{
			System.out.println("****"+foodpreference[i]);
		}
		
		/*if(foodpreference.equals("eggitarian"))
		{
			System.out.println("hi******");
			resp.sendRedirect("page6.html");
		}*/
		
		 for(int i=0; i < foodpreference.length; i++){
             
             //check if string array contains the string
             if(foodpreference[i].equals("eggitarian")){

                     //string found
                  //   contains = true;
            	 food=true;
                    System.out.println("PPPPPP");
                    
             }
             if(foodpreference[i].equals("non-vegetarian"))
             {
            	 nv=true;
             }
             if(foodpreference[i].equals("vegan")){
               	 v1=true;
                       
                       
                }
		 }
		 cookingExperience= new String[]{"beginner"};
             for(int i=0; i < cookingExperience.length; i++){
                 
                 //check if string array contains the string
                 if(cookingExperience[i].equals("beginner")){

                         //string found
                      //   contains = true;
                	 cookex=true;
                        System.out.println("FFFFFFFF");
                        
                 }
     }
             
for(int i=0; i < cookingExperience.length; i++){
                 
                 //check if string array contains the string
                 if(cookingExperience[i].equals("beginner")){

                         //string found
                      //   contains = true;
                	 cookex=true;
                        System.out.println("FFFFFFFF");
                        
                 }
     }
cuisine= new String [] {"nothing"};
for(int i=0; i < cuisine.length; i++){
    
    //check if string array contains the string
    if(cuisine[i].equals("french") && cuisine[i].equals("american")){

            //string found
         //   contains = true;
   	 cuisinecheck=true;
           System.out.println("FRENCH");
           
    }
}
for(int i=0; i < cookingTime.length; i++){
    
    //check if string array contains the string
    if(cookingTime[i].equals("30 min and less")){

            //string found
         //   contains = true;
   	 cooktimecheck=true;
           System.out.println("cooking time");
           
    }
}
mealType= new String[]{"nothing"};
for(int i=0; i < mealType.length; i++){
    
    //check if string array contains the string
    if(mealType[i].equals("breakfast")){

            //string found
         //   contains = true;
   	 mealcheck=true;
           System.out.println("mealtype");
           
    }
}
//vegan wanton
for(int i=0; i < foodpreference.length; i++){
    
    //check if string array contains the string
    if(foodpreference[i].equals("vegan")){
   	 v1=true;
           
           
    }
}
cookingExperience= new String[]{"beginner"};
    for(int i=0; i < cookingExperience.length; i++){
        
        //check if string array contains the string
        if(cookingExperience[i].equals("expert")){
       	 v2=true;
               System.out.println("FFFFFFFF");
               
        }
}
    
cuisine= new String [] {"nothing"};
for(int i=0; i < cuisine.length; i++){

//check if string array contains the string
if(cuisine[i].equals("chinese") && cuisine[i].equals("thai")){

v3=true;
  
}
}
for(int i=0; i < cookingTime.length; i++){

//check if string array contains the string
if(cookingTime[i].equals("1 hour")){

  
v4=true;
 
  
}
}
mealType= new String[]{"nothing"};
for(int i=0; i < mealType.length; i++){

//check if string array contains the string
if(mealType[i].equals("dinner")||mealType[i].equals("appetizers")){

v5=true;
  System.out.println("mealtype");
  
}
}
if(nv){
	nv=false;
	resp.sendRedirect("ChickenTikka.html");
}
else if(food /*&& cookex||cuisinecheck||cooktimecheck||mealcheck*/){
	food=false;
	resp.sendRedirect("frenchomlette.html");
}

else if(v1 && v2||v3||v4||v5){
	v1=false;
	resp.sendRedirect("VeganWanton.html");
}
else{
	resp.sendRedirect("VeganWanton.html");
	//resp.sendRedirect("page3.html");
}
		
	}
	/*else if("Ask Chef Oracle 2".equalsIgnoreCase(result))
	{
				resp.sendRedirect("page3.html");
	}
	else if("Ask Chef Oracle 3".equalsIgnoreCase(result))
	{
		
		resp.sendRedirect("page3.html");
	}
	else if("Ask Chef Oracle 4".equalsIgnoreCase(result))
	{
		
		resp.sendRedirect("page3.html");
	}*/
	


}
}
