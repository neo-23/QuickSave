package quickSave.controller;

import com.flickr4java.flickr.FlickrException;
import com.flickr4java.flickr.photos.Photo;
import com.flickr4java.flickr.photos.PhotoList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import quickSave.model.*;

public class HomeController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String searchText = request.getParameter("searchText");
            FlickrModel flickrModel = new FlickrModel();
            PhotoList<Photo> results = flickrModel.search(searchText);
            List<String> photoUrls = new ArrayList<String>();
            results.forEach(photo -> photoUrls.add(photo.getMediumUrl()));

            request.setAttribute("photoUrls", photoUrls);
            request.getRequestDispatcher("WEB-INF/view/home.jsp").forward(request, response);
        } catch (FlickrException flickrException){
            throw new ServletException("Something went wrong on flickr search");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
