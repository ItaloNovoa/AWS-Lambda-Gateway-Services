/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.app;

import spark.Request;
import spark.Response;
import static spark.Spark.*;

public class SparkService {

    public static void main(String[] args) {
        get("/",(req,res) -> inicio(req,res));       
        get("/Square",(req,res) -> Cuadrado(req,res));
    }
    private static String inicio(Request req,Response res){
        return "<!DOCTYPE html>"
                    + "<html>\n"
                    + "    <head>\n"
                    + "        <title>AREP</title>\n"
                    + "    </head>\n"
                    + "\n"
                    + "    <body>        \n"
                    + "        <form action=\"/Square\" method=\"get\">\n"
                    + "            <h3>Ingresa numero</h3>\n"
                    + "            <input type=\"text\" name=\"cuadrado\" \n"
                    + "            <button>Click</button>\n"
                    + "             <p></p> \n"
                    + "            <input type=\"submit\" name=\"calcular\" \n>"
                    + "        </form>\n"
                    + "    </body>\n"
                    + "</html>";
    }

    private static int Cuadrado(Request req, Response res) {
        int num=Integer.parseInt(req.queryParams("cuadrado"));
        return num*num;
        
        
    }
    
}
