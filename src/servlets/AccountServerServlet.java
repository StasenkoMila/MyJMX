package servlets;

import server.AccountServer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AccountServerServlet extends HttpServlet {
    public static final String PAGE_URL = "/admin";
    private final AccountServer accountServer;

    public AccountServerServlet(AccountServer accountServer) {
        this.accountServer = accountServer;
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(accountServer.getUsersLimit());
    }
}
