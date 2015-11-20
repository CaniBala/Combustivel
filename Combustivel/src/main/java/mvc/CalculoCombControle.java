package mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/aaa")
public class CalculoCombControle extends HttpServlet {

  protected void service(
      HttpServletRequest req,
      HttpServletResponse resp)
      throws ServletException, IOException {

    String paramValorGasolina = req.getParameter("valorGasolina");
    Double valorGasolina = paramValorGasolina == null ? 0.0 : Double.parseDouble(paramValorGasolina);
    
    String paramValorAlcool = req.getParameter("valorAlcool");
    Double valorAlcool = paramValorAlcool == null ? 0.0 : Double.parseDouble(paramValorAlcool);


    CalculoCombModel cComb = new CalculoCombModel();
    cComb.setValorGasolina(valorGasolina);
    cComb.setValorAlcool(valorAlcool);
    cComb.valorResultado();
    cComb.resultado();
    
    /*nao sei se esta certo*/
    req.setAttribute("valorResultado", cComb); //Passando um objeto para o JSP.
    
    //Chamar o JSP apenas para mostrar o resultado.
    req.getRequestDispatcher("index.jsp").forward(req, resp);
  }

}