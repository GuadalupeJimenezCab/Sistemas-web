package mx.uv.s180;
import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        port(2020);
        get("/", (req,res)->"Hola desde Spark, prueba de la práctica 5;)");
    }
}
