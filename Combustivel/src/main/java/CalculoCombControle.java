import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

WebServlet(value = "/combustivel")
public class CalculoCombControle extends HttpServlet {

  protected void service(
      HttpServletRequest req,
      HttpServletResponse resp)
      throws ServletException, IOException {

    String valorGasolina = req.getParameter("valorGasolina");
    //Double peso = paramPeso == null ? 0.0 : Double.parseDouble(paramPeso);
    
    String valorAlcool = req.getParameter("valorAlcool");
    //Double altura = paramAltura == null ? 0.0 : Double.parseDouble(paramAltura);

    CalculoCombModel cComb = new CalculoCombModel();
    cComb.setValorGasolina(valorGasolina);
    cComb.setValorAlcool(valorAlcool);
    
    req.setAttribute("combustivel", cComb); //Passando um objeto para o JSP.
    
    //Chamar o JSP apenas para mostrar o resultado.
    req.getRequestDispatcher("/index.jsp").forward(req, resp);
  }

}