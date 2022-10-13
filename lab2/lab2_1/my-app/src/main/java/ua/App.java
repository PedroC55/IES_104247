
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet(name = "MyFirstServlet", urlPatterns = {"/MyFirstServlet"})
public class App extends HttpServlet {
 
  private static final long serialVersionUID = -1915463532411657451L;
 
  @Override
  protected void doGet(HttpServletRequest request,
      HttpServletResponse response) throws ServletException, IOException 
  {
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
     
    String username = request.getParameter("username");
    String password = request.getParameter("password");
     
    boolean success = validateUser(username, password);
     
    try {
      // Write some content
      out.println("<html>");
      out.println("<head>");
      out.println("<title>LoginServlet</title>");
      out.println("</head>");
      out.println("<body>");
    
      if(success) {
        out.println("<h2>Welcome Friend</h2>");
      }else{
        out.println("<h2>Validate your self again.</h2>");
      }
       
      out.println("</body>");
      out.println("</html>");
    } finally {
      out.close();
    }
  }

  private Map<String, String> getData() 
  {
    Map<String, String> data = new HashMap<String, String>();
    data.put("username", "Guest");
    data.put("message",  "Welcome to my world !!");
    return data;
  }

  private Boolean validateUser(String username, String password){
      if (username == "Pedro" && password == "1234"){
          return true;
      }
      else{
          return false;
      }
  }
   
  @Override
  protected void doPost(HttpServletRequest request,
      HttpServletResponse response) throws ServletException, IOException {
    //Do some other work
  }
}